package by.epam.java_introduction.class_programming.car;

/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля. */

public class Wheel {
	
	private String model;
	private int radius;
	
	public Wheel(String model, int radius) {
		this.model = model;
		this.radius = radius;
	}	

	@Override
	public String toString() {
		return "Колеса [модель: " + model + ", радиус: " + radius + "]";
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}		

}
