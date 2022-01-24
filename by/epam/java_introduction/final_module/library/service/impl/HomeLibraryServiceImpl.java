package by.epam.java_introduction.final_module.library.service.impl;

import java.util.List;

import by.epam.java_introduction.final_module.library.bean.Library;
import by.epam.java_introduction.final_module.library.dao.DAOProvider;
import by.epam.java_introduction.final_module.library.dao.LibraryDAO;
import by.epam.java_introduction.final_module.library.service.LibraryService;

public class HomeLibraryServiceImpl implements LibraryService{
	
	public static Library library;
	
	private final DAOProvider provider = DAOProvider.getInstance();

	@Override
	public Library loadLibrary() {		
		LibraryDAO libraryDAO = provider.getLibraryDAO();
		return libraryDAO.loadLibraryFromFile();
	}

	@Override
	public List<?> getBooks(Library library) {
		
		return library.getLibraryBooks();
	}
	
	

}
