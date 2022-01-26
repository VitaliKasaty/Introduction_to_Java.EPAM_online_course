package by.epam.java_introduction.final_module.library.presentation;

import java.util.List;
import java.util.Scanner;

import by.epam.java_introduction.final_module.library.bean.Book;
import by.epam.java_introduction.final_module.library.controller.BookController;
import by.epam.java_introduction.final_module.library.controller.ControllerProvider;
import by.epam.java_introduction.final_module.library.controller.LibraryController;
import by.epam.java_introduction.final_module.library.controller.UserController;

public class OptionLibrary {
	
	ControllerProvider controllerProvider = ControllerProvider.getInstance();	
	UserController userController = controllerProvider.getUserController();
	
	LibraryController libraryController = controllerProvider.getLibraryController();	
	BookController bookController = controllerProvider.getBookController();
	
	PrintPresentation print = new PrintPresentation();
	ConsolePresentation console = new ConsolePresentation();
	
	Scanner sc = new Scanner(System.in);
	
	
	
	
	public boolean authorization() {
		
		boolean isEntered = false;
		
		System.out.println("Введите логин");
		String login = sc.nextLine();
		System.out.println("Введите пароль");
		String password = sc.nextLine();			
		isEntered =  userController.doAction("login " + login + " " + password);
		
		if (isEntered) {
			System.out.println("Авторизация прошла успешна!");
		} else {
			System.out.println("Неудачная авторизация!");
		}
		
		return isEntered;	
		
	}
	
	public boolean registration() {
		
		boolean isRegistrated = false;		
		
		System.out.println("Введите логин");
		String login = sc.nextLine();
		System.out.println("Введите пароль");
		String password = sc.nextLine();
		
		isRegistrated =  userController.doAction("registration " + login + " " + password); 
		if (isRegistrated) {
			System.out.println("Регистрация прошла успешна!");
		} else {
			System.out.println("Данный пользователь занят!");
		}
		
		return isRegistrated;
	}
	
	public void menuInLibrary()	{
		
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
				print.printBooks(bookController.doAction("printBooks"));
				break;
			case "2":
				findBooks();
				break;	
			case "4":
				isAuthInLibrary = false;
				break;				
			}		
		}	
		
	}
	
	public void findBooks() {
				
		boolean isEndFinding = false;
		List<Book> result;
		
		String typeSearchMenu = """
				1)Поиск книг по автору.
				2)Поиск книг по названию.
				3)Поиск книг по году выпуска.
				4)Выйти из поиска.
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
					} else {
						System.out.println("Книг с таким названием не найдено!");
					}
					break;
			
				case "3":				
					System.out.println("Введите год издания.");
					while(!sc.hasNextInt()) {
						System.out.println("Это должно быть число, повторите ввод!");
						sc.nextLine();
					}
					String year = sc.nextLine();
			
					result = bookController.doAction("findByYear=" + year);				
					if (result.size() != 0) {
						print.printBooks(result);
					} else {
						System.out.println("Книг с таким годом выпуска не найдено!");
					}
					break;			
			
				case "4":
					isEndFinding = true;		
			}			
		
		}

	}
	
	
	
	

}
