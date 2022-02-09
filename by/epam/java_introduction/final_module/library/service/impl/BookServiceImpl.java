package by.epam.java_introduction.final_module.library.service.impl;


import java.util.List;
import java.util.stream.Collectors;

import by.epam.java_introduction.final_module.library.bean.Book;
import by.epam.java_introduction.final_module.library.dao.DAOProvider;
import by.epam.java_introduction.final_module.library.dao.LibraryDAO;
import by.epam.java_introduction.final_module.library.service.BookService;


public class BookServiceImpl implements BookService{
	
	private final DAOProvider provider = DAOProvider.getInstance();

	@Override
	public List<Book> getBooks() {
		LibraryDAO libraryDAO = provider.getLibraryDAO();		
		return libraryDAO.getLibrary().getLibraryBooks();
	}

	@Override
	public Book getBook(int numBook) {		
		return getBooks().get(numBook + 1);
	}

	@Override
	public List<Book> findBookByAuthor(String author) {
		List<Book> findByAuthorBooks;
		findByAuthorBooks = getBooks().stream().filter(book -> book.getAuthor().equalsIgnoreCase(author)).collect(Collectors.toList());
		return findByAuthorBooks;
	}

	@Override
	public List<Book> findBookByYearPublishing(int yearPublishing) {
		List<Book> findByAuthorBooks;
		findByAuthorBooks = getBooks().stream().filter(book -> book.getYearPublishing() == yearPublishing).collect(Collectors.toList());
		return findByAuthorBooks;
	}

	@Override
	public List<Book> findBookByTitle(String title) {
		List<Book> findByAuthorBooks;
		findByAuthorBooks = getBooks().stream().filter(book -> book.getTitle().equalsIgnoreCase(title)).collect(Collectors.toList());
		return findByAuthorBooks;
	}
	


}
