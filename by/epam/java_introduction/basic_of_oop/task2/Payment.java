package by.epam.java_introduction.basic_of_oop.task2;

import java.util.ArrayList;
import java.util.List;

public class Payment {
	
	private List<Product> payments;
	
	{
		payments = new ArrayList<>();
	}
	
	public Payment() {
		
	}
	
	public void addProduct(Product... products) {
		for (Product product : products) {
			payments.add(product);
		}		
	}
	
	public void removeProduct(Product... products) {
		for (Product product : products) {
			payments.remove(product);
		}
	}
	
	public List<Product> getPayments() {
		return payments;
	}

	public void setPayments(List<Product> payments) {
		this.payments = payments;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((payments == null) ? 0 : payments.hashCode());
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
		Payment other = (Payment) obj;
		if (payments == null) {
			if (other.payments != null) {
				return false;
			}
		} else if (!payments.equals(other.payments)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Payment [payments=" + payments + "]";
	}
	

	public static class Product {
		
		private String name;
		private double price;
		
		public Product(String name, double price) {			
			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			long temp;
			temp = Double.doubleToLongBits(price);
			result = prime * result + (int) (temp ^ (temp >>> 32));
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
			Product other = (Product) obj;
			if (name == null) {
				if (other.name != null) {
					return false;
				}
			} else if (!name.equals(other.name)) {
				return false;
			}
			if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
				return false;
			}
			return true;
		}

		@Override
		public String toString() {
			return "Product [name=" + name + ", price=" + price + "]";
		}	
		
	}

}
