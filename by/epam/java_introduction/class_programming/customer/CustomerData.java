package by.epam.java_introduction.class_programming.customer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

/*Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

public class CustomerData {
	
	private Customer[] customers;

	public CustomerData(Customer[] customers) {
		this.customers = customers;
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}	

	public void printCustomers() {
		
		Stream.of(customers).forEach(System.out::println);
	}
	
	public void sortByNames() {
		Arrays.sort(customers, Comparator.comparing(Customer::getSurName)
							             .thenComparing(Customer::getName)
							             .thenComparing(Customer::getPatronymicName));
	}
	
	public void sortByIntervalNumberCard(long startInterval, long endInterval) {
		Stream.of(customers)
			  .filter(customer -> (customer.getNumberCard() >= startInterval) && (customer.getNumberCard() <= endInterval))
			  .forEach(System.out::println);
	}

}
