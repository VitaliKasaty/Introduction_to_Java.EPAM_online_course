package by.epam.java_introduction.final_module.library.dao;

import by.epam.java_introduction.final_module.library.bean.Library;

public interface LibraryDAO {
	
	boolean saveLibrary(Library library) throws DAOException;		
	Library getLibrary() throws DAOException;	
	String[] getLibraryEmail() throws DAOException;	

}
