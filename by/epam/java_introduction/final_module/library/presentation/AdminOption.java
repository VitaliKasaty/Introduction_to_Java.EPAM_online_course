package by.epam.java_introduction.final_module.library.presentation;

import java.util.List;
import java.util.Scanner;

import by.epam.java_introduction.final_module.library.bean.Book;
import by.epam.java_introduction.final_module.library.bean.ElectronicBook;
import by.epam.java_introduction.final_module.library.bean.PaperBook;
import by.epam.java_introduction.final_module.library.controller.BookController;
import by.epam.java_introduction.final_module.library.controller.ControllerProvider;
import by.epam.java_introduction.final_module.library.controller.LibraryController;

public class AdminOption {
	
	ControllerProvider controllerProvider = ControllerProvider.getInstance();
	LibraryController libraryController = controllerProvider.getLibraryController();
	BookController bookController = controllerProvider.getBookController();
	PrintPresentation print = new PrintPresentation();
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		
		String optionInLibrary = """
				Выберите действие.
				1)Добавить книгу.				
				2)Удалить книгу.
				3)Выход из библиотеки.
				""";
		boolean isAuthInLibrary = true;
		
		while (isAuthInLibrary) {
			System.out.println(optionInLibrary);
			String userInput = sc.nextLine();
			
			switch (userInput) {
			
				case "1":				
					if (addBook()) {
						System.out.println("Книга успешно добавлена. Пользователям отправлено сообщение о пуступлении книги.\n");
					} else {
						System.out.println("Произошла ошибка либо операция была отменена.\n");
					}
					break;
					
				case "2":
					if (deletebook()) {
						System.out.println("Книга успешно удалена.\n");
					} else {
						System.out.println("Произошла ошибка либо операция была отменена.\n");
					}
					break;
					
				case "3":
					isAuthInLibrary = false;
					break;				
			}		
		}
	}
	
	public boolean deletebook() {	
		
		String typeMenu = "Введите номер книги для удаления, чтобы вернуться назад введите \"back\".\n";
		int numBook;
		List<Book> books;
		
		while (true) {
			
			books = bookController.doAction("getBooks");
			print.printBooks(books);
			System.out.println(typeMenu);
			
			if (sc.hasNextInt()) {
				numBook = sc.nextInt();
				if ((numBook > books.size()) || (numBook < 1)) {
					System.out.println("Книги с таким номером не существует.\n");					
				} else {
					libraryController.deleteBook(numBook - 1);	
					sc.nextLine();
					return true;					
				}
				sc.nextLine();
				
			} else if (sc.nextLine().equals("back")) {				
				return false;
			} else {				
				System.out.println("Такой команды нет, повторите ввод.\n");
			}
		}
	}
	
	public boolean addBook() {
		
		String typeMenu = """
				Какой тип книги вы хотите добавить?
				1)Бумажный вариант.
				2)Электронный вариант.
				3)Вернуться назад.
				""";		
		
		int typeBook = 0;
		Book book = null;
		boolean isCorrectType = false;
		String title = "";
		String author = "";
		int yearPublishing = 0;
		
		while (!isCorrectType) {
			
			System.out.println(typeMenu);
			String userInput = sc.nextLine();
			
			switch (userInput) {
			
				case "1":
					typeBook = 1;
					isCorrectType = true;
					break;
				
				case "2":
					typeBook = 2;
					isCorrectType = true;
					break;						
				
				case "3":
					return false;
				
				default:
					System.out.println("Такого пункта нет.");
					
			}			
		}
		
		if (typeBook == 1 || typeBook == 2) {	
			
			System.out.println("Введите название:");
			title = sc.nextLine();
			System.out.println("Введите автора:");
			author = sc.nextLine();
			System.out.println("Введите год издания:");
			
			while (!sc.hasNextInt()) {
				System.out.println("Должно быть число");
			}
			
			yearPublishing = sc.nextInt();
			sc.nextLine();
				
			if (typeBook == 1) {
				System.out.println("Введите описание. Чтобы окончить ввод - повторно нажмите enter.");
				String text = "";
				while (true) {
					String line = sc.nextLine();
					if (!line.equals("")) {
						text += line + "\n";
					} else {
						text = text.trim();
						break;
					}				
				}	
				book = new PaperBook(title, author, yearPublishing, text);				 
			} else {
				System.out.println("Введети url адресс книги");
				String urlAdress = sc.nextLine();
				book = new ElectronicBook(title, author, yearPublishing, urlAdress);
			}
		}
		
		if (libraryController.addBook(book)) {
			String text = "Was added book: " + title + " by " + author + ", " + yearPublishing + ".";
			libraryController.sendEmailNotification("New book in HomeLibrary", text);
			return true;
		} else {
			return false;
		}
	}
	

}
