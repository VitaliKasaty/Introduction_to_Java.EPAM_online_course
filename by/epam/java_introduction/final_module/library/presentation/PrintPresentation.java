package by.epam.java_introduction.final_module.library.presentation;

import java.util.List;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import by.epam.java_introduction.final_module.library.bean.Book;
import by.epam.java_introduction.final_module.library.bean.ElectronicBook;
import by.epam.java_introduction.final_module.library.bean.PaperBook;

public class PrintPresentation {

	public void printBooks(List<Book> books) {
		
		System.out.println("Title || Author || Year publishing || Type book");	
		
		for (int i = 0; i < books.size(); i++) {
			System.out.println((i + 1) + ") " + books.get(i).getTitle() + " || " + books.get(i).getAuthor() + " || "
					+ books.get(i).getYearPublishing() + " || " + books.get(i).getClass().getSimpleName());
		}
		System.out.println();
	}

	public void readBook(Book book) {

		System.out.println("Title || Author || Year publishing");
		System.out.println(book.getTitle() + " || " + book.getAuthor() + " || " + book.getYearPublishing());

		if (book instanceof PaperBook) {			
			System.out.println("Text:");
			PaperBook paperBook = (PaperBook) book;
			System.out.println(paperBook.getText() + "\n");
			
		} else if (book instanceof ElectronicBook) {			
			ElectronicBook electronicBook = (ElectronicBook) book;			
			if (Desktop.isDesktopSupported()) {
				try {
					String UrlAdress = electronicBook.getUrlAdress().trim();
					Desktop.getDesktop().browse(new URI(UrlAdress));
				} catch (IOException e) {					
					e.printStackTrace();
				} catch (URISyntaxException e) {					
					e.printStackTrace();
				}
			}
			System.out.println("UrlAdress: " + electronicBook.getUrlAdress() + "\n");
		}
	}
	

}
