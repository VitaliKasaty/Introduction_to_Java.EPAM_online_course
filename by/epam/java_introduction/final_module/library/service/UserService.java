package by.epam.java_introduction.final_module.library.service;

import by.epam.java_introduction.final_module.library.bean.User;

public interface UserService {	
	boolean authorization(String login, String password, boolean checkAdmin) throws ServiceException;	
	boolean registration(User user) throws ServiceException;
	boolean isEmptyLogin(String login) throws ServiceException;
	boolean isEmptyEmail(String email) throws ServiceException;
	boolean isCorrectEmail(String email);
}
