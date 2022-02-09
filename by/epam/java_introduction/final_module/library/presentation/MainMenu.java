package by.epam.java_introduction.final_module.library.presentation;

import java.util.Scanner;

public class MainMenu {	

		UserOption userOption = new UserOption();
		AdminOption adminOption = new AdminOption();
		LogInSignUp logInSignUp = new LogInSignUp();
		
		Scanner sc = new Scanner(System.in);
		
		public void startProgramm() {			
			
			boolean isEndProgramm = false;
			
			String enterMenu = """
					Введите число:
					1) Авторизация.
					2) Регистрация нового пользователя.
					3) Войти как администритор.
					4) Выход из программы.				
					""";	
			
			
			while(!isEndProgramm) {
				System.out.println(enterMenu);
				String userInput = sc.nextLine();
				
				switch(userInput) {
				
					case "1":

						if (logInSignUp.authorization("user")) {
							System.out.println("Авторизация прошла успешно.\n");
							userOption.menu();
						} else {
							System.out.println("Введены неверные данные.\n");
						}
						break;
						
					case "2":
						if (logInSignUp.registration()) {
							System.out.println("Регистрация прошла успешно.\n");
							userOption.menu();
						} else {
							System.out.println("Ошибка регистрации.\n");
						}
						break;						
						
					case "3":
						if (logInSignUp.authorization("admin")) {
							System.out.println("Вы авторизовались как администратор.\n");
							adminOption.menu();
						} else {
							System.out.println("Введены неверные данные.\n");
						}						
						break;
						
					case "4":
						System.out.println("До свидания!");
						System.exit(0);
					
				}				
				
			}						
			
		}
		

}
