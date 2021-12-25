package by.epam.java_introduction.class_programming.book;

import java.util.stream.Stream;

/*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.*/

public class BookData {
	
	private Book[] books;

	public BookData(Book[] books) {
		this.books = books;
	}		
	
	public void printBooks() {		
		Stream.of(books).forEach(book -> System.out.println(book));
	}
	
	public void findByAuthor(String author) {
		Stream.of(books).filter(book -> book.getAuthor() == author).forEach(book -> System.out.println(book));	
	}
	
	public void findByPublisherHouse(String publisherHouse) {
		Stream.of(books).filter(book -> book.getPublisherHouse() == publisherHouse).forEach(book -> System.out.println(book));	
	}
	
	public void findByYearPublishing(int yearPublishing) {
		Stream.of(books).filter(book -> book.getYearPublishing() >= yearPublishing).forEach(book -> System.out.println(book));	
	}

}
