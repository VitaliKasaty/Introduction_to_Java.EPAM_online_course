package by.epam.java_introduction.final_module.library.controller;

import by.epam.java_introduction.final_module.library.bean.Library;

public interface LibraryController {
	
	public Library loadLibrary();
	public void doAction(String request);

}
