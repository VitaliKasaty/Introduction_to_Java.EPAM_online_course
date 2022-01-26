package by.epam.java_introduction.final_module.library.presentation;

import java.util.Scanner;

import by.epam.java_introduction.final_module.library.controller.BookController;
import by.epam.java_introduction.final_module.library.controller.ControllerProvider;
import by.epam.java_introduction.final_module.library.controller.LibraryController;
import by.epam.java_introduction.final_module.library.controller.UserController;

public class ConsolePresentation {
	
	ControllerProvider controllerProvider = ControllerProvider.getInstance();
	
	UserController userController = controllerProvider.getUserController();
	
	LibraryController libraryController = controllerProvider.getLibraryController();
	
	BookController bookController = controllerProvider.getBookController();
	
	Scanner sc = new Scanner(System.in);
	

	
	


}
