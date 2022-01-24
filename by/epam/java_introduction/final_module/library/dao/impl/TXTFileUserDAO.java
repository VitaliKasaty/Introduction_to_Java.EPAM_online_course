package by.epam.java_introduction.final_module.library.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import by.epam.java_introduction.final_module.library.bean.User;
import by.epam.java_introduction.final_module.library.dao.UserDAO;

public class TXTFileUserDAO implements UserDAO{		
	
	public static String pathFileResource = "src/by/epam/java_introduction/final_module/library/resource/Users.txt";	
	
	/*
	 * возвращает список пользователей
	 * пользователи считываются из файла Users.txt	 
	 */	
	public  List<User> getUsers(){ 
		
		List<User> users = new ArrayList<>();
		
		try(BufferedReader reader = new BufferedReader(new FileReader(pathFileResource))) {	
			String line = reader.readLine();
			
			while(line != null) {				
				String login = line.split(" ")[0];
				String password = line.split(" ")[1];  
				Boolean isAdmin = Boolean.parseBoolean(line.split(" ")[2]);
				
				User user = new User(login, password);
				user.setAdmin(isAdmin);
				users.add(user);
				line = reader.readLine();
			}
			
		} catch(IOException ex) {
			System.out.println("Eror file database!");
		}		
		return users;
	}
	
	/* 
	 * Проверка, существует ли пользователем с данным логином. 
	 * */	
	@Override
	public boolean isExistLoginUser(String login) {	
		
		for(User user : getUsers()) {
			if(user.getLogin().contains(login)) {
				return true;
			}
		}
		return false;		
	}
	
	/*
	 * Метод авторизации: 
	 * 	    получение списка пользователей; 
	 * 	    сравнение логина и дешифрованного пароля из базы пользователей с введенными данными.
	 */		
	@Override
	public boolean authorization(String login, String password) {
		
		for(User user : getUsers()) {			
			if(user.getLogin().equals(login) && decoder(user.getPassword()).equals(password)) {				
				return true;
			}
		}		
		return false;
	}
	
	/*
	 * Метод регистрации пользователей: 
	 * 		проверка на свободность логина; 
	 * 		запись нового пользователя в базу текстового файла пароль шифруется
	 */
	@Override
	public boolean registration(User newUser) {		
		
		if(isExistLoginUser(newUser.getLogin())) {			
			return false;
		} else {
			try (FileWriter writer = new FileWriter(pathFileResource, true)) {
				String text = newUser.getLogin() + " " + encoder(newUser.getPassword()) + " " + newUser.isAdmin() + "\n";
				writer.write(text);
				writer.flush();				
				return true;
			} catch (IOException ex) {
				System.out.println("Eror file database!");
			}	
		}
		return false;
	}

	/* 
	 * Шифрование текста встроенным Base64 
	 * */
	@Override
	public String encoder(String text) {
		
		String result = "";		
		Base64.Encoder encoder = Base64.getEncoder();
		byte[] encoderBytes = encoder.encode(text.getBytes());
		
		for(int i = 0; i < encoderBytes.length; i++) {
			result += (char)encoderBytes[i];
		}			
		return result;
	}
	
	/* 
	 *Дешифрование текста встроенным Base64 
	 **/
	@Override
	public String decoder(String text) {
		
		Base64.Decoder decoder = Base64.getDecoder();
		byte[] decoderBytes = decoder.decode(text);
		
		return new String(decoderBytes);
	}
	

}
