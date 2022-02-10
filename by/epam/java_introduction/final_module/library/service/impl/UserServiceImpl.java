package by.epam.java_introduction.final_module.library.service.impl;

import java.util.List;

import by.epam.java_introduction.final_module.library.bean.User;
import by.epam.java_introduction.final_module.library.dao.DAOException;
import by.epam.java_introduction.final_module.library.dao.DAOProvider;
import by.epam.java_introduction.final_module.library.dao.UserDAO;
import by.epam.java_introduction.final_module.library.service.ServiceException;
import by.epam.java_introduction.final_module.library.service.UserService;

public class UserServiceImpl implements UserService{
	
	private final DAOProvider provider = DAOProvider.getInstance();

	@Override
	public boolean authorization(String login, String password, boolean checkAdmin) throws ServiceException{
		UserDAO userDAO = provider.getUserDAO();
		boolean result = false;
		try {
			result = userDAO.authorization(login, password, checkAdmin);
		} catch (DAOException e) {
			throw new ServiceException(e);			
		}
		return result;
	}
	
	@Override
	public boolean registration(User user) throws ServiceException {
		UserDAO userDAO = provider.getUserDAO();
		boolean result = false;
		try {
			result = userDAO.registration(user);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		return result;
	}

	@Override
	public boolean isEmptyLogin(String login) throws ServiceException {		
		UserDAO userDAO = provider.getUserDAO();
		List<User> users = null;
		try {
			users = userDAO.getUsers();
		} catch (DAOException e) {
			throw new ServiceException(e);			
		}
		
		for (User user : users) {
			if (user.getLogin().equalsIgnoreCase(login)) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public boolean isEmptyEmail(String email) throws ServiceException {
		UserDAO userDAO = provider.getUserDAO();
		List<User> users = null;
		try {
			users = userDAO.getUsers();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		
		for (User user : users) {
			if (user.getEmail().equalsIgnoreCase(email)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean isCorrectEmail(String email) {
		String regex = "^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$";		
		return email.matches(regex);
	}	
	

}
