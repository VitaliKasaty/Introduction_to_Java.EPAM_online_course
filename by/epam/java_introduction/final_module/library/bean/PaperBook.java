package by.epam.java_introduction.final_module.library.bean;

public class PaperBook extends Book{
	
	private static final long serialVersionUID = -5431782437414914286L;
	
	private String text;

	public PaperBook() {
		super();
	}

	public PaperBook(String title, String author, int yearPublishing, String text) {
		super(title, author, yearPublishing);
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		PaperBook other = (PaperBook) obj;
		if (text == null) {
			if (other.text != null) {
				return false;
			}
		} else if (!text.equals(other.text)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "getTitle()=" + getTitle() + ", getAuthor()=" + getAuthor()
				+ ", getYearPublishing()=" + getYearPublishing() + ", text=" + text + "]";
	}

}
