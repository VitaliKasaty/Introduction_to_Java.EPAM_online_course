package by.epam.java_introduction.final_module.library.resource;

import java.util.ArrayList;
import java.util.List;

import by.epam.java_introduction.final_module.library.bean.Book;
import by.epam.java_introduction.final_module.library.bean.ElectronicBook;
import by.epam.java_introduction.final_module.library.bean.PaperBook;

public class FirstCreatedClassBook {
	
	public List<Book> createLibrary() {
		
		List<Book> books = new ArrayList<>();
		
		Book book1 = new PaperBook("Come as You Are", "Emily Nagoski", 2021, 
				"""
				A revised and updated edition of Emily Nagoski's game-changing New York Times bestseller Come As You Are,
				featuring new information and research on mindfulness, desire, and pleasure that will radically transform your sex life.
				For much of the 20th and 21st centuries, women's sexuality was an uncharted territory in science, studied far less
				frequently--and far less seriously--than its male counterpart.
				""");
		books.add(book1);
		
		Book book2 = new PaperBook("Raising Antiracist Children: A Practical Parenting Guide", "Britt Hawthorne", 2022,
				"""
				Learn about raising inclusive, antiracist children in an informed, actionable, and accountable way with this
				must-have guide from antiracist and anti-biased educator and advocate Britt Hawthorne.				
				""");
		books.add(book2);
		
		Book book3 = new PaperBook("Happiness, as Such", "Natalia Ginzburg", 2019, 
				"""
				At the heart of Happiness, as Such is an absence--an abyss that pulls everyone to its brink--created by a family's
				only son, Michele, who has fled from Italy to England to escape the dangers and threats of his radical political ties.
				This novel is part epistolary: his mother writes letters to him, nagging him; his sister Angelica writes, missing him;
				so does Mara, his former lover, telling him about the birth of her son who may be his own.				
				""");
		books.add(book3);
		
		Book book4 = new ElectronicBook("The old curiosity shop", "Charles Dickens", 1998, """
				https://openlibrary.org/works/OL14869338W/Old_Curiosity_Shop
				""");
		books.add(book4);
		
		Book book5 = new ElectronicBook("Founders at work", "Jessica Livingston", 2007, """
				https://openlibrary.org/books/OL24962027M/Founders_at_work
				""");
		books.add(book5);		
		
		
		return books;
	}

}
