package by.epam.java_introduction.final_module.library.controller.impl;

import by.epam.java_introduction.final_module.library.bean.User;
import by.epam.java_introduction.final_module.library.controller.UserController;
import by.epam.java_introduction.final_module.library.service.ServiceProvider;
import by.epam.java_introduction.final_module.library.service.UserService;

public class UserControllerImpl implements UserController{

	@Override
	public boolean doAction(String request) {
		
		ServiceProvider provider = ServiceProvider.getInstance();
		UserService userService = provider.getUserService();
		
		boolean result = false;
		String commandName;
		String login;
		String password;
		commandName = request.split(" ")[0];
		login = request.split(" ")[1];
		password = request.split(" ")[2];
		
		switch(commandName) {
		
			case "login":				
				result = userService.authorization(login, password);
				break;
				
			case "registration":
				User newUser = new User(login, password);
				result = userService.registration(newUser);
				break;
				
		}
		
	return result;
	
	}
}
