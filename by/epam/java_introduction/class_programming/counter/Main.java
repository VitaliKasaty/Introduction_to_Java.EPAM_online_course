package by.epam.java_introduction.class_programming.counter;

import java.util.Scanner;

//Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
//произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
//позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

public class Main {
	
	public static void main(String[] args) {

		Counter counter = null;			
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);		
		System.out.println("""
				Необходимо инициализировать счётчик, выберите действие.
				1)Инициализировать счётчик по умолчанию.
				2)Инициализировать счётчик с пользовательскими значениями.
				""");
		
		int value = 0; 
		do {			//Пользователю предлагается выбор способа инициализации счётчика. И идёт проверка на корректность ввода.
			if (!sc.hasNextInt()) {
				System.out.println("Введите число");
				sc.nextLine();
			} else {
				value = sc.nextInt();
				if(value != 1 && value != 2) {					
					System.out.println("Такого варианта нет!");
					sc.nextLine();
				} else {
					
					if (value == 1) {
						counter = createDefaultCounter(); //инициализация счётчика по умолчанию				
						printCounter(counter);
					} else {
						counter = createUserCounter();   //инициализация счётчика с параметрами
						printCounter(counter);
						
					}
				}
			}
		} while (value != 1 && value != 2);
												//после инициализации предлагаются методы рыботы со счётчиком
		String menu = ("""                     
				Выберите действие:
				1)Увеличить значение счётчика.
				2)Уменьшить значение счётчика.
				3)Посмотреть параметры счётчика.
				4)Вернуть счётчику параметры по умолчанию.
				5)Задать счётчику пользовательские значения.
				6)Снова напечатать список действий.
				7)Выход.
				""");
		
		value = 0;
		System.out.println("\n" + menu);
		do {
			
			if (!sc.hasNextInt()) {
				System.out.println("Введите число");
				sc.nextLine();
			} else {
				value = sc.nextInt();
				if(value < 1 || value > 6) {					
					System.out.println("Такого варианта нет!");
					sc.nextLine();
				} else {
					switch(value) {
						case 1 -> {							
							counter.plusCounter();
						}
						case 2 ->
						{						
							counter.minusCounter();
						}
						case 3 -> {
							printCounter(counter);
						}
						case 4 -> {
							 counter = createDefaultCounter();
						}
						case 5 -> {
							 counter = createUserCounter();
						}
						case 6 -> {
							System.out.println(menu);
						}
					}					
				}
			}
		} while(value != 7);
		
	}
	
	public static void printCounter(Counter counter) {		
		System.out.println(counter.toString());
	}
	
	public static Counter createDefaultCounter() {
		Counter counter = new Counter();
		return counter;		
	}	
	
	public static Counter createUserCounter() {
		
		Counter counter = null;
		boolean isCorrectData = false;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("""
				Введите через пробел четыре значения счётчика(без скобок).
				[значение счётчика] [число на которое изменяется счётчик] [минимальный порог] [максимальный порог]
				""");
		int count = 0;
		int range = 0;
		int minInterval = 0;
		int maxInterval = 0;
							//Пользователь вводит параметры счётчика, весь некорректный ввод обрабатывается
		do {							
			String[] data;
			String s;			
			s = sc.nextLine();	
			data = s.split(" ");

			try {			//Через try-catch очень легко обработать некорректные пользовательские данные, будь то их недостаточно или неправильный тип.						
				count = Integer.parseInt(data[0]);               
				range = Integer.parseInt(data[1]);								
				minInterval = Integer.parseInt(data[2]);
				maxInterval = Integer.parseInt(data[3]);
				isCorrectData = true;
				
			} catch (Exception e) {
				
			}
			if ((minInterval < maxInterval) && (count > minInterval) && (count < maxInterval) && (isCorrectData = true)) {	//Проверка на корректность исходных данных счётчика			
				counter = new Counter(count, range, minInterval, maxInterval);				
								
			} else {
				System.out.println("Создать счётчик с данными параметрами не получится! Повторите ввод.");
				isCorrectData = false;
			}
			
		} while (isCorrectData != true);
		
		return counter;
	}	

}
