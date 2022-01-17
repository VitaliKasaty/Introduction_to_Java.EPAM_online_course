package by.epam.java_introduction.basic_of_oop.task5.task5_1.service;

import by.epam.java_introduction.basic_of_oop.task5.task5_1.bean.flower.FlowerInterface;
import by.epam.java_introduction.basic_of_oop.task5.task5_1.bean.flower_composition.FlowerComposition;
import by.epam.java_introduction.basic_of_oop.task5.task5_1.bean.wrap.WrapInterface;

public class Operation {
	
	public int costFlowerComposition(FlowerComposition flowerComposition) {
		int cost = 0;
		
		for(FlowerInterface flower : flowerComposition.getFlowers()) {
			cost += flower.getPrice();
		}		
		for(WrapInterface wrap : flowerComposition.getWraps()) {
			cost += wrap.getPrice();
		}		
		return cost;
	}

}
