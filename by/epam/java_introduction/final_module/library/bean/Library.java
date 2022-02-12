package by.epam.java_introduction.final_module.library.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Library implements Serializable{
		
	private static final long serialVersionUID = -3281603760612067808L;
	
	private List<Book> libraryBooks = new ArrayList<>();

	public Library() {		
	}

	public Library(List<Book> libraryBooks) {
		super();
		this.libraryBooks = libraryBooks;
	}
	
	public void addBook(Book Book) {
		libraryBooks.add(Book);
	}

	public List<Book> getLibraryBooks() {
		return libraryBooks;
	}

	public void setLibraryBooks(List<Book> libraryBooks) {
		this.libraryBooks = libraryBooks;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((libraryBooks == null) ? 0 : libraryBooks.hashCode());
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
		Library other = (Library) obj;
		if (libraryBooks == null) {
			if (other.libraryBooks != null) {
				return false;
			}
		} else if (!libraryBooks.equals(other.libraryBooks)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Library [libraryBooks=" + libraryBooks + "]";
	}	
	
}
