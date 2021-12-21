package by.epam.java_introduction.class_programming.airline;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

public class Airline {
	
	private String destination;
	private int numberFlight;
	private TypeAirplane typeAirplane;
	private Date departureTime;
	private DayOfWeek[] dayOfWeek; //дни по которым летает рейс
	
	public enum DayOfWeek {	
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY
	}	
	
	public enum TypeAirplane {		
		VERYLIGHT,
		LIGHT,
		HEAVY	
	}

	public Airline(String destination, int numberFlight, TypeAirplane typeAirplane, String departureTime,
			DayOfWeek[] dayOfWeek) {
		super();
		this.destination = destination;
		this.numberFlight = numberFlight;
		this.typeAirplane = typeAirplane;		
		try {
			this.departureTime = new SimpleDateFormat("HH:mm").parse(departureTime);
		} catch (ParseException e) {			
			e.printStackTrace();
		}		
		this.dayOfWeek = dayOfWeek;
	}

	@Override
	public String toString() {
		
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
		
		return "Destination: " + destination + ", number flight: " + numberFlight + ", type airplane: "
				+ typeAirplane + ", departure time: " + timeFormat.format(departureTime) + ", days: " + Arrays.toString(dayOfWeek);
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumberFlight() {
		return numberFlight;
	}

	public void setNumberFlight(int numberFlight) {
		this.numberFlight = numberFlight;
	}

	public TypeAirplane getTypeAirplane() {
		return typeAirplane;
	}

	public void setTypeAirplane(TypeAirplane typeAirplane) {
		this.typeAirplane = typeAirplane;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public DayOfWeek[] getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(DayOfWeek[] dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	
}
