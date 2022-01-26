package by.epam.java_introduction.final_module.library.service.impl;


import by.epam.java_introduction.final_module.library.bean.Library;
import by.epam.java_introduction.final_module.library.dao.DAOProvider;
import by.epam.java_introduction.final_module.library.dao.LibraryDAO;
import by.epam.java_introduction.final_module.library.service.LibraryService;

public class HomeLibraryServiceImpl implements LibraryService{
	
	
	
	private final DAOProvider provider = DAOProvider.getInstance();

	@Override
	public Library getLibrary() {		
		LibraryDAO libraryDAO = provider.getLibraryDAO();
		return libraryDAO.getLibrary();
	}

	@Override
	public void setLibrary(Library library) {
		LibraryDAO libraryDAO = provider.getLibraryDAO();
		libraryDAO.setLibrary(library);
		
	}
	

}
