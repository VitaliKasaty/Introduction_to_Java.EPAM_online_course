package by.epam.java_introduction.class_programming;

//Создйте класс Test2 c двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
//конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
//класса.

public class Test2 {
	
	private int value1;
	private int value2;
	
	public Test2() {
		this.value1 = 1;
		this.value2 = 2;
	}

	public Test2(int value1, int value2) {
		this.value1 = value1;
		this.value2 = value2;
	}
	
	public void setValue1(int value1) {
		this.value1 = value1;
	}
	
	public int getValue1() {
		return value1;
	}
	
	public void setValue2(int value2) {
		this.value2 = value2;
	}

	public int getValue2() {
		return value2;
	}

}
