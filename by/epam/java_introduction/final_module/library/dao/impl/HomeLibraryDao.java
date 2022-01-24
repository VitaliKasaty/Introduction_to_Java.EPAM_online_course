package by.epam.java_introduction.final_module.library.dao.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import by.epam.java_introduction.final_module.library.bean.Library;
import by.epam.java_introduction.final_module.library.dao.LibraryDAO;


public class HomeLibraryDao implements LibraryDAO{	
	
	public static String pathFileResource = "src/by/epam/java_introduction/final_module/library/resource/Library.book";
	
	
	@Override
	public Library loadLibraryFromFile() {
		
		Library library = null;
		try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(pathFileResource))) {
			library = (Library) objectInputStream.readObject();
			
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		return library;
		
		
	}

	@Override
	public void saveLibraryInFile(Library library) {
		
		
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(pathFileResource))) {			
			objectOutputStream.writeObject(library);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
        
		
	}


}
