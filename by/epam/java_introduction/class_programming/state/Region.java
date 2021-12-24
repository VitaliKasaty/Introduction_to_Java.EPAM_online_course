package by.epam.java_introduction.class_programming.state;

import java.util.ArrayList;

/*Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
столицу, количество областей, площадь, областные центры. */

public class Region { //область состоит из города-областного центра и районов
	
	private String regionName;
	private City regionCentre;
	private ArrayList<District> districts = new ArrayList<>();	
	
	public Region(String regionName, City regionCentre, District... districts) {
		this.regionName = regionName;
		this.regionCentre = regionCentre;
		for (int i = 0; i < districts.length; i++) {
			this.districts.add(districts[i]);
		}		
	}

	@Override
	public String toString() {
		return "Region [regionName=" + regionName + ", regionCentre=" + regionCentre + ", districts=" + districts + "]";
	}		

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public City getRegionCentre() {
		return regionCentre;
	}

	public void setRegionCentre(City regionCentre) {
		this.regionCentre = regionCentre;
	}

	public ArrayList<District> getDistricts() {
		return districts;
	}

	public void setDistricts(ArrayList<District> districts) {
		this.districts = districts;
	}
	
}
