package by.epam.java_introduction.final_module.library.controller.impl;

import java.util.List;
import by.epam.java_introduction.final_module.library.bean.Book;
import by.epam.java_introduction.final_module.library.controller.BookController;
import by.epam.java_introduction.final_module.library.service.BookService;
import by.epam.java_introduction.final_module.library.service.ServiceException;
import by.epam.java_introduction.final_module.library.service.ServiceProvider;

public class BookControllerImpl implements BookController{
	
	ServiceProvider provider = ServiceProvider.getInstance();
	BookService bookService = provider.getBookService();

	@Override
	public List<Book> doAction(String request) {		
		
		List<Book> result = null;
		String commandName;
		String parameterToFind;
		
		commandName = request.split("=")[0];		
		
		
		switch(commandName) {
		
		case "getBooks":				
			try {
				result = bookService.getBooks();
			} catch (ServiceException e) {
				return null;
			}
			break;
			
		case "findByAuthor":
			parameterToFind = request.split("=")[1]; 
			try {
				result = bookService.findBookByAuthor(parameterToFind);
			} catch (ServiceException e) {
				return null;
			}
			break;
			
		case "findByTitle":	
			parameterToFind = request.split("=")[1]; 
			try {
				result = bookService.findBookByTitle(parameterToFind);
			} catch (ServiceException e) {
				return null;
			}
			break;
			
		case "findByYear":
			parameterToFind = request.split("=")[1]; 
			try {
				result = bookService.findBookByYearPublishing(Integer.parseInt(parameterToFind));
			} catch (NumberFormatException e) {
				return null;
			} catch (ServiceException e) {
				return null;
			}
			break;
			
		}
		
		return result;
	}


	
	

}
