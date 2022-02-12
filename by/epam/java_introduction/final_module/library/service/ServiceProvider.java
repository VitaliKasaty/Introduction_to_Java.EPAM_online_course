package by.epam.java_introduction.final_module.library.service;

import by.epam.java_introduction.final_module.library.service.impl.BookServiceImpl;
import by.epam.java_introduction.final_module.library.service.impl.LibraryServiceImpl;
import by.epam.java_introduction.final_module.library.service.impl.UserServiceImpl;

public class ServiceProvider {
	
	private static final ServiceProvider instance = new ServiceProvider();
	
	private final UserService userService = new UserServiceImpl();
	private final LibraryService libraryService = new LibraryServiceImpl();
	private final BookService bookService = new BookServiceImpl();	
	

	private ServiceProvider() {		
	}
	
	public LibraryService getLibraryService() {
		return libraryService;
	}

	public BookService getBookService() {
		return bookService;
	}
	
	public static ServiceProvider getInstance() {
		return instance;
	}	

	public UserService getUserService() {
		return userService;
	}

}
