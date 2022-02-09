package by.epam.java_introduction.final_module.library.service.impl;


import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import by.epam.java_introduction.final_module.library.bean.Book;
import by.epam.java_introduction.final_module.library.bean.Library;
import by.epam.java_introduction.final_module.library.bean.User;
import by.epam.java_introduction.final_module.library.dao.DAOProvider;
import by.epam.java_introduction.final_module.library.dao.LibraryDAO;
import by.epam.java_introduction.final_module.library.dao.UserDAO;
import by.epam.java_introduction.final_module.library.service.LibraryService;

public class HomeLibraryServiceImpl implements LibraryService{
	
	
	
	private final DAOProvider provider = DAOProvider.getInstance();

	@Override
	public Library getLibrary() {		
		LibraryDAO libraryDAO = provider.getLibraryDAO();
		return libraryDAO.getLibrary();
	}

	@Override
	public boolean saveLibrary(Library library) {		
		LibraryDAO libraryDAO = provider.getLibraryDAO();
		 return libraryDAO.saveLibrary(library);
		
	}

	@Override
	public boolean suggestToAddBook(String text) {
		
		UserDAO userDAO = provider.getUserDAO();		
		List<User> users = userDAO.getUsers();
		String adminEmail = null;
		
		for (User user : users) {
			if (user.getLogin().equals("admin")) {
				adminEmail = user.getEmail();				
				break;
			}
		}
				
		Properties properties = new Properties();		   
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");	   
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		 
		String libraryEmail = "homelibraryepam@gmail.com";
		String libraryPassword = "wf8778dwhj2lW2";
		 
		Session session = Session.getInstance(properties, new Authenticator() {			   
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {			
				return new PasswordAuthentication(libraryEmail, libraryPassword);
			}
		}); 		 
		 
		Message message = new MimeMessage(session);		
		try {				
			message.setFrom(new InternetAddress(libraryEmail));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(adminEmail));
			message.setSubject("User want add book!");
			message.setText(text);
			Transport.send(message);
			return true;
		} catch (AddressException e) {			
			e.printStackTrace();
		} catch (MessagingException e) {			
			e.printStackTrace();
		}		
		return false;		
	}

	@Override
	public boolean addBook(Book Book) {
		
		boolean result = false;
		LibraryDAO libraryDAO = provider.getLibraryDAO();
		Library library = libraryDAO.getLibrary(); 
		library.addBook(Book);
		
		result = saveLibrary(library);
		
		return result;
	}

	@Override
	public boolean editBook(int numBook, Book Book) {
		
		boolean result = false;
		LibraryDAO libraryDAO = provider.getLibraryDAO();
		Library library = libraryDAO.getLibrary();
		library.getLibraryBooks().set(numBook, Book);
		result = saveLibrary(library);
		
		return result;
	}

	@Override
	public boolean deleteBook(int numBook) {
		
		boolean result = false;
		LibraryDAO libraryDAO = provider.getLibraryDAO();
		Library library = libraryDAO.getLibrary();
		library.getLibraryBooks().remove(numBook);
		result = saveLibrary(library);
		
		return result;
	}

	@Override
	public boolean sendEmailNotification(String heading, String text) {
		
		UserDAO userDAO = provider.getUserDAO();		
		List<User> users = userDAO.getUsers();		
				
		Properties properties = new Properties();		   
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");	   
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		 
		String libraryEmail = "homelibraryepam@gmail.com";
		String libraryPassword = "wf8778dwhj2lW2";
		 
		Session session = Session.getInstance(properties, new Authenticator() {			   
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {			
				return new PasswordAuthentication(libraryEmail, libraryPassword);
			}
		}); 		 
		 
		Message message = new MimeMessage(session);		
		try {				
			message.setFrom(new InternetAddress(libraryEmail));			
			message.setSubject(heading);
			message.setText(text);
			
			for (User user : users) {				
				if (!user.isAdmin()) {
				message.setRecipient(Message.RecipientType.TO, new InternetAddress(user.getEmail()));
				Transport.send(message);
				}
			}
			
			return true;
		} catch (AddressException e) {			
			e.printStackTrace();
		} catch (MessagingException e) {			
			e.printStackTrace();
		}	
		
		return false;
	}
	
	
	

}
