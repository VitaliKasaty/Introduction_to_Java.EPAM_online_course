package by.epam.java_introduction.final_module.library.service.impl;

import by.epam.java_introduction.final_module.library.bean.User;
import by.epam.java_introduction.final_module.library.dao.DAOProvider;
import by.epam.java_introduction.final_module.library.dao.UserDAO;
import by.epam.java_introduction.final_module.library.service.UserService;

public class UserServiceImpl implements UserService{
	
	private final DAOProvider provider = DAOProvider.getInstance();

	@Override
	public boolean authorization(String login, String password) {
		UserDAO userDAO = provider.getUserDAO();
		boolean result = userDAO.authorization(login, password);
		return result;
	}

	@Override
	public boolean registration(User user) {
		UserDAO userDAO = provider.getUserDAO();
		boolean result = userDAO.registration(user);
		return result;
	}
	

}
