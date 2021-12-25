package by.epam.java_introduction.class_programming.bank_account;

/*Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно*/

public class Main {
	
	public static void main(String[] args) { // Банк содержит список клиентов, за клиентами закреплен список счетов
		
		Bank belasrusbank = new Bank("Беларусбанк");	
		
		Client client1 = new Client("Василий", "Морозов");
		
		ClientOption clientOption = new ClientOption();
		
		belasrusbank.addClient(client1);		
		
		BankAccount bankAccount1 = new BankAccount(client1, 150.0);
		BankAccount bankAccount2 = new BankAccount(client1, -12.98);
		BankAccount bankAccount3 = new BankAccount(client1, 300.0);
		BankAccount bankAccount4 = new BankAccount(client1, -157.18);		
		client1.addBankAccount(bankAccount1);
		client1.addBankAccount(bankAccount2);		
		client1.addBankAccount(bankAccount3);
		client1.addBankAccount(bankAccount4);

		clientOption.blockBankAccount(client1, 2);   //блокировка счета клиента
		clientOption.unBlockBankAccount(client1, 2); //разблокировка счета клиента
		clientOption.findBankAccount(client1, 2);    //поиск счета клиента по id(номеру счёта)
		clientOption.sortBankAccountsUp(client1); 	 //сортировка счетов по возрастанию баланса
		clientOption.allBalanceClient(client1);		 //общий баланс
		clientOption.plusBalanceClient(client1); 	 //плюсовой баланс
		clientOption.minusBalanceClient(client1);	 //минусовой баланс		
		
	}
}
