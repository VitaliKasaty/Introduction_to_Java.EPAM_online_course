package by.epam.java_introduction.class_programming.vacation;

/*Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.*/

public class Main {
	
	public static void main(String[] args) {
		
		VoucherOption vouchers = new VoucherOption();
		Voucher voucher1 = new Voucher("England", VacationType.EXCURSION, TransportType.AUTOMOBILE, FoodType.FB, 10, 2700);
		Voucher voucher2 = new Voucher("USA", VacationType.CRUISE, TransportType.STEAMSHIP, FoodType.UAI, 13, 3600);
		Voucher voucher3 = new Voucher("Russia", VacationType.TREATMENT, TransportType.TRAIN, FoodType.RO, 9, 500);
		Voucher voucher4 = new Voucher("Ukraine", VacationType.SHOPPING, TransportType.AUTOMOBILE, FoodType.RO, 4, 300);
		Voucher voucher5 = new Voucher("Egypt", VacationType.REST, TransportType.AIRPLANE, FoodType.AI, 14, 1500);		
		
		vouchers.addVoucher(voucher1);
		vouchers.addVoucher(voucher2);
		vouchers.addVoucher(voucher3);
		vouchers.addVoucher(voucher4);
		vouchers.addVoucher(voucher5);
		
		vouchers.print();
		vouchers.findByCountry("USA");
		vouchers.sortByPrice();
		vouchers.sortByCountry();
		vouchers.findByVacationType(VacationType.REST);
		vouchers.findByTransportType(TransportType.AUTOMOBILE);
		vouchers.findByFoodType(FoodType.AI);		

	}

}
