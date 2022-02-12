package by.epam.java_introduction.final_module.library.controller;

import by.epam.java_introduction.final_module.library.bean.Book;

public interface LibraryController {
	boolean suggestToAddBook(String text);
	boolean addBook(Book newBook);
	boolean editBook(int numBook, Book editedBook);	
	boolean deleteBook(int numBook);
	boolean sendEmailNotification(String heading, String text);
}
