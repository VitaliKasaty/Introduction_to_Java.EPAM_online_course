package by.epam.java_introduction.basic_of_oop.task5.task5_1.service;

import by.epam.java_introduction.basic_of_oop.task5.task5_1.bean.flower.*;

public class FlowerFactory {

	public FlowerInterface createFlower(FlowerType flowerType, String name, int price) {
		
		switch (flowerType) {
		case LILY:
			return new Lily(name, price);			
		case ALSTROMERIA:
			return new Alstromeria(name, price);			
		case CHRYSANTHEMUM:
			return new Tulip(name, price);			
		case ROSE:
			return new Rose(name, price);			
		case TULIP:
			return new Tulip(name, price);	
		default:
			throw new IllegalArgumentException("Unexpected value: " + flowerType);
		}				
	}
	
}
