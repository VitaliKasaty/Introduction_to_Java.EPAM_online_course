package by.epam.java_introduction.final_module.library.dao;

import by.epam.java_introduction.final_module.library.dao.impl.LibraryDaoImpl;
import by.epam.java_introduction.final_module.library.dao.impl.UserDAOImpl;

public final class DAOProvider {
	
	private static final DAOProvider instance = new DAOProvider();
	
	private UserDAO userDAO = new UserDAOImpl();
	private LibraryDAO libraryDAO = new LibraryDaoImpl(); 
	
	private DAOProvider() {
		
	}
	
	public static DAOProvider getInstance() {
		return instance;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public LibraryDAO getLibraryDAO() {
		return libraryDAO;
	}

	public void setLibraryDAO(LibraryDAO libraryDAO) {
		this.libraryDAO = libraryDAO;
	}	
	
	

}
