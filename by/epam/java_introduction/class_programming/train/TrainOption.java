package by.epam.java_introduction.class_programming.train;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.*/

public class TrainOption {
	
	public Train[] createTrains() {
		
		Train[] trains = {
				new Train("Москва", 175, "18:40 14.12.2022"),
				new Train("Гродно", 76, "19:50 15.10.2021"),
				new Train("Витебск", 43, "05:17 01.02.2022"),
				new Train("Вильнюс", 5, "22:15 31.12.2021"),
				new Train("Москва", 184, "12:00 28.02.2021"),
				
		};
		printTrains(trains);		
		return trains;
	}	
	
	public void printTrains(Train[] trains) {
		
		for (Train train : trains) {
			System.out.println(train.toString());			
		}
	}
	
	public void sortByNumberTrains(Train[] trains) { //сортировка поездов по номеру
		Arrays.sort(trains, Comparator.comparing(Train::getNumberTrain));
		printTrains(trains);
	}
	
	public void sortByDestinationTrain(Train[] trains) { //сортировка поездов по пункту назначения, а при равенсте - по времени отправления
		Arrays.sort(trains, Comparator.comparing(Train::getDestination).thenComparing(Train::getDepartureTime));
		printTrains(trains);
	}
	
	public void printTrainByNumber(Train[] trains) { //печать поездов по номеру, введёного пользователем
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);		
		int value = 0;		
		
			System.out.println("Введите номер поезда:");
			if (sc.hasNextInt()) {
				value = sc.nextInt();				
				boolean isExist = false;
				for (int i = 0; i < trains.length; i++) {  
					if(trains[i].getNumberTrain() == value) {
						System.out.println(trains[i].toString());
						isExist = true;						
					} 
				}
				if (isExist == false) {
					System.out.println("Поезда с таким номером не найдено!");
				}				
			} else {
				sc.next();
				System.out.println("Номер поезда состоит из цифр!");
			}
	}

}
