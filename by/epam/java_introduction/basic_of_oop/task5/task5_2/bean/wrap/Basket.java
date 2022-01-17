package by.epam.java_introduction.basic_of_oop.task5.task5_2.bean.wrap;

public class Basket implements Wrap {
	
	private String name;
	private int price;
	
	public Basket() {
	}
	
	public Basket(String name, int price) {		
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;		
	}

	public String getName() {		
		return name;
	}

	public void setPrice(int price) {		
		this.price = price;
	}

	public int getPrice() {		
		return price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
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
		Basket other = (Basket) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (price != other.price) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Basket [name=" + name + ", price=" + price + "]";
	}

}
