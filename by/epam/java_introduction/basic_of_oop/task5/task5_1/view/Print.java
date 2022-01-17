package by.epam.java_introduction.basic_of_oop.task5.task5_1.view;

import by.epam.java_introduction.basic_of_oop.task5.task5_1.bean.flower.FlowerInterface;
import by.epam.java_introduction.basic_of_oop.task5.task5_1.bean.flower_composition.FlowerComposition;
import by.epam.java_introduction.basic_of_oop.task5.task5_1.bean.wrap.WrapInterface;
import by.epam.java_introduction.basic_of_oop.task5.task5_1.service.Operation;

public class Print {
	
	public void composition(FlowerComposition flowerComposition) {					
		System.out.println("Your flower composition:");
		for(FlowerInterface flower : flowerComposition.getFlowers()) {
			System.out.println(flower);
		}			
		
		for(WrapInterface wrap : flowerComposition.getWraps()) {
			System.out.println(wrap);
		}
				
	}
	
	public void totalCost(FlowerComposition flowerComposition) {
		Operation operation = new Operation();
		System.out.println("Total cost = " + operation.costFlowerComposition(flowerComposition));
	}

}
