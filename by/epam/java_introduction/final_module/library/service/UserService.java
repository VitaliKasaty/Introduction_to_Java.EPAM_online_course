package by.epam.java_introduction.final_module.library.service;

import by.epam.java_introduction.final_module.library.bean.User;

public interface UserService {
	
	public boolean authorization(String login, String password);
	public boolean registration(User user);

}
