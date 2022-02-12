package by.epam.java_introduction.final_module.library.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import by.epam.java_introduction.final_module.library.bean.Book;
import by.epam.java_introduction.final_module.library.bean.ElectronicBook;
import by.epam.java_introduction.final_module.library.bean.Library;
import by.epam.java_introduction.final_module.library.bean.PaperBook;
import by.epam.java_introduction.final_module.library.dao.DAOException;
import by.epam.java_introduction.final_module.library.dao.LibraryDAO;

public class LibraryDaoImpl implements LibraryDAO{	
	
	public static String pathFileResource = "src/by/epam/java_introduction/final_module/library/resource/";
		
	@Override
	public Library getLibrary() throws DAOException {
		
		Library library = new Library();
		
		try(BufferedReader reader = new BufferedReader(new FileReader(pathFileResource + "Library.txt"))) {			
			String line;
			String title;
			String author;
			int yearPublishing;
			String typeBook;
			String text = "";
			ArrayList<String> bookdata = new ArrayList<>();
			
			while ((line = reader.readLine()) != null) {
				
				if (!line.equals("||")) {
					bookdata.add(line);
				} else {
					title = bookdata.get(0);
					author = bookdata.get(1);
					yearPublishing = Integer.parseInt(bookdata.get(2));
					for (int i = 3; i < bookdata.size() - 1; i++) {
						text += bookdata.get(i) + "\n";
					}
					
					text = text.trim();
					typeBook = bookdata.get(bookdata.size() - 1);
					
					if (typeBook.equals("PaperBook")) {
						Book book = new PaperBook(title, author, yearPublishing, text);
						library.addBook(book);
					} else if (typeBook.equals("ElectronicBook")) {
						Book book = new ElectronicBook(title, author, yearPublishing, text);
						library.addBook(book);
					}					
					text = "";
					bookdata.clear();
				}				
			}			
		} catch(IOException e) {
			throw new DAOException("Eror file database!", e);
		}		
		
		return library;	
	}	

	@Override
	public boolean saveLibrary(Library library) throws DAOException {		

		String description = null;
		try (FileWriter writer = new FileWriter(pathFileResource + "Library.txt")) {
			
			for(Book book :library.getLibraryBooks()) {
				
				String title = book.getTitle();
				String author = book.getAuthor();
				String yearPublishing = Integer.toString(book.getYearPublishing());
				
				if (book instanceof PaperBook) {
					book = (PaperBook) book;
					description = ((PaperBook) book).getText();
				} else if (book instanceof ElectronicBook) {
					book = (ElectronicBook) book;
					description = ((ElectronicBook) book).getUrlAdress();
				}
				
				String text = title + "\n" + author + "\n" + yearPublishing + "\n" + description.trim() +
							  "\n" + book.getClass().getSimpleName() + "\n" + "||\n";
				writer.write(text);				
			}		
			writer.flush();							
			return true;
		} catch (IOException e) {
			throw new DAOException("Eror file database!", e);
		}    
		
	}

	@Override
	public String[] getLibraryEmail() throws DAOException {
		
		String[] libraryEmailData = new String[2];
		
		try(BufferedReader reader = new BufferedReader(new FileReader(pathFileResource + "LibraryEmail.txt"))) {
			
			String emailAdress = reader.readLine();
			String emailPassword = reader.readLine();			
			libraryEmailData[0] = emailAdress;
			libraryEmailData[1] = emailPassword;
			
		} catch(IOException e) {
			throw new DAOException("Eror file database!", e);
		}
		return libraryEmailData;
	}
	

}
