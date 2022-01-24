package by.epam.java_introduction.final_module.library.dao;

import java.util.List;

import by.epam.java_introduction.final_module.library.bean.User;

public interface UserDAO {
	
	List<User> getUsers();
	boolean isExistLoginUser(String login);
	boolean authorization(String login, String password);	
	boolean registration(User newUser);	
	String encoder(String text);
	String decoder(String text);

}
