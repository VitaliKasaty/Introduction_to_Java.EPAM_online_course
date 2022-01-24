package by.epam.java_introduction.final_module.library;

import by.epam.java_introduction.final_module.library.bean.Library;
import by.epam.java_introduction.final_module.library.bean.User;
import by.epam.java_introduction.final_module.library.controller.UserController;
import by.epam.java_introduction.final_module.library.controller.ControllerProvider;
import by.epam.java_introduction.final_module.library.controller.impl.UserControllerImpl;
import by.epam.java_introduction.final_module.library.dao.impl.HomeLibraryDao;
import by.epam.java_introduction.final_module.library.dao.impl.TXTFileUserDAO;
import by.epam.java_introduction.final_module.library.presentation.ConsoleMenu;

/*
 * Cоздать консольное приложение “Учет книг в домашней библиотеке”.
	Общие требования к заданию:
		• Система учитывает книги как в электронном, так и в бумажном варианте.
		• Существующие роли: пользователь, администратор.
		• Пользователь может просматривать книги в каталоге книг, осуществлять поиск
		книг в каталоге.
		• Администратор может модифицировать каталог.
		• *При добавлении описания книги в каталог оповещение о ней рассылается на
		e-mail всем пользователям
		• **При просмотре каталога желательно реализовать постраничный просмотр
		• ***Пользователь может предложить добавить книгу в библиотеку, переслав её
		администратору на e-mail.
		• Каталог книг хранится в текстовом файле.
		• Данные аутентификации пользователей хранятся в текстовом файле. Пароль
		не хранится в открытом виде.
*/

public class Main {
	
	public static void main(String[] args) {
		
		
		ConsoleMenu consoleMenu = new ConsoleMenu();
		
		consoleMenu.startProgramm();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * TXTFileUserDAO txtFileUserDAO = new TXTFileUserDAO();
		 * 
		 * User user1 = new User("Kosatyi", "220173");
		 * //txtFileUserDAO.registration(user1);
		 * 
		 * System.out.println(txtFileUserDAO.authorization("Kosatyi", "220173"));
		 * 
		 * for(User user : txtFileUserDAO.getUsers()) { System.out.println(user); }
		 * System.out.println("===============================================");
		 * 
		 * HomeLibraryDao homeLibraryDao = new HomeLibraryDao(); Library library = new
		 * Library(); library = homeLibraryDao.loadLibraryInFile();
		 * //homeLibraryDao.saveLibrary(library);
		 * //System.out.println(library.getLibraryBooks()); UserController
		 * userController = new UserController(); userController.doAction("1");
		 */

	}

}
