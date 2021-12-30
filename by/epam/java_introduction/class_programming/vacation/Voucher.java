package by.epam.java_introduction.class_programming.vacation;

/*Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.*/

public class Voucher {
	
	private String country;
	private VacationType vacationType;
	private TransportType transportType;
	private FoodType foodType;
	private int numberOfDays;
	private int price;
	
	public Voucher(String country, VacationType vacationType, TransportType transportType, FoodType foodType,
			int numberOfDays, int price) {
		this.country = country;
		this.vacationType = vacationType;
		this.transportType = transportType;
		this.foodType = foodType;
		this.numberOfDays = numberOfDays;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Страна: " + country + ", тип отдыха: " + vacationType + ", тип транспорта: " + transportType
				+ ", тип питания: " + foodType + ", количество дней: " + numberOfDays + ", цена($):" + price;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public VacationType getVacationType() {
		return vacationType;
	}

	public void setVacationType(VacationType vacationType) {
		this.vacationType = vacationType;
	}

	public TransportType getTransportType() {
		return transportType;
	}

	public void setTransportType(TransportType transportType) {
		this.transportType = transportType;
	}

	public FoodType getFoodType() {
		return foodType;
	}

	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}	
	
}
