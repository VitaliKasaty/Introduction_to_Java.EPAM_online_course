package by.epam.java_introduction.basic_of_oop.task2;

import by.epam.java_introduction.basic_of_oop.task2.Payment.Product;

/*Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
нескольких товаров.*/

public class Main {
	
	public static void main(String[] args) {
		
		Payment payment1 = new Payment();
		PaymentOperation paymentOperation = new PaymentOperation();
		
		Product egg1 = new Product("Egg babuskini", 2.36);
		Product milk1 = new Product("Milk Ivanovo", 1.78);
		Product milk2 = new Product("Milk Polockoe", 1.85);
		
		payment1.addProduct(egg1, milk1, milk2);
		payment1.removeProduct(milk1);
		paymentOperation.viewPayments(payment1);
		
		System.out.println("Sum of payment: " + paymentOperation.sumPayments(payment1));		

	}

}
