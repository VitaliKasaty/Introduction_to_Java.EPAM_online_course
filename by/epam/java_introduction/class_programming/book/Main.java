package by.epam.java_introduction.class_programming.book;

//Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

public class Main {
	
	public static void main(String[] args) {
		
		Book[] booksLibrary = new Book[] {
				new Book("Братья Карамазовы", "Федор Достоевский", "Азбука", 2013, 832, 10.17, "Твердый переплет"),
				new Book("Малое собрание сочинений", "Владимир Маяковский", "Азбука", 2021, 672, 19.69, "Твердый переплет"),
				new Book("Анна Каренина", "Лев Толстой", "Азбука", 2012, 832, 10.82, "Твердый переплет"),
				new Book("Униженные и оскорбленные", "Федор Достоевский", "Азбука", 2016, 448, 10.82, "Твердый переплет"),
				new Book("Мы", "Евгений Замятин", "АСТ", 2021, 224, 8.99, "Мягкая обложка"),
				new Book("Одноэтажная Америка (м)", "Илья Ильф", "АСТ", 2017, 480, 10.87, "Мягкая обложка"),
		};	
		
		BookData library1 = new BookData(booksLibrary);		
		
		library1.printBooks();
		System.out.println("\nПоиск по автору:");
		library1.findByAuthor("Федор Достоевский");
		
		System.out.println("\nПоиск по издательству:");
		library1.findByPublisherHouse("АСТ");
		
		System.out.println("\nВыпущенные после заданного года:");
		library1.findByYearPublishing(2017);		

	}

}
