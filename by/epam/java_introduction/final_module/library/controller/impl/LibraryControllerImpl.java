package by.epam.java_introduction.final_module.library.controller.impl;

import by.epam.java_introduction.final_module.library.bean.Library;
import by.epam.java_introduction.final_module.library.bean.User;
import by.epam.java_introduction.final_module.library.controller.LibraryController;
import by.epam.java_introduction.final_module.library.service.LibraryService;
import by.epam.java_introduction.final_module.library.service.ServiceProvider;
import by.epam.java_introduction.final_module.library.service.UserService;

public class LibraryControllerImpl implements LibraryController{

	@Override
	public void doAction(String request) {
		
		ServiceProvider provider = ServiceProvider.getInstance();
		LibraryService libraryService = provider.getLibraryService();
		
		
		String commandName;
		
		commandName = request.split(" ")[0];
		
		switch(commandName) {
		
			case "printBooks":				
				libraryService.getBooks(null);
				break;
				
			case "registration":
				
				break;
				
		}
		
		
	}
	
	public Library loadLibrary() {
		ServiceProvider provider = ServiceProvider.getInstance();
		LibraryService libraryService = provider.getLibraryService();
		
		return libraryService.loadLibrary();
	}

}
