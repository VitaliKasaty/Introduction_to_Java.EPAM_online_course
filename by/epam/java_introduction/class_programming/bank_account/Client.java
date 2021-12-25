package by.epam.java_introduction.class_programming.bank_account;

import java.util.ArrayList;

/*Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно*/

public class Client {   //банковский клиент, имеет список счетов
	
	private static int counterId = 1;
	private int id;
	private String nameClient;
	private String fullNameClient;
	private ArrayList<BankAccount> bankAccounts = new ArrayList<>();
	
	public Client(String nameClient, String fullNameClient) {		
		this.id = counterId++;
		this.nameClient = nameClient;
		this.fullNameClient = fullNameClient;		
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nameClient=" + nameClient + ", fullNameClient=" + fullNameClient
				+ ", bankAccounts=" + bankAccounts + "]";
	}
	
	public void addBankAccount(BankAccount bankAccount) {
		bankAccounts.add(bankAccount);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameClient() {
		return nameClient;
	}

	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}

	public String getFullNameClient() {
		return fullNameClient;
	}

	public void setFullNameClient(String fullNameClient) {
		this.fullNameClient = fullNameClient;
	}

	public ArrayList<BankAccount> getBankAccounts() {
		return bankAccounts;
	}

	public void setBankAccounts(ArrayList<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}

}
