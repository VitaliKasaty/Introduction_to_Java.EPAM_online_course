package by.epam.java_introduction.class_programming.state;

import java.util.ArrayList;

/*Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
столицу, количество областей, площадь, областные центры. */

public class State { //государство состоит города-столицы и областей
	
	private String stateName;
	private City capital;
	private ArrayList<Region> regions = new ArrayList<>();	
	
	public State(String stateName, City capital, Region... regions) {		
		this.stateName = stateName;
		this.capital = capital;
		for (int i = 0; i < regions.length; i++) {
			this.regions.add(regions[i]);
		}	
	}

	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", regions=" + regions + ", capital=" + capital + "]";
	}
	
	public void printCapital() {
		System.out.println(getCapital().getCityName());
	}
	
	public void printCountRegions() {
		System.out.println(getRegions().size());
	}
	
	public void printRegionsCentre() {
		for (int i = 0; i < regions.size(); i++) {
			System.out.println(regions.get(i).getRegionCentre().getCityName());			
		}	
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	public ArrayList<Region> getRegions() {
		return regions;
	}

	public void setRegions(ArrayList<Region> regions) {
		this.regions = regions;
	}

}
