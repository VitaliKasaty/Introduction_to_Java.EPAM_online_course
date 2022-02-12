package by.epam.java_introduction.final_module.library.controller.impl;

import by.epam.java_introduction.final_module.library.bean.Book;
import by.epam.java_introduction.final_module.library.controller.LibraryController;
import by.epam.java_introduction.final_module.library.service.BookService;
import by.epam.java_introduction.final_module.library.service.LibraryService;
import by.epam.java_introduction.final_module.library.service.ServiceException;
import by.epam.java_introduction.final_module.library.service.ServiceProvider;


public class LibraryControllerImpl implements LibraryController{
	
	ServiceProvider provider = ServiceProvider.getInstance();
	LibraryService libraryService = provider.getLibraryService();
	BookService bookService = provider.getBookService();

	@Override
	public boolean suggestToAddBook(String text) {
		try {
			return libraryService.suggestToAddBook(text);
		} catch (ServiceException e) {
			return false;
		}
	}

	@Override
	public boolean addBook(Book newBook) {
		try {
			return libraryService.addBook(newBook);
		} catch (ServiceException e) {
			return false;
		}	
	}

	@Override
	public boolean editBook(int numBook, Book editedBook) {		
		try {
			return libraryService.editBook(numBook, editedBook);
		} catch (ServiceException e) {
			return false;
		}		
	}

	@Override
	public boolean deleteBook(int numBook) {			
		try {
			return libraryService.deleteBook(numBook);
		} catch (ServiceException e) {
			return false;
		}		
	}

	@Override
	public boolean sendEmailNotification(String heading, String text) {			
		try {
			return libraryService.sendEmailNotification(heading, text);
		} catch (ServiceException e) {
			return false;
		}			
	}

}
