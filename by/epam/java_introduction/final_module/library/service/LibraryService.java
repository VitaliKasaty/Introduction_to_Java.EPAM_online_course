package by.epam.java_introduction.final_module.library.service;

import java.util.List;

import by.epam.java_introduction.final_module.library.bean.Library;

public interface LibraryService {
	
	Library loadLibrary();
	public List<?> getBooks(Library library);

}
