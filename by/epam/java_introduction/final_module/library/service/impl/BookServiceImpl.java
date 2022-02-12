package by.epam.java_introduction.final_module.library.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import by.epam.java_introduction.final_module.library.bean.Book;
import by.epam.java_introduction.final_module.library.dao.DAOException;
import by.epam.java_introduction.final_module.library.dao.DAOProvider;
import by.epam.java_introduction.final_module.library.dao.LibraryDAO;
import by.epam.java_introduction.final_module.library.service.BookService;
import by.epam.java_introduction.final_module.library.service.ServiceException;

public class BookServiceImpl implements BookService {

	private final DAOProvider provider = DAOProvider.getInstance();

	@Override
	public List<Book> getBooks() throws ServiceException {
		LibraryDAO libraryDAO = provider.getLibraryDAO();

		try {
			return libraryDAO.getLibrary().getLibraryBooks();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public Book getBook(int numBook) throws ServiceException {
		return getBooks().get(numBook + 1);
	}

	@Override
	public List<Book> findBookByAuthor(String author) throws ServiceException {
		List<Book> findByAuthorBooks;
		findByAuthorBooks = getBooks().stream().filter(book -> book.getAuthor().equalsIgnoreCase(author))
				.collect(Collectors.toList());
		return findByAuthorBooks;
	}

	@Override
	public List<Book> findBookByYearPublishing(int yearPublishing) throws ServiceException {
		List<Book> findByAuthorBooks;
		findByAuthorBooks = getBooks().stream().filter(book -> book.getYearPublishing() == yearPublishing)
				.collect(Collectors.toList());
		return findByAuthorBooks;
	}

	@Override
	public List<Book> findBookByTitle(String title) throws ServiceException {
		List<Book> findByAuthorBooks;
		findByAuthorBooks = getBooks().stream().filter(book -> book.getTitle().equalsIgnoreCase(title))
				.collect(Collectors.toList());
		return findByAuthorBooks;
	}
	

}
