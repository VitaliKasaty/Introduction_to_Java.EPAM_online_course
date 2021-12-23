package by.epam.java_introduction.class_programming.car;

/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля. */

public class Car {
	
	private String brand;
	private String model;
	private int tankCapacity;
	private double currentFuel;
	private Engine engine;
	private Wheel wheel;	
	
	public Car(String brand, String model, int tankCapacity, Engine engine, Wheel wheel) {
		this.brand = brand;
		this.model = model;
		this.tankCapacity = tankCapacity;
		this.currentFuel = (double) tankCapacity / 2;
		this.engine = engine;
		this.wheel = wheel;
	}
	
	@Override
	public String toString() {
		return "Машина [марка: " + brand + ", модель: " + model + ", объём бака" + tankCapacity + ", топлива в баке: "
				+ currentFuel + "], " + engine + ", " + wheel;
	}
	
	public void Drive(int kilometers) {
			//метод Ехать, расчёт расхода топлива на 100км: для дизельного [объём двигателя * 3], для бензинового [объём двигателя * 5]
			//если топлива хватает, то машина отправляется в путь, объём топлива в баке уменьшается
			//если топлива не хватает, то предлагается машину дозаправить и на сколько
		
		double neededFuel;
		
		if(getEngine().getTypeEngine() == Engine.TypeEngine.DIEZEL) { //рассчёт необходимого топлива на указанное расстояние с учётом типа двигателя
			neededFuel = getEngine().getSize() * 3 * kilometers / 100;
		} else {															
			neededFuel = getEngine().getSize() * 5 * kilometers / 100;
		}
		
		if(getCurrentFuel() >= neededFuel) {
			System.out.println("Можно ехать! В баке " + getCurrentFuel() + " литров. Для поездки будет потрачено " + neededFuel + " литров.");
			setCurrentFuel(getCurrentFuel() - neededFuel);
			System.out.println("Поездка завершилась успешно, в баке осталось " + getCurrentFuel() + " литров.");
		} else {
			System.out.println("Поездка невозможна! Нужно " + neededFuel + " литров.");
			System.out.println("У вас в баке " + getCurrentFuel() + "литров. Нужно заправиться как минимум на " + (neededFuel - getCurrentFuel()) + " литров.");
		}				
	}
	
	public void plusFuel(double addedFuel) { //заправка автомобиля
		
		if (getCurrentFuel() + addedFuel > getTankCapacity()) {
			System.out.println("В бак столько не поместится. Вы превышаете заправку на " + (getCurrentFuel() + addedFuel - getTankCapacity()) + " литров.");
		} else {
			setCurrentFuel(addedFuel + getCurrentFuel());
			System.out.println("Заправка успешна. У вас в баке " + getCurrentFuel() + " литров.");
		}		
	}	
	
	public void printBrand() { 				//метод вывода на консоль марки автомобиля
		System.out.println(getBrand());
	}

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getTankCapacity() {
		return tankCapacity;
	}

	public void setTankCapacity(int tankCapacity) {
		this.tankCapacity = tankCapacity;
	}

	public double getCurrentFuel() {
		return currentFuel;
	}

	public void setCurrentFuel(double currentFuel) { 			
		this.currentFuel = currentFuel;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {  //метод смены колем
		this.wheel = wheel;
	}	

}
