package by.epam.java_introduction.class_programming.vacation;

import java.util.ArrayList;
import java.util.Comparator;

/*Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.*/

public class VoucherOption {
	
	private ArrayList<Voucher> vouchers = new ArrayList<>();
	
	public ArrayList<Voucher> getVouchers() {
		return vouchers;
	}

	public void setVouchers(ArrayList<Voucher> vouchers) {
		this.vouchers = vouchers;
	}
	
	public void addVoucher(Voucher voucher) { 	//добавление путевки в список
		vouchers.add(voucher);
	}
	
	public void print() {	//печать путевок		
		for (Voucher voucher : vouchers) {
			System.out.println(voucher);
		}
	}
	
	public void findByCountry(String country) {  //поиск путевок в определенную страну
		for (Voucher voucher : vouchers) {
			if (voucher.getCountry() == country) {
				System.out.println(voucher);
			}			
		}
	}
	
	public void findByVacationType(VacationType vacationType) {  //поиск путевок по типу путешествия
		for (Voucher voucher : vouchers) {
			if (voucher.getVacationType() == vacationType) {
				System.out.println(voucher);
			}			
		}
	}
	
	public void findByTransportType(TransportType transportType) { //поиск путевок по типу транспорта
		for (Voucher voucher : vouchers) {
			if (voucher.getTransportType() == transportType) {
				System.out.println(voucher);
			}			
		}
	}
	
	public void findByFoodType(FoodType foodType) {  //поиск путевок по типу питания
		for (Voucher voucher : vouchers) {
			if (voucher.getFoodType() == foodType) {
				System.out.println(voucher);
			}			
		}
	}
	
	public void sortByPrice() {  //сортировка путевок по цене
		vouchers.sort(Comparator.comparingInt(Voucher::getPrice));
	}
	
	public void sortByCountry() { //сортировка путевок по странам
		vouchers.sort(Comparator.comparing(Voucher::getCountry));
	}	

}
