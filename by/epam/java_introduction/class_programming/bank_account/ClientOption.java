package by.epam.java_introduction.class_programming.bank_account;

import java.util.Comparator;

/*Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно*/

public class ClientOption { //операции над счётом клиента
	
	public void printAllBankAccounts(Client client) {		//поиск(печать) всех счетов клиента			
		for (int i = 0; i < client.getBankAccounts().size(); i++) {	
			System.out.println(client.getBankAccounts().get(i));						
		}
	}
	
	public void printActiveBankAccounts(Client client) {	//поиск(печать) активных счетов клиента			
		for (int i = 0; i < client.getBankAccounts().size(); i++) {				
			if (client.getBankAccounts().get(i).isActive()) {
			System.out.println(client.getBankAccounts().get(i));
			}			
		}
	}
	
	public void findBankAccount(Client client, int id) { 	//поиск(печать) счета клиента по номеру
		System.out.println(client.getBankAccounts().get(id - 1));
	}
	
	public void sortBankAccountsUp(Client client) {		//сортировка счетов клиента по возрастанию
		client.getBankAccounts().sort(Comparator.comparingDouble(BankAccount::getBalance));
	}
	
	public void blockBankAccount(Client client, int id) {  //блокировка счета клиента
		client.getBankAccounts().get(id - 1).setActive(false);
	}
	
	public void unBlockBankAccount(Client client, int id) { //разблокировка счета клиента
		client.getBankAccounts().get(id - 1).setActive(true);
	}
	
	public void allBalanceClient (Client client) {      //вычисление общей суммы по счетам
		double allBalance = 0;
		for (int i = 0; i < client.getBankAccounts().size(); i++) {
			allBalance += client.getBankAccounts().get(i).getBalance();			
		}
		System.out.println("Общая сумма по счетам = " + allBalance);
	} 
	
	public void plusBalanceClient (Client client) {   //вычисление суммы по счетам имеющих положительный баланс 
		double plusBalance = 0;
		for (int i = 0; i < client.getBankAccounts().size(); i++) {				
			if (client.getBankAccounts().get(i).getBalance() > 0) {
			plusBalance += client.getBankAccounts().get(i).getBalance();
			}
		}
		System.out.println("Сумма счетов имеющих положительный баланс = " + plusBalance);
	}
	
	public void minusBalanceClient (Client client) {  //вычисление суммы по счетам имеющих отрицательный баланс
		double minusBalance = 0;
		for (int i = 0; i < client.getBankAccounts().size(); i++) {				
			if (client.getBankAccounts().get(i).getBalance() < 0) {
			minusBalance += client.getBankAccounts().get(i).getBalance();
			}
		}
		System.out.println("Сумма счетов имеющих отрицательный баланс = " + minusBalance);
	}		
		
}