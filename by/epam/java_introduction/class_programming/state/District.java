package by.epam.java_introduction.class_programming.state;

import java.util.ArrayList;

/*Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
столицу, количество областей, площадь, областные центры. */

public class District { //район состоит из городов
	
	private String districtName;	
	private ArrayList<City> cities = new ArrayList<>();
	
	public District(String districtName, City... cities) {
		this.districtName = districtName;		
		for (int i = 0; i < cities.length; i++) {
			this.cities.add(cities[i]);
		}		
	}

	@Override
	public String toString() {
		return "District [districtName=" + districtName + ", cities=" + cities + "]";
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public ArrayList<City> getCities() {
		return cities;
	}

	public void setCities(ArrayList<City> cities) {
		this.cities = cities;
	}
	
}
