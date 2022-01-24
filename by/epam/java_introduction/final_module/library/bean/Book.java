package by.epam.java_introduction.final_module.library.bean;

import java.io.Serializable;

public abstract class Book implements Serializable{	
	
	private static final long serialVersionUID = 1935106311543900503L;
	
	private String title;
	private String author;
	private int yearPublishing;
	
	public Book() {
		
	}
	
	public Book(String title, String author, int yearPublishing) {		
		this.title = title;
		this.author = author;
		this.yearPublishing = yearPublishing;
	}

	public String getTitle() {
		return title;
	}

	public void setTritle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYearPublishing() {
		return yearPublishing;
	}

	public void setYearPublishing(int yearPublishing) {
		this.yearPublishing = yearPublishing;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + yearPublishing;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null) {
				return false;
			}
		} else if (!author.equals(other.author)) {
			return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		if (yearPublishing != other.yearPublishing) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Book [tritle=" + title + ", author=" + author + ", yearPublishing=" + yearPublishing + "]";
	}

}
