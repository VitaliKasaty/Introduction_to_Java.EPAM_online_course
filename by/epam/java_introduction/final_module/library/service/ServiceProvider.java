package by.epam.java_introduction.final_module.library.service;

import by.epam.java_introduction.final_module.library.service.impl.HomeLibraryServiceImpl;
import by.epam.java_introduction.final_module.library.service.impl.UserServiceImpl;

public class ServiceProvider {
	
	private static final ServiceProvider instance = new ServiceProvider();
	
	private final UserService userService = new UserServiceImpl();
	private final LibraryService libraryService = new HomeLibraryServiceImpl();
	
	public LibraryService getLibraryService() {
		return libraryService;
	}

	private ServiceProvider() {
		
	}
	
	public static ServiceProvider getInstance() {
		return instance;
	}	

	public UserService getUserService() {
		return userService;
	}
	
	
	

}
