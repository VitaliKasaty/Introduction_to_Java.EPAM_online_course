package by.epam.java_introduction.final_module.library.presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.epam.java_introduction.final_module.library.bean.Book;
import by.epam.java_introduction.final_module.library.bean.Library;
import by.epam.java_introduction.final_module.library.controller.UserController;
import by.epam.java_introduction.final_module.library.service.impl.HomeLibraryServiceImpl;
import by.epam.java_introduction.final_module.library.controller.BookController;
import by.epam.java_introduction.final_module.library.controller.ControllerProvider;
import by.epam.java_introduction.final_module.library.controller.LibraryController;


public class MenuPresentation {
	
	ControllerProvider controllerProvider = ControllerProvider.getInstance();	
	UserController userController = controllerProvider.getUserController();
	
	LibraryController libraryController = controllerProvider.getLibraryController();	
	BookController bookController = controllerProvider.getBookController();
	
	PrintPresentation print = new PrintPresentation();
	ConsolePresentation console = new ConsolePresentation();
		
		Scanner sc = new Scanner(System.in);
		
		public void startProgramm() {			
			
			boolean isEndProgramm = false;
			
			String enterMenu = """
					Введите число:
					1)Авторизация.
					2)Регистрация нового пользователя.
					3)Выход из программы.				
					""";	
			
			
			while(!isEndProgramm) {
				System.out.println(enterMenu);
				String userInput = sc.nextLine();
				
				switch(userInput) {
				
					case "1":
						//if (authorization()) {
						// menuInLibrary();
						//}						
						break;
					case "2":
						//if (registration()) {
						//	menuInLibrary();
						//}
						break;
					case "3":
						System.out.println("До свидания!");
						System.exit(0);
					
				}				
				
			}						
			
		}	
		
		
		
		
		



		
		

}
