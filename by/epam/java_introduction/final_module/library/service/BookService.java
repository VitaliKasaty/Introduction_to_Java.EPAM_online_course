package by.epam.java_introduction.final_module.library.service;

import java.util.List;
import by.epam.java_introduction.final_module.library.bean.Book;

public interface BookService {	
	List<Book> getBooks() throws ServiceException;
	Book getBook(int numBook) throws ServiceException;
	List<Book> findBookByAuthor(String author) throws ServiceException;
	List<Book> findBookByYearPublishing(int yearPublishing) throws ServiceException;	
	List<Book> findBookByTitle(String title) throws ServiceException;	
}
