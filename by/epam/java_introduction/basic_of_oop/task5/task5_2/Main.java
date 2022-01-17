package by.epam.java_introduction.basic_of_oop.task5.task5_2;

import by.epam.java_introduction.basic_of_oop.task5.task5_2.bean.sweet.SweetType;
import by.epam.java_introduction.basic_of_oop.task5.task5_2.bean.sweet_composition.SweetComposition;
import by.epam.java_introduction.basic_of_oop.task5.task5_2.bean.wrap.WrapType;
import by.epam.java_introduction.basic_of_oop.task5.task5_2.service.SweetFactory;
import by.epam.java_introduction.basic_of_oop.task5.task5_2.service.WrapFactory;
import by.epam.java_introduction.basic_of_oop.task5.task5_2.view.Print;

/*Создать консольное приложение, удовлетворяющее следующим требованиям:
• Корректно спроектируйте и реализуйте предметную область задачи.
• Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов
проектирования.
• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
• для проверки корректности переданных данных можно применить регулярные выражения.
• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой
подарок). Составляющими целого подарка являются сладости и упаковка.*/

public class Main {
	public static void main(String[] args) {
		
		SweetComposition sweetComposition = new SweetComposition();
		SweetFactory sweetFactory = new SweetFactory();
		WrapFactory wrapFactory = new WrapFactory();
		Print print = new Print();
		
		
		sweetComposition.addSweet(sweetFactory.createSweet(SweetType.DONUT, "Big Joe", 3));
		sweetComposition.addSweet(sweetFactory.createSweet(SweetType.DONUT, "Big Andy", 2));
		sweetComposition.addSweet(sweetFactory.createSweet(SweetType.MARMALADE, "Princess", 6));
		
		sweetComposition.setWrap(wrapFactory.createWrap(WrapType.BOX, "Small box", 1));
		
		print.composition(sweetComposition);
		print.totalCost(sweetComposition);

	}

}
