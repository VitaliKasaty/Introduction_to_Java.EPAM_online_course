package by.epam.java_introduction.basic_of_oop.task5.task5_1;

import by.epam.java_introduction.basic_of_oop.task5.task5_1.bean.flower.FlowerType;
import by.epam.java_introduction.basic_of_oop.task5.task5_1.bean.flower_composition.FlowerComposition;
import by.epam.java_introduction.basic_of_oop.task5.task5_1.bean.wrap.WrapType;
import by.epam.java_introduction.basic_of_oop.task5.task5_1.service.FlowerFactory;
import by.epam.java_introduction.basic_of_oop.task5.task5_1.service.WrapFactory;
import by.epam.java_introduction.basic_of_oop.task5.task5_1.view.Print;

public class Main {
	
	public static void main(String[] args) {
		
		FlowerComposition flowerComposition = new FlowerComposition();
		FlowerFactory flowerFactory = new FlowerFactory();
		WrapFactory wrapFactory = new WrapFactory();
		Print print = new Print();
		
		flowerComposition.addFlower(flowerFactory.createFlower(FlowerType.ROSE, "Double Delight", 15));
		flowerComposition.addFlower(flowerFactory.createFlower(FlowerType.ROSE, "Sweet-Brier", 10));
		flowerComposition.addFlower(flowerFactory.createFlower(FlowerType.ALSTROMERIA, "Alisia", 20));
		
		flowerComposition.addWrap(wrapFactory.createWrap(WrapType.ENVELOPE, "White celophane", 2));
		flowerComposition.addWrap(wrapFactory.createWrap(WrapType.RIBBON, "Pink ribbon", 1));
		print.composition(flowerComposition);
		print.totalCost(flowerComposition);
		
	}

}
