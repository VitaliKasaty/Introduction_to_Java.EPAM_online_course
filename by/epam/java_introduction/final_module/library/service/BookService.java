package by.epam.java_introduction.final_module.library.service;

import java.util.List;

import by.epam.java_introduction.final_module.library.bean.Book;



public interface BookService {
	
	public List<Book> getBooks();
	Book readBook(Book book);
	List<Book> findBookByAuthor(String author);
	List<Book> findBookByYearPublishing(int yearPublishing);	
	List<Book> findBookByTitle(String title);
	

}
