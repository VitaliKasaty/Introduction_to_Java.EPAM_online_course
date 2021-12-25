package by.epam.java_introduction.class_programming.bank_account;

import java.util.ArrayList;

/*Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно*/

public class Bank {		//банк имеет список клиентов
	
	private String nameBank;
	private ArrayList<Client> clients = new ArrayList<Client>();
	
	public Bank(String nameBank) {
		this.nameBank = nameBank;		
	}

	@Override
	public String toString() {
		return "Bank [nameBank=" + nameBank + ", clients=" + clients + "]";
	}
	
	public void addClient(Client client) {
		clients.add(client);
	}

	public String getNameBank() {
		return nameBank;
	}

	public void setNameBank(String nameBank) {
		this.nameBank = nameBank;
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}
	

}
