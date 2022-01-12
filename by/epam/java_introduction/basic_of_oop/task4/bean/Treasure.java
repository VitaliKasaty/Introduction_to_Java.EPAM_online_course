package by.epam.java_introduction.basic_of_oop.task4.bean;

public class Treasure {
	
	private String name;
	private Enum<TypeTreasure> typeTreasure;
	private int price;
	
	public Treasure() {
		
	}	
	
	public Treasure(String name, Enum<TypeTreasure> typeTreasure, int price) {
		this.name = name;
		this.typeTreasure = typeTreasure;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Enum<TypeTreasure> getTypeTreasure() {
		return typeTreasure;
	}

	public void setTypeTreasure(Enum<TypeTreasure> typeTreasure) {
		this.typeTreasure = typeTreasure;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + ((typeTreasure == null) ? 0 : typeTreasure.hashCode());
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
		Treasure other = (Treasure) obj;
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
		if (typeTreasure == null) {
			if (other.typeTreasure != null) {
				return false;
			}
		} else if (!typeTreasure.equals(other.typeTreasure)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Treasure [name=" + name + ", typeTreasure=" + typeTreasure + ", price=" + price + "]";
	}

}
