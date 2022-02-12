package by.epam.java_introduction.final_module.library.controller;

import java.util.List;

import by.epam.java_introduction.final_module.library.bean.Book;

public interface BookController {	
	List<Book> doAction(String request);
}
