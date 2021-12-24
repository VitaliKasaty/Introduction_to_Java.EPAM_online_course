package by.epam.java_introduction.class_programming.state;

/*Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
столицу, количество областей, площадь, областные центры. */

public class City { //город
	
	private String cityName;
	private String square;
	
	public City(String cityName, String square) {
		this.cityName = cityName;
		this.square = square;
	}		

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", square=" + square + "]";
	}
	
	public void printSquare() {
		System.out.println(square);
	}

	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getSquare() {
		return square;
	}
	public void setSquare(String square) {
		this.square = square;
	}	

}
