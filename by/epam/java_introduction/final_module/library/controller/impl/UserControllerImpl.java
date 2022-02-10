package by.epam.java_introduction.final_module.library.controller.impl;

import by.epam.java_introduction.final_module.library.bean.User;
import by.epam.java_introduction.final_module.library.controller.UserController;
import by.epam.java_introduction.final_module.library.service.ServiceException;
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
		String email;
		commandName = request.split(" ")[0];

		
		switch(commandName) {
		
			case "loginUser":				

				login = request.split(" ")[1];
				password = request.split(" ")[2];
			try {
				result = userService.authorization(login, password, false);
			} catch (ServiceException e) {
				return false;
			}
				break;
				
			case "loginAdmin":		

				login = request.split(" ")[1];
				password = request.split(" ")[2];
			try {
				result = userService.authorization(login, password, true);
			} catch (ServiceException e) {
				return false;
			}
				break;
				
			case "registration":				

				login = request.split(" ")[1];
				password = request.split(" ")[2];				
				email = request.split(" ")[3];
				User newUser = new User(login, password, email);
			try {
				result = userService.registration(newUser);
			} catch (ServiceException e) {
				return false;
			}
				break;
				
			case "isEmptyLogin":
				
				login = request.split(" ")[1];
			try {
				result = userService.isEmptyLogin(login);
			} catch (ServiceException e) {
				return false;
			}
				break;
				
			case "isCorrectEmail":
				
				email = request.split(" ")[1];
				result = userService.isCorrectEmail(email);
				break;	
		}
		
	return result;
	
	}
}