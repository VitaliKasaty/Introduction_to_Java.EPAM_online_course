package by.epam.java_introduction.class_programming.train;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.*/

public class Train {	
	
	private String destination;
	private int numberTrain;
	private Date departureTime;
	
	
	public Train(String destination, int numberTrain, String departureTime) {
		super();
		this.destination = destination;
		this.numberTrain = numberTrain;
		
		try {
			this.departureTime = new SimpleDateFormat("hh:mm dd.MM.yyyy").parse(departureTime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Поезд №" + numberTrain + ". Пункт назначения: " + destination + 
			   ". Время отправления в: " + departureTime.toString();
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumberTrain() {
		return numberTrain;
	}

	public void setNumberTrain(int numberTrain) {
		this.numberTrain = numberTrain;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

}
