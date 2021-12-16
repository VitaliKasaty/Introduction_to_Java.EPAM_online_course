package by.epam.java_introduction.class_programming.time;

/*Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
заданное количество часов, минут и секунд.*/

public class Main {
	
	public static void main(String[] args) {
		
		Time time = new Time(18, 5, 9999);
		
		System.out.println(time.toString());
		
		time.setHour(24);
		System.out.println(time.toString());
		
		time.setMinute(43);
		System.out.println(time.toString());
		
		time = new Time(160, 9, 95);
		System.out.println(time.toString());

	}

}
