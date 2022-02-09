package by.epam.java_introduction.final_module.library.service;



import by.epam.java_introduction.final_module.library.bean.Book;
import by.epam.java_introduction.final_module.library.bean.Library;

public interface LibraryService {
	
	Library getLibrary();
	boolean saveLibrary(Library library);
	boolean suggestToAddBook(String text);
	boolean addBook(Book Book);
	boolean editBook(int numBook, Book Book);
	boolean deleteBook(int numBook);
	boolean sendEmailNotification(String heading, String text);

}
