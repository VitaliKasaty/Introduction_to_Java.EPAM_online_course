package by.epam.java_introduction.basic_of_oop.task5.task5_1.service;

import by.epam.java_introduction.basic_of_oop.task5.task5_1.bean.wrap.*;

public class WrapFactory {
	
	public WrapInterface createWrap(WrapType wrapType, String name, int price) {
		
		switch (wrapType) {
		case BASKET:
			return new Basket(name, price);
		case ENVELOPE:
			return new Envelope(name, price);
		case RIBBON:
			return new Ribbon(name, price);
		default:
			throw new IllegalArgumentException("Unexpected value: " + wrapType);		
		}
	}

}
