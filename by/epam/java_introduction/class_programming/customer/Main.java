package by.epam.java_introduction.class_programming.customer;

/*Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

public class Main {
	
	public static void main(String[] args) {
		
		Customer[] costumers;
		CustomerAction customerAction = new CustomerAction();
		costumers = customerAction.createCustomers();
		
		System.out.println("Список клиентов:");
		customerAction.printCustomers(costumers);		
		
		customerAction.sortByNames(costumers);
		System.out.println("\nОтсортировано по алфавиту:");
		customerAction.printCustomers(costumers);
		
		System.out.println("\nОтсортировано по интервалу номера кредитной карточки:");
		customerAction.sortByIntervalNumberCard(costumers, 5000000000000000l, 8000000000000000l);		

	}

}