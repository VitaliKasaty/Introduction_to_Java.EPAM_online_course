package by.epam.java_introduction.basic_of_oop.task3;

import by.epam.java_introduction.basic_of_oop.task3.Calendar.Date;

/*Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
выходных и праздничных днях.*/

public class Main {
	
	public static void main(String[] args) {
		
		Calendar year2020 = new Calendar();
		DateOperation dateOperation = new DateOperation();
		
		Date date1 = new Date(16, 1, 2022);
		Date date2 = new Date(17, 3, 2022);
		Date date3 = new Date(9, 5, 2022);		
		
		year2020.addDay(date1, date2, date3);	
		dateOperation.printCalendar(year2020);
		dateOperation.dayOff(date1);
		dateOperation.holiday(date3);	
		dateOperation.printHolidays(year2020);
	}

}
