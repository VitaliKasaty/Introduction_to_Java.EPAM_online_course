package by.epam.java_introduction.class_programming.book;

/*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.*/

public class Book {
	
	private static int counter = 1; //чтобы id было уникальным, инкрементируется статический счётчик
	
	private int id;
	private String name;
	private String author;
	private String publisherHouse;
	private int yearPublishing;
	private int pages;
	private double price;
	private String binfingType;
	
	
	public Book(String name, String author, String publisherHouse, int yearPublishing, int pages,
				double price, String binfingType) {
		
		this.id = counter++;
		this.name = name;
		this.author = author;
		this.publisherHouse = publisherHouse;
		this.yearPublishing = yearPublishing;
		this.pages = pages;
		this.price = price;
		this.binfingType = binfingType;
	}
	

	@Override
	public String toString() {
		return "Книга [id: " + id + ", название: " + name + ", автор: " + author + ", издательство: " + publisherHouse
				+ ", год издания: " + yearPublishing + ", страниц: " + pages + ", цена: " + price + ", тип переплёта: "
				+ binfingType + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisherHouse() {
		return publisherHouse;
	}

	public void setPublisherHouse(String publisherHouse) {
		this.publisherHouse = publisherHouse;
	}

	public int getYearPublishing() {
		return yearPublishing;
	}

	public void setYearPublishing(int yearPublishing) {
		this.yearPublishing = yearPublishing;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBinfingType() {
		return binfingType;
	}

	public void setBinfingType(String binfingType) {
		this.binfingType = binfingType;
	}
	
}
