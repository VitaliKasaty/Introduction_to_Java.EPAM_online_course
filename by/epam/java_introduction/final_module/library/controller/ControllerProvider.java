package by.epam.java_introduction.final_module.library.controller;

import by.epam.java_introduction.final_module.library.controller.impl.LibraryControllerImpl;
import by.epam.java_introduction.final_module.library.controller.impl.UserControllerImpl;

public class ControllerProvider {
	
	private static final ControllerProvider instance = new ControllerProvider();
	
	private UserController userController = new UserControllerImpl();
	private LibraryController libraryController = new LibraryControllerImpl();
	
	private ControllerProvider() {
		
	}

	public LibraryController getLibraryController() {
		return libraryController;
	}

	public void setLibraryController(LibraryController libraryController) {
		this.libraryController = libraryController;
	}

	public UserController getUserController() {
		return userController;
	}

	public void setUserController(UserController userController) {
		this.userController = userController;
	}

	public static ControllerProvider getInstance() {
		return instance;
	}

	
	
	

}
