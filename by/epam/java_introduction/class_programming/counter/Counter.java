package by.epam.java_introduction.class_programming.counter;

//Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
//произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
//позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

public class Counter {
	
	private  int counter;   //значение счётчика
	private  int range;  //значение на которое изменяется счётчик
	private  int minInterval;  //нижний порог значения счётчика
	private  int maxInterval;  //верхний порог значения счётчика
	
	public Counter() {  //инициализация счётчика значениями по умолчанию
		
		this.counter = 123;
		this.range = 1;
		this.minInterval = -1234;
		this.maxInterval = 1234;
	}	
	
	public Counter(int counter, int range, int minInterval, int maxInterval) { //инициализация счётчика пользовательскими значениями
		super();
		this.counter = counter;
		this.range = range;
		this.minInterval = minInterval;
		this.maxInterval = maxInterval;
	}			
	
	@Override
	public String toString() {
		return "Счётчик = " + counter + ", величина изменения счётчика = " + range + ", минимальный порог = "
				+ minInterval + ", максимальный порог = " + maxInterval;
	}

	public void plusCounter() { //прибавлению к счётчику числа
		if ((this.counter + this.range) <= this.maxInterval) {
			this.counter += this.range;
		} else {
			System.out.println("Прирастить не получится, превышение верхней границы.");
		}
	}
	
	public void minusCounter() { //убавление счётчика
		if ((this.counter - this.range) >= this.minInterval) {
			this.counter -= this.range;
		} else {
			System.out.println("Убавить не получится, выход за нижнюю границу.");
		}
	}
	
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public int getMinInterval() {
		return minInterval;
	}
	public void setMinInterval(int minInterval) {
		this.minInterval = minInterval;
	}
	public int getMaxInterval() {
		return maxInterval;
	}
	public void setMaxInterval(int maxInterval) {
		this.maxInterval = maxInterval;
	}
	
}
