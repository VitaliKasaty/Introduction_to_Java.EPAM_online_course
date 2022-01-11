package by.epam.java_introduction.basic_of_oop.task3;

import by.epam.java_introduction.basic_of_oop.task3.Calendar.Date;

public class DateOperation {
	
	public void dayOff(Date date) {		
		date.setDayOff(true);
		date.setWorked(false);
		}
	
	public void holiday(Date date) {		
		date.setHoliday(true);
		date.setWorked(false);
		}
	
	public void worked(Date date) {
		date.setWorked(true);
		date.setHoliday(false);
		date.setDayOff(false);
	}
		
	public void printHolidays(Calendar calendar) {
		System.out.println("Holidays:");
		for (Date date : calendar.getCalendar()) {
			if (date.isHoliday()) {
				System.out.println(date);
			}
		}
	}
	
	public void printDayOffs(Calendar calendar) {
		System.out.println("DayOffs:");
		for (Date date : calendar.getCalendar()) {
			if (date.isDayOff()) {
				System.out.println(date);
			}
		}
	}
	
	public void printCalendar(Calendar calendar) {
		System.out.println("Calendar:");
		for (Date date : calendar.getCalendar()) {			
				System.out.println(date);			
		}
	}
	
}
