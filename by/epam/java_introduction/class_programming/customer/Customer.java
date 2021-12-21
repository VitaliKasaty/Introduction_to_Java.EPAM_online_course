package by.epam.java_introduction.class_programming.customer;

/*Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

public class Customer {
	
	private static int idCounter = 1; //id клиента уникально и при инициализации объекта инкрементируется
	
	private int id; 
	private String surName;
	private String name;
	private String patronymicName;
	private String adress;
	private long numberCard;
	private long numberBankAccount;
	
	
	public Customer(String surName, String name, String patronymicName, String adress, 
					long numberCard, long numberBankAccount) {		
			
		this.id = idCounter++;
		this.surName = surName;
		this.name = name;
		this.patronymicName = patronymicName;
		this.adress = adress;
		this.numberCard = numberCard;
		this.numberBankAccount = numberBankAccount;
	}


	@Override
	public String toString() {
		return "Покупатель [id=" + id + ", Фамилия: " + surName + ", Имя: " + name + ", Отчество: " + patronymicName
				+ ", адрес = " + adress + ", номер карты: " + numberCard + ", номер банковского счёта: " + numberBankAccount
				+ "]";
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymicName() {
		return patronymicName;
	}

	public void setPatronymicName(String patronymicName) {
		this.patronymicName = patronymicName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public long getNumberCard() {
		return numberCard;
	}

	public void setNumberCard(long numberCard) {
		
		this.numberCard = numberCard; 				
	}

	public long getNumberBankAccount() {
		return numberBankAccount;
	}

	public void setNumberBankAccount(long numberBankAccount) {		
		this.numberBankAccount = numberBankAccount;
	}	

}