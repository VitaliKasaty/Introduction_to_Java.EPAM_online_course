package by.epam.java_introduction.final_module.library.presentation;

import java.util.List;
import java.util.Scanner;

import by.epam.java_introduction.final_module.library.bean.Book;
import by.epam.java_introduction.final_module.library.controller.BookController;
import by.epam.java_introduction.final_module.library.controller.ControllerProvider;
import by.epam.java_introduction.final_module.library.controller.LibraryController;
//import by.epam.java_introduction.final_module.library.controller.LibraryController;
import by.epam.java_introduction.final_module.library.controller.UserController;

public class UserOption {
	
	ControllerProvider controllerProvider = ControllerProvider.getInstance();	
	UserController userController = controllerProvider.getUserController();
	
	LibraryController libraryController = controllerProvider.getLibraryController();	
	BookController bookController = controllerProvider.getBookController();
	
	PrintPresentation print = new PrintPresentation();
	
	Scanner sc = new Scanner(System.in);
	
	public void menu()	{
		
		String optionInLibrary = """
				1)Просмотр списка книг.
				2)Поиск книг в каталоге.
				3)Предложить администратору добавить книгу.
				4)Выход из библиотеки.
				""";
		
		boolean isAuthInLibrary = true;
		
		while(isAuthInLibrary) {
			System.out.println(optionInLibrary);
			String userInput = sc.nextLine();
			
			switch(userInput) {
			
			case "1":				
				print.printBooks(bookController.doAction("getBooks"));
				readingRoom(bookController.doAction("getBooks")); 
				break;
				
			case "2":
				findBooks();
				
				break;	
				
			case "3":
				System.out.println("Напишите какую книгу вы бы хотели видеть?");
				String text = sc.nextLine();
				if (libraryController.suggestToAddBook(text)) {
					System.out.println("Ваше предложение успешно отправлено на email администратору.\n");					
				} else {
					System.out.println("Извините, отправить сообщение администратору временно невозможно.\n");
				}				
				break;
				
			case "4":
				isAuthInLibrary = false;
				break;	
				
			default: 
				System.out.println("Такой команды нет, выберите подходящий вариант.\n");
				
			}		
		}	
		
	}
	
	public void readingRoom(List<Book> books) {
		
		String optionInReadingRoom = """
				*Чтобы прочесть книгу введите её номер.
				*Чтобы вернуться меню введите "back".
				""";
		
		boolean isAuthInReadingRoom = true;
		String userInput = "";
		int numBook;
		
		while (isAuthInReadingRoom) {
			System.out.println(optionInReadingRoom);
			if (sc.hasNextInt()) {
				numBook = sc.nextInt();
				if (numBook > books.size() || numBook < 1) {
					System.out.println("Книги с таким номером не существует.");
				} else {
					print.readBook(books.get(numBook - 1));
				}
				sc.nextLine();
			} else {
				System.out.println("Такой команды нет.");
				userInput = sc.nextLine();
			}
			if (userInput.equals("back")) {
				isAuthInReadingRoom = false;
			}
		}	
	}
	
	public void findBooks() {
				
		boolean isEndFinding = false;
		List<Book> result;
		
		String typeSearchMenu = """
				1) Поиск книг по автору.
				2) Поиск книг по названию.
				3) Поиск книг по году выпуска.
				4) Выйти из поиска.
				""";
		
		while(!isEndFinding) {
			System.out.println(typeSearchMenu);
			String userInput = sc.nextLine();
			
			switch(userInput) {
		 
				case "1":			
					System.out.println("Введите автора.");
					String author = sc.nextLine();				
					result = bookController.doAction("findByAuthor=" + author);				
					if (result.size() != 0) {
						print.printBooks(result);
						readingRoom(result);
					} else {
						System.out.println("Книг с таким автором не найдено!");
					}						
					break;
			
				case "2":
			
					System.out.println("Введите название книги.");
					String title = sc.nextLine();				
					result = bookController.doAction("findByTitle=" + title);				
					if (result.size() != 0) {
						print.printBooks(result);
						readingRoom(result);
					} else {
						System.out.println("Книг с таким названием не найдено!");
					}
					break;
			
				case "3":				
					System.out.println("Введите год издания.");
					while (!sc.hasNextInt()) {
						System.out.println("Это должно быть число, повторите ввод!");
						
						sc.nextLine();
					}
					String year = sc.nextLine();
			
					result = bookController.doAction("findByYear=" + year);				
					if (result.size() != 0) {
						print.printBooks(result);
						readingRoom(result);
					} else {
						System.out.println("Книг с таким годом выпуска не найдено!");
					}
					break;			
			
				case "4":
					isEndFinding = true;
					
				default: 
					System.out.println("Такой команды нет, выберите подходящий вариант.\n");

			}			
		
		}

	}
	
	
	
	

}
