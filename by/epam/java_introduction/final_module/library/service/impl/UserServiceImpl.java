package by.epam.java_introduction.final_module.library.service.impl;

import java.util.List;

import by.epam.java_introduction.final_module.library.bean.User;
import by.epam.java_introduction.final_module.library.dao.DAOProvider;
import by.epam.java_introduction.final_module.library.dao.UserDAO;
import by.epam.java_introduction.final_module.library.service.UserService;

public class UserServiceImpl implements UserService{
	
	private final DAOProvider provider = DAOProvider.getInstance();

	@Override
	public boolean authorization(String login, String password, boolean checkAdmin) {
		UserDAO userDAO = provider.getUserDAO();
		boolean result = userDAO.authorization(login, password, checkAdmin);
		return result;
	}
	
	@Override
	public boolean registration(User user) {
		UserDAO userDAO = provider.getUserDAO();
		boolean result = userDAO.registration(user);
		return result;
	}

	@Override
	public boolean isEmptyLogin(String login) {		
		UserDAO userDAO = provider.getUserDAO();
		List<User> users = userDAO.getUsers();
		
		for (User user : users) {
			if (user.getLogin().equals(login)) {
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
