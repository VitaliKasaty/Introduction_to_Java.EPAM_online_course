package by.epam.java_introduction.basic_of_oop.task5.task5_2.service;

import by.epam.java_introduction.basic_of_oop.task5.task5_2.bean.sweet.Candy;
import by.epam.java_introduction.basic_of_oop.task5.task5_2.bean.sweet.Donut;
import by.epam.java_introduction.basic_of_oop.task5.task5_2.bean.sweet.Gingerbread;
import by.epam.java_introduction.basic_of_oop.task5.task5_2.bean.sweet.Marmalade;
import by.epam.java_introduction.basic_of_oop.task5.task5_2.bean.sweet.Sweet;
import by.epam.java_introduction.basic_of_oop.task5.task5_2.bean.sweet.SweetType;

public class SweetFactory {
	
	public Sweet createSweet(SweetType sweetType, String name, int price) {
		
		switch (sweetType) {
		case CANDY:
			return new Candy(name, price);			
		case DONUT:
			return new Donut(name, price);			
		case GINGERBREAD:
			return new Gingerbread(name, price);			
		case MARMALADE:
			return new Marmalade(name, price);	
		default:
			throw new IllegalArgumentException("Unexpected value: " + sweetType);
		}				
	}

}
