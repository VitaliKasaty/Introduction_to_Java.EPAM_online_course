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
	public Book readBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findBookByAuthor(String author) {
		List<Book> findByAuthorBooks;
		findByAuthorBooks = getBooks().stream().filter(book -> book.getAuthor().equals(author)).collect(Collectors.toList());
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
		findByAuthorBooks = getBooks().stream().filter(book -> book.getTitle().equals(title)).collect(Collectors.toList());
		return findByAuthorBooks;
	}

	




}
