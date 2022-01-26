package by.epam.java_introduction.final_module.library.controller.impl;

import java.util.List;

import by.epam.java_introduction.final_module.library.bean.Book;
import by.epam.java_introduction.final_module.library.bean.User;
import by.epam.java_introduction.final_module.library.controller.BookController;
import by.epam.java_introduction.final_module.library.service.BookService;
import by.epam.java_introduction.final_module.library.service.ServiceProvider;

public class BookControllerImpl implements BookController{

	@Override
	public List<Book> doAction(String request) {
		
		ServiceProvider provider = ServiceProvider.getInstance();
		BookService bookService = provider.getBookService();
		
		List<Book> result = null;
		String commandName;
		String parameterToFind;
		
		commandName = request.split("=")[0];
		
		
		
		switch(commandName) {
		
		case "printBooks":				
			result = bookService.getBooks();
			break;
			
		case "findByAuthor":
			parameterToFind = request.split("=")[1]; 
			result = bookService.findBookByAuthor(parameterToFind);
			break;
			
		case "findByTitle":	
			parameterToFind = request.split("=")[1]; 
			result = bookService.findBookByTitle(parameterToFind);
			break;
			
		case "findByYear":
			parameterToFind = request.split("=")[1]; 
			result = bookService.findBookByYearPublishing(Integer.parseInt(parameterToFind));
			break;
				
		}
		
		return result;
	}

}
