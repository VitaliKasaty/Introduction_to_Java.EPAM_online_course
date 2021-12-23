package by.epam.java_introduction.class_programming.car;

import by.epam.java_introduction.class_programming.car.Engine.TypeEngine;

/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля. */

public class Main {
	
	public static void main(String[] args) {
		
		Wheel wheel1 = new Wheel("Yokohama", 18);
		Engine engine1 = new Engine("N52B25", 3.0, TypeEngine.PETROL);
		Car car1 = new Car("BMW", "X5", 85, engine1, wheel1);
		
		System.out.println(car1); 					//вывод полной информации о машине	
		car1.Drive(160);          					//метод ехать
		car1.plusFuel(60);		  					//метод заправиться
		car1.setWheel(new Wheel("Pirelli", 18));	//метод смены колёс
		car1.printBrand();							//метод вывода на консоль только марки автомобиля	
		
	}

}
