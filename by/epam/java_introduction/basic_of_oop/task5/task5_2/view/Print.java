package by.epam.java_introduction.basic_of_oop.task5.task5_2.view;

import by.epam.java_introduction.basic_of_oop.task5.task5_2.bean.sweet.Sweet;
import by.epam.java_introduction.basic_of_oop.task5.task5_2.bean.sweet_composition.SweetComposition;
import by.epam.java_introduction.basic_of_oop.task5.task5_2.service.Operation;

public class Print {
	
	public void composition(SweetComposition sweetComposition) {					
		System.out.println("Your sweet composition:");
		for(Sweet sweet : sweetComposition.getSweets()) {
			System.out.println(sweet);
		}
		
		System.out.println(sweetComposition.getWrap());
	}
	
	public void totalCost(SweetComposition sweetComposition) {
		Operation operation = new Operation();
		System.out.println("Total cost = " + operation.costSweetComposition(sweetComposition));
	}

}
