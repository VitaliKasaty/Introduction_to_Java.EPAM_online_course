package by.epam.java_introduction.final_module.library.presentation;

import java.util.Scanner;

import by.epam.java_introduction.final_module.library.controller.ControllerProvider;
import by.epam.java_introduction.final_module.library.controller.UserController;

public class LogInSignUp {
	
	ControllerProvider controllerProvider = ControllerProvider.getInstance();	
	UserController userController = controllerProvider.getUserController();
	Scanner sc = new Scanner(System.in);
	
	public boolean authorization(String typeUser) {
		
		boolean isEntered = false;
		
		System.out.println("Введите логин");
		String login = sc.nextLine();
		System.out.println("Введите пароль");
		String password = sc.nextLine(); 
		
		if (typeUser.equals("user")) {
			isEntered =  userController.doAction("loginUser " + login + " " + password);
		} else if (typeUser.equals("admin")) {
			isEntered =  userController.doAction("loginAdmin " + login + " " + password);
		}
		
		return isEntered;
	}
	
	public boolean registration() {
		
		boolean isRegistrated;
		String login;
		String email;
		boolean isEmptyLogin;
		boolean isEmptyEmail;
		boolean isCorrectEmail;
		
		do {		
			System.out.println("Введите логин");
			login = sc.nextLine();
			isEmptyLogin = userController.doAction("isEmptyLogin " + login);
			
			if (!isEmptyLogin) {
				System.out.println("Имя пользователя занято. Повторите ввод.");				
			}
			
		} while (!isEmptyLogin);
		
		System.out.println("Введите пароль");
		String password = sc.nextLine();
		
		do {		
			System.out.println("Введите email");
			email = sc.nextLine();
			isCorrectEmail = userController.doAction("isCorrectEmail " + email);
			isEmptyEmail = userController.doAction("isEmptyEmail " + email);
			
			if (!isCorrectEmail || !isEmptyEmail) {
				System.out.println("Email адрес некорректный либо занят. Повторите ввод.");				
			}
			
		} while (!isCorrectEmail || !isEmptyEmail);
		
		isRegistrated =  userController.doAction("registration " + login + " " + password + " " + email); 
		
		return isRegistrated;
	}
	

}
