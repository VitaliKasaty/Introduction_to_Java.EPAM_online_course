package by.epam.java_introduction.final_module.library.bean;

public class ElectronicBook extends Book{
	
	private static final long serialVersionUID = -7689890970062942880L;
	
	private String urlAdress;

	public ElectronicBook() {
		super();
	}

	public ElectronicBook(String title, String author, int yearPublishing, String urlAdress) {
		super(title, author, yearPublishing);
		this.urlAdress = urlAdress;
	}

	public String getUrlAdress() {
		return urlAdress;
	}

	public void setUrlAdress(String urlAdress) {
		this.urlAdress = urlAdress;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((urlAdress == null) ? 0 : urlAdress.hashCode());
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
		ElectronicBook other = (ElectronicBook) obj;
		if (urlAdress == null) {
			if (other.urlAdress != null) {
				return false;
			}
		} else if (!urlAdress.equals(other.urlAdress)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ElectronicBook [urlAdress=" + urlAdress + ", getTitle()=" + getTitle() + ", getAuthor()=" + getAuthor()
				+ ", getYearPublishing()=" + getYearPublishing() + "]";
	}	

}
