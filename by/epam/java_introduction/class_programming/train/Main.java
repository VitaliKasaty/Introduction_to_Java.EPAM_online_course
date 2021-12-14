package by.epam.java_introduction.class_programming.train;

import java.util.Scanner;

/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.*/

public class Main {
	
	public static void main(String[] args) {
		
		TrainOption trainOption = new TrainOption();		
		Train[] trains = trainOption.createTrains();		
			
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int value = 0;
		do {
			System.out.println("""
					\nВыберите действие:
					1)Отсортировать поезда по номеру.
					2)Отсортировать поезда по пункту назначения, а при равенстве - по времени отправления.
					3)Вывести информацию о поезде по его номеру.
					4)Вывести исходный список поездов.
					5)Выход.
					""");
			while (value < 1 ) { //проверка на корректность вводимых значений
				if (sc.hasNextInt()) {
					value = sc.nextInt();
					if (value < 1 || value > 5) {
						System.out.println("Введите корректно!");
						value = 0;
					}
				} else {
					sc.next();
					System.out.println("Введите корректно!");
				}				
			}			
			
			switch (value) {
				case 1 -> {
					trainOption.sortByNumberTrains(trains);
					value = 0;
				}
				case 2 -> {
					trainOption.sortByDestinationTrain(trains);
					value = 0;
				}
				case 3 -> {
					trainOption.printTrainByNumber(trains);
					value = 0;
				}
				case 4 -> {
					trains = trainOption.createTrains();
					
					value = 0;
				}				
			}	
			
		} while (value != 5);

	}	

}
