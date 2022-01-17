package by.epam.java_introduction.basic_of_oop.task5.task5_2.service;

import by.epam.java_introduction.basic_of_oop.task5.task5_2.bean.wrap.Basket;
import by.epam.java_introduction.basic_of_oop.task5.task5_2.bean.wrap.Box;
import by.epam.java_introduction.basic_of_oop.task5.task5_2.bean.wrap.Wrap;
import by.epam.java_introduction.basic_of_oop.task5.task5_2.bean.wrap.WrapType;

public class WrapFactory {
	
	public Wrap createWrap(WrapType wrapType, String name, int price) {
		
		switch (wrapType) {
		case BOX:
			return new Box(name, price);			
		case BASKET:
			return new Basket(name, price);	
		default:
			throw new IllegalArgumentException("Unexpected value: " + wrapType);
		}				
	}

}
