package by.epam.java_introduction.final_module.library.service;

import by.epam.java_introduction.final_module.library.bean.User;

public interface UserService {
	
	boolean authorization(String login, String password, boolean checkAdmin);	
	boolean registration(User user);
	boolean isEmptyLogin(String login);
	boolean isCorrectEmail(String email);	
	
}
