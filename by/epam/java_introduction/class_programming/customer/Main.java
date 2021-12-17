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
		
		Customer[] customersShop1 = new Customer[] {
				 new Customer("Иванов", "Василий", "Петрович", "Беларусь", 5470874051650597l, 75854654337l),
				 new Customer("Петров", "Генадий", "Михайлович", "Россия", 3642086375436754l, 58757837883723l),
				 new Customer("Столбцов", "Виктор", "Сергеевич", "Казахстан", 6574638194829472l, 9457362l),
				 new Customer("Столбцов", "Андрей", "Антонович", "Казахстан", 4574638194829472l, 987335262l),
				 new Customer("Синяк", "Виктор", "Сергеевич", "Россия", 8765438192163749l, 938378722l),
				};		
		
		CustomerData shop1 = new CustomerData(customersShop1);
		
		System.out.println("Сформированный список покупателей первого магазина:");
		shop1.printCustomers(customersShop1);
		
		System.out.println("\nCписок покупателей в алфавитном порядке:");
		shop1.sortByNames(customersShop1);
		shop1.printCustomers(customersShop1);		
		
		System.out.println("\nCписок покупателей, у которых номер кредитной карточки находится в заданном интервале:");
		shop1.sortByIntervalNumberCard(customersShop1, 5000000000000000l, 8000000000000000l);
		
	}

}