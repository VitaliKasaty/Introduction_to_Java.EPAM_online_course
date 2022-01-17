package by.epam.java_introduction.basic_of_oop.task5.task5_2.service;

import by.epam.java_introduction.basic_of_oop.task5.task5_2.bean.sweet.Sweet;
import by.epam.java_introduction.basic_of_oop.task5.task5_2.bean.sweet_composition.SweetComposition;

public class Operation {
	
	public int costSweetComposition(SweetComposition sweetComposition) {
		int cost = 0;
		
		for(Sweet sweet : sweetComposition.getSweets()) {
			cost += sweet.getPrice();
		}		
		cost += sweetComposition.getWrap().getPrice();
		
		return cost;
	}

}
