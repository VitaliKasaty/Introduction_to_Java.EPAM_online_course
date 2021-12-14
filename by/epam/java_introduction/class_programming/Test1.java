package by.epam.java_introduction.class_programming;

/*Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
наибольшее значение из этих двух переменных.*/

public class Test1 {
	
	private int value1;
	private int value2;
	
	
	public void print() {
		System.out.println(value1);
		System.out.println(value2);
	}
	
	public void changeValue1(int newValue1) {
		value1 = newValue1;
	}
	
	public void changeValue2(int newValue2) {
		value2 = newValue2;
	}

	public int sum() {
		return value1 + value2;
	}
	
	public int max() {
		return Math.max(value1, value2);
	}

}
