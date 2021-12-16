package by.epam.java_introduction.class_programming.time;

/*Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
заданное количество часов, минут и секунд.*/

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	
	public Time(int hour, int minute, int second) { 
		
//		this.hour = hour;      //При таком создании экземпляра класса можно создать время с некорректными параметрами
//		this.minute = minute;  
//		this.second = second;
		
		setHour(hour);       //А при таком значения сразу будут проверятся
		setMinute(minute);
		setSecond(second);
	}


	@Override
	public String toString() {
		return "Время: " + hour + "ч " + minute + "м " + second + "с";
	}

	public int getHour() {
		return hour;
	}


	public void setHour(int hour) {
		
		if(hour >= 0 && hour <= 24) {
			this.hour = hour;
		} else {
			System.out.println("Значение в часах недопустимо. Установлено 0ч.");
			this.hour = 0;
		}	
	}
	
	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		
		if(minute >= 0 && minute <= 60) {
			this.minute = minute;
		} else {
			System.out.println("Значение в минутах недопустимо. Установлено 0м.");
			this.minute = 0;
		}		
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		
		if(second >= 0 && second <= 60) {
			this.minute = second;
		} else {
			System.out.println("Значение в секундах недопустимо. Установлено 0с.");
			this.second = 0;
		}		
	}	

}
