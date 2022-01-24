package by.epam.java_introduction.final_module.library.presentation;

import java.util.Scanner;

import by.epam.java_introduction.final_module.library.bean.Library;
import by.epam.java_introduction.final_module.library.controller.UserController;
import by.epam.java_introduction.final_module.library.service.impl.HomeLibraryServiceImpl;
import by.epam.java_introduction.final_module.library.controller.ControllerProvider;
import by.epam.java_introduction.final_module.library.controller.LibraryController;


public class ConsoleMenu {
	
	ControllerProvider controllerProvider = ControllerProvider.getInstance();
	
	UserController userController = controllerProvider.getUserController();
	
	LibraryController libraryController = controllerProvider.getLibraryController();
	
		String enterMenu = """
				Введите число:
				1)Авторизация.
				2)Регистрация нового пользователя.
				3)Выход.				
				""";
		
		String optionInLibrary = """
				1)Просмотр списка книг.
				2)Выход.
				""";
		Scanner sc = new Scanner(System.in);
		
		public void startProgramm() {
			
			boolean isEndProgramm = false;
			//Library library = libraryController.loadLibrary();
			HomeLibraryServiceImpl.library = libraryController.loadLibrary();
			
			
			
			while(!isEndProgramm) {
				System.out.println(enterMenu);
				String userInput = sc.nextLine();
				
				switch(userInput) {
				
					case "1":
						if (loginInLibrary()) {
							System.out.println(HomeLibraryServiceImpl.library);
							System.out.println(optionInLibrary);
							
						}
						break;
					case "2":
						if (registrationInLibrary()) {
							System.out.println(optionInLibrary);
						}
						break;
					case "3":
						System.out.println("До свидания!");
						System.exit(0);
					
				}
				
				
			}
						
			
		}
		
	public boolean workWithLibrary(Library library)	{
		
		boolean isAuthInLibrary = true;
		
		while(isAuthInLibrary) {
			System.out.println(optionInLibrary);
			String userInput = sc.nextLine();
			
			switch(userInput) {
			
				case "1":
					System.out.println("Список книг:");
					//libraryController.
					break;
				case "2":
					isAuthInLibrary = false;				
				
			}
			
			
		}
		
		
		
		return false;
	}
	
	
	public boolean loginInLibrary() {
		
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
	
	public boolean registrationInLibrary() {
		
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
	

}
