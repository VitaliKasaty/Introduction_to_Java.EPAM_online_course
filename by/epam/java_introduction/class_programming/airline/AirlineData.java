package by.epam.java_introduction.class_programming.airline;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Stream;

import by.epam.java_introduction.class_programming.airline.Airline.DayOfWeek;

/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

public class AirlineData {
	
	private Airline[] airlines;
	
	static Date timeDeparture; //перенная для поиска рейсов по времени. Объявлена здесь, тк объявить локально в методе нельзя.
	

	public AirlineData(Airline[] airlines) {
		this.airlines = airlines;
	}
	
	
	public void printAirlines() { 
		Stream.of(airlines).forEach(airline -> System.out.println(airline));
	}
	
	public void findByDestination(String destination) { //поиск рейсов по пункту назначения
		
		Stream.of(airlines).filter(airline -> airline.getDestination().equals(destination) )
						   .forEach(airline -> System.out.println(airline));
	}		
	
	public void findByDayOfWeek(DayOfWeek dayOfWeek) {	//поиск рейсов во дню вылета
		
		Stream.of(airlines).filter(airline -> Arrays.asList(airline.getDayOfWeek()).contains(dayOfWeek))
						   .forEach(airline -> System.out.println(airline));
	}	
	
	public void findByDayOfWeekAndTimeBefore(DayOfWeek dayOfWeek, String time) {  //поиск рейса по дню вылета и времени больше заданного		
		
		try {
			timeDeparture = new SimpleDateFormat("HH:mm").parse(time);  
		} catch (ParseException e) {			
			e.printStackTrace();
		}
		 //в стриме сравниваются наличие в списке дней вылетов введёного дня и время вылета после введёного времени
		Stream.of(airlines).filter(airline -> (Arrays.asList(airline.getDayOfWeek()).contains(dayOfWeek) 
											   && airline.getDepartureTime().after(timeDeparture)) )    
						   .forEach(airline -> System.out.println(airline));		 
	}

}
