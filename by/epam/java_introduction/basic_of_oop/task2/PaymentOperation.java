package by.epam.java_introduction.basic_of_oop.task2;


public class PaymentOperation {
	
	public void viewPayments(Payment payment) {
		System.out.println("List of payments:");
		
		for (Payment.Product product : payment.getPayments()) {
			System.out.println(product);
		}
	}
	
	public double sumPayments(Payment payment) {
		
		double sum = 0;
		
		for (Payment.Product product : payment.getPayments()) {
			sum += product.getPrice();
		}		
		return sum;
		
	}

}
