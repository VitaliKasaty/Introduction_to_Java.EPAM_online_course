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
import by.epam.java_introduction.final_module.library.dao.DAOException;
import by.epam.java_introduction.final_module.library.dao.DAOProvider;
import by.epam.java_introduction.final_module.library.dao.LibraryDAO;
import by.epam.java_introduction.final_module.library.dao.UserDAO;
import by.epam.java_introduction.final_module.library.service.LibraryService;
import by.epam.java_introduction.final_module.library.service.ServiceException;

public class LibraryServiceImpl implements LibraryService{	
	
	private final DAOProvider provider = DAOProvider.getInstance();

	@Override
	public Library getLibrary() throws ServiceException {		
		LibraryDAO libraryDAO = provider.getLibraryDAO();
		try {
			return libraryDAO.getLibrary();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public boolean saveLibrary(Library library) throws ServiceException {		
		LibraryDAO libraryDAO = provider.getLibraryDAO();
		 try {
			return libraryDAO.saveLibrary(library);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		
	}

	@Override
	public boolean suggestToAddBook(String text) throws ServiceException {
		
		UserDAO userDAO = provider.getUserDAO();		
		List<User> users;
		try {
			users = userDAO.getUsers();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
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
		 
		String libraryEmail = getLibraryEmailData()[0];
		String libraryPassword = getLibraryEmailData()[1];
		 
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
			throw new ServiceException(e);
		} catch (MessagingException e) {			
			throw new ServiceException(e);
		}		
	}

	@Override
	public boolean addBook(Book Book) throws ServiceException {
		
		boolean result = false;
		LibraryDAO libraryDAO = provider.getLibraryDAO();
		Library library;
		try {
			library = libraryDAO.getLibrary();
		} catch (DAOException e) {
			throw new ServiceException(e);
		} 
		library.addBook(Book);
		result = saveLibrary(library);
		return result;
	}

	@Override
	public boolean editBook(int numBook, Book Book) throws ServiceException {
		
		boolean result = false;
		LibraryDAO libraryDAO = provider.getLibraryDAO();
		Library library = null;
		try {
			library = libraryDAO.getLibrary();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		library.getLibraryBooks().set(numBook, Book);		
		result = saveLibrary(library);
		
		
		return result;
	}

	@Override
	public boolean deleteBook(int numBook) throws ServiceException {
		
		boolean result = false;
		LibraryDAO libraryDAO = provider.getLibraryDAO();
		Library library;
		try {
			library = libraryDAO.getLibrary();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		library.getLibraryBooks().remove(numBook);
		result = saveLibrary(library);
		return result;
	}

	@Override
	public boolean sendEmailNotification(String heading, String text) throws ServiceException {
		
		UserDAO userDAO = provider.getUserDAO();		
		List<User> users;
		try {
			users = userDAO.getUsers();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}		
				
		Properties properties = new Properties();		   
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");	   
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		 
		String libraryEmail = getLibraryEmailData()[0];
		String libraryPassword = getLibraryEmailData()[1];
		 
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
			throw new ServiceException(e);
		} catch (MessagingException e) {			
			throw new ServiceException(e);
		}
	}

	@Override
	public String[] getLibraryEmailData() throws ServiceException {
		LibraryDAO libraryDAO = provider.getLibraryDAO();
		String[] result = null;
		try {
			result = libraryDAO.getLibraryEmail();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		return result;
	}

}
