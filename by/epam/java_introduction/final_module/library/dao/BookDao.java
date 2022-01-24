package by.epam.java_introduction.final_module.library.dao;

import by.epam.java_introduction.final_module.library.bean.Book;

public interface BookDao {
	
	Book getBook(Book book, int num);
	void editBook(Book book, int num);	
	void addBook(Book book);
	void deleteBook(Book book, int num);

}
