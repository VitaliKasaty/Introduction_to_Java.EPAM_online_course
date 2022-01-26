package by.epam.java_introduction.final_module.library.presentation;

import java.util.List;

import by.epam.java_introduction.final_module.library.bean.Book;

public class PrintPresentation {
	
	public void printBooks(List<Book> books) {
		
		System.out.println("Title | Author | Year publishing");
		for(int i = 0; i < books.size(); i++) {
			System.out.println((i + 1) + ") " + books.get(i).getTitle() + ". " + books.get(i).getAuthor() + ". " + books.get(i).getYearPublishing());
						
		}
		
	}

}
