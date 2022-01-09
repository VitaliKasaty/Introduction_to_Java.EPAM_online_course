package by.epam.java_introduction.basic_of_oop.task3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Calendar implements Serializable {	
	
	private static final long serialVersionUID = 91913215054180826L;
	
	private List<Date> calendar;
	
	{
		calendar = new ArrayList<>();
	}
	
	public void addDay(Date... dates) {		
		for (Date date : dates) {
			calendar.add(date);
		}		
	}
	
	public void removeDay(Date date) {
		calendar.remove(date);
	}
	
	public List<Date> getCalendar() {
		return calendar;
	}

	public void setCalendar(List<Date> calendar) {
		this.calendar = calendar;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calendar == null) ? 0 : calendar.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Calendar other = (Calendar) obj;
		if (calendar == null) {
			if (other.calendar != null) {
				return false;
			}
		} else if (!calendar.equals(other.calendar)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Calendar [calendar=" + calendar + "]";
	}
	

	public static class Date {
		
		private int numOfDay;
		private int months;
		private int year;
		private boolean worked;	 //простой рабочий день
		private boolean dayOff;  //обычный выходной, например сб/вс
		private boolean holiday; //праздничный день
		
		{
			worked = true;
			dayOff = false;
			holiday = false;
		}	
		
		public Date() {	
			
		}

		public Date(int numOfDay, int months, int year) {
			
			this.numOfDay = numOfDay;
			this.months = months;
			this.year = year;
		}

		public Date(int numOfDay, int months, int year, boolean dayOff, boolean holiday) {			
			this.numOfDay = numOfDay;
			this.months = months;
			this.year = year;
			this.dayOff = dayOff;
			this.holiday = holiday;
		}

		public int getNumOfDay() {
			return numOfDay;
		}

		public void setNumOfDay(int numOfDay) {
			this.numOfDay = numOfDay;
		}

		public int getMonths() {
			return months;
		}

		public void setMonths(int months) {
			this.months = months;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public boolean isWorked() {
			return worked;
		}

		public void setWorked(boolean worked) {
			this.worked = worked;
		}

		public boolean isDayOff() {
			return dayOff;
		}

		public void setDayOff(boolean dayOff) {
			this.dayOff = dayOff;
		}

		public boolean isHoliday() {
			return holiday;
		}

		public void setHoliday(boolean holiday) {
			this.holiday = holiday;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (dayOff ? 1231 : 1237);
			result = prime * result + (holiday ? 1231 : 1237);
			result = prime * result + months;
			result = prime * result + numOfDay;
			result = prime * result + (worked ? 1231 : 1237);
			result = prime * result + year;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (getClass() != obj.getClass()) {
				return false;
			}
			Date other = (Date) obj;
			if (dayOff != other.dayOff) {
				return false;
			}
			if (holiday != other.holiday) {
				return false;
			}
			if (months != other.months) {
				return false;
			}
			if (numOfDay != other.numOfDay) {
				return false;
			}
			if (worked != other.worked) {
				return false;
			}
			if (year != other.year) {
				return false;
			}
			return true;
		}

		@Override
		public String toString() {
			return "Date [numOfDay=" + numOfDay + ", months=" + months + ", year=" + year + ", worked=" + worked
					+ ", dayOff=" + dayOff + ", holiday=" + holiday + "]";
		}
		
	}

}
