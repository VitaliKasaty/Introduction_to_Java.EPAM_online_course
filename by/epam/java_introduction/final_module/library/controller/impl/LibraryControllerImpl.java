package by.epam.java_introduction.final_module.library.controller.impl;

import by.epam.java_introduction.final_module.library.bean.Book;
import by.epam.java_introduction.final_module.library.controller.LibraryController;
import by.epam.java_introduction.final_module.library.service.BookService;
import by.epam.java_introduction.final_module.library.service.LibraryService;
import by.epam.java_introduction.final_module.library.service.ServiceProvider;


public class LibraryControllerImpl implements LibraryController{
	
	ServiceProvider provider = ServiceProvider.getInstance();
	LibraryService libraryService = provider.getLibraryService();
	BookService bookService = provider.getBookService();


	@Override
	public boolean suggestToAddBook(String text) {
		return libraryService.suggestToAddBook(text);
	}



	@Override
	public boolean addBook(Book newBook) {		
		boolean result;		
		result = libraryService.addBook(newBook);		
		return result;
	}


	@Override
	public boolean editBook(int numBook, Book editedBook) {
		boolean result;
		result = libraryService.editBook(numBook, editedBook);
		return result;
	}



	@Override
	public boolean deleteBook(int numBook) {
		boolean result;		
		result = libraryService.deleteBook(numBook);
		return result;
	}



	@Override
	public boolean sendEmailNotification(String heading, String text) {
		boolean result;		
		result = libraryService.sendEmailNotification(heading, text);
		return result;
		
	}


	

}
