package by.epam.java_introduction.final_module.library.dao;

import java.util.List;

import by.epam.java_introduction.final_module.library.bean.User;

public interface UserDAO {	
	List<User> getUsers() throws DAOException;
	boolean authorization(String login, String password, boolean checkAdmin) throws DAOException;
	boolean registration(User newUser) throws DAOException;
	String md5Hash(String password) throws DAOException;
}
