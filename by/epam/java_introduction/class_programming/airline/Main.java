package by.epam.java_introduction.class_programming.airline;

import by.epam.java_introduction.class_programming.airline.Airline.DayOfWeek;
import by.epam.java_introduction.class_programming.airline.Airline.TypeAirplane;

/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

public class Main {
	
	public static void main(String[] args) {		
		
		Airline[] airlinesDomodedovo = new Airline[] {
				new Airline("Moscow", 1784, TypeAirplane.HEAVY, "18:45", new DayOfWeek[] {DayOfWeek.THURSDAY, DayOfWeek.FRIDAY}),
				new Airline("Berlin", 1583, TypeAirplane.LIGHT, "17:35", new DayOfWeek[] {DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY}),
				new Airline("Minsk", 1734, TypeAirplane.LIGHT, "02:16", new DayOfWeek[] {DayOfWeek.TUESDAY, DayOfWeek.FRIDAY, DayOfWeek.SUNDAY}),
				new Airline("Moscow", 1292, TypeAirplane.VERYLIGHT, "14:40", new DayOfWeek[] {DayOfWeek.SATURDAY})
				
		};	
		
		AirlineData domodedovo = new AirlineData(airlinesDomodedovo);
		System.out.println("Список рейсов:");
		domodedovo.printAirlines();
		
		System.out.println("\nПоиск рейсов по пункту назначения:");
		domodedovo.findByDestination("Moscow");
		
		System.out.println("\nПоиск рейсов по дню недели:");
		domodedovo.findByDayOfWeek(DayOfWeek.FRIDAY);
		
		System.out.println("\nПоиск рейсов по дню недели и времени вылета больше заданного:");
		domodedovo.findByDayOfWeekAndTimeBefore(DayOfWeek.TUESDAY, "03:00");

	}

}
