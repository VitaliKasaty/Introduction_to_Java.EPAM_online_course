package by.epam.java_introduction.class_programming.car;

/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля. */

public class Engine {
	
	private String model;
	private double size;	
	private TypeEngine typeEngine;	
	
	public enum TypeEngine {
		DIEZEL,		
		PETROL
	}

	public Engine(String model, double size, TypeEngine typeEngine) {
		this.model = model;
		this.size = size;
		this.typeEngine = typeEngine;
	}

	@Override
	public String toString() {
		String typeEngineRus = (typeEngine == TypeEngine.DIEZEL) ? "дизель" : "бензин";
		return "Двигатель [модель: " + model + ", рабочий объем: " + size + ", тип топлива: " + typeEngineRus + "]";
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public TypeEngine getTypeEngine() {
		return typeEngine;
	}

	public void setTypeEngine(TypeEngine typeEngine) {
		this.typeEngine = typeEngine;
	}
	
}
