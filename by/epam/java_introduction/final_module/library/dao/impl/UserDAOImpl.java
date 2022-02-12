package by.epam.java_introduction.final_module.library.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import by.epam.java_introduction.final_module.library.bean.User;
import by.epam.java_introduction.final_module.library.dao.DAOException;
import by.epam.java_introduction.final_module.library.dao.UserDAO;

public class UserDAOImpl implements UserDAO{		
	
	public static String pathFileResource = "src/by/epam/java_introduction/final_module/library/resource/Users.txt";	

	public  List<User> getUsers() throws DAOException{ 
		
		List<User> users = new ArrayList<>();
		
		try(BufferedReader reader = new BufferedReader(new FileReader(pathFileResource))) {
			
			String line = reader.readLine();
			
			while(line != null) {				
				String login = line.split(" ")[0];
				String password = line.split(" ")[1];  
				String email = line.split(" ")[2];
				Boolean isAdmin = Boolean.parseBoolean(line.split(" ")[3]);
				
				User user = new User(login, password, email, isAdmin);				
				users.add(user);
				line = reader.readLine();
			}
			
		} catch(IOException e) {
			throw new DAOException("Eror file database!", e);			
		}		
		return users;
	}	
		
	@Override
	public boolean authorization(String login, String password, boolean checkAdmin) throws DAOException {
		
		if(checkAdmin == false) {			
			for(User user : getUsers()) {			
				if((user.getLogin().equalsIgnoreCase(login)) && (user.getPassword().equals(md5Hash(password))) && (!user.isAdmin())) {				
					return true;
				}
			}			
		} else {			
			for(User user : getUsers()) {			
				if((user.getLogin().equalsIgnoreCase(login)) && (user.getPassword().equals(md5Hash(password))) && (user.isAdmin())) {				
					return true;
				}
			}
		}
		return false;
	}	

	@Override
	public boolean registration(User newUser) throws DAOException {			
		
		try (FileWriter writer = new FileWriter(pathFileResource, true)) {
			String text = newUser.getLogin() + " " + md5Hash(newUser.getPassword()) + " " + newUser.getEmail() + " " + newUser.isAdmin() + "\n";
			writer.write(text);
			writer.flush();
			return true;
		} catch (IOException e) {
			throw new DAOException("Eror file database!", e);			
		}	
	}

	@Override
	public String md5Hash(String password) throws DAOException {		
		 
		 MessageDigest messageDigest = null;
		 byte[] digest = new byte[0];

		 try {			 
		     messageDigest = MessageDigest.getInstance("MD5");
		     messageDigest.reset();
		     messageDigest.update(password.getBytes());
		     digest = messageDigest.digest();			 
		 } catch (NoSuchAlgorithmException ex) {
			 throw new DAOException("Не найден алгоритм md5!", ex);
		 }

		 BigInteger bigInt = new BigInteger(1, digest);
		 String md5Hex = bigInt.toString(16);

		 while (md5Hex.length() < 32) {
		     md5Hex = "0" + md5Hex;
		 }	
		 
		return md5Hex;
	}
	

}
