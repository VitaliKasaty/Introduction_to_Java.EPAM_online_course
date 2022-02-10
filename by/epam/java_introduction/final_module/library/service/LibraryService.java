package by.epam.java_introduction.final_module.library.service;

import by.epam.java_introduction.final_module.library.bean.Book;
import by.epam.java_introduction.final_module.library.bean.Library;

public interface LibraryService {	
	Library getLibrary() throws ServiceException;
	boolean saveLibrary(Library library) throws ServiceException;
	boolean suggestToAddBook(String text) throws ServiceException;
	boolean addBook(Book Book) throws ServiceException;
	boolean editBook(int numBook, Book Book) throws ServiceException;
	boolean deleteBook(int numBook) throws ServiceException;
	boolean sendEmailNotification(String heading, String text) throws ServiceException;
	String[] getLibraryEmailData() throws ServiceException;
}
