package by.epam.java_introduction.class_programming.bank_account;

/*Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно*/

public class BankAccount { //банковский счёт
	
	private static int counterId = 1;
	private int id;		
	private boolean isActive;
	private double balance;	
	
	public BankAccount(Client client, double balance) {
		this.id = counterId++;
		
		this.isActive = true;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Счёт [id: " + id + ", состояние: " + isActive + ", баланс: " + balance + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
