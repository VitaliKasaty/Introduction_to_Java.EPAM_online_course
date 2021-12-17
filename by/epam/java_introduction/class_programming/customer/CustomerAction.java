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

public class CustomerAction {
	
	public Customer[] createCustomers(){
		
		Customer[] customers = new Customer[] {
				 new Customer("Иванов", "Василий", "Петрович", "Беларусь", 5470874051650597l, 75854654337l),
				 new Customer("Петров", "Генадий", "Михайлович", "Россия", 7642086375436754l, 58757837883723l),
				 new Customer("Столбцов", "Виктор", "Сергеевич", "Казахстан", 8574638194829472l, 9457362l),
				 new Customer("Столбцов", "Андрей", "Антонович", "Казахстан", 4574638194829472l, 987335262l),
				 new Customer("Синяк", "Виктор", "Сергеевич", "Россия", 8765438192163749l, 938378722l),
				};
		
		return customers;
	}
	
	public void printCustomers(Customer[] customers) {
		
		for (Customer customer : customers) {
			System.out.println(customer);
			
		}
	}
	
	public void sortByNames(Customer[] customers) {
		Arrays.sort(customers, Comparator.comparing(Customer::getSurName)
							             .thenComparing(Customer::getName)
							             .thenComparing(Customer::getPatronymicName));
	}
	
	public void sortByIntervalNumberCard(Customer[] customers, long startInterval, long endInterval) {
		Stream.of(customers)
			  .filter(customer -> (customer.getNumberCard() >= startInterval) && (customer.getNumberCard() <= endInterval))
			  .forEach(System.out::println);
	}
	
}