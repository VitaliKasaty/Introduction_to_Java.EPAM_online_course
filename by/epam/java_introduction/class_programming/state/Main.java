package by.epam.java_introduction.class_programming.state;

/*Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
столицу, количество областей, площадь, областные центры. */

public class Main {
	
	public static void main(String[] args) {
				
		//Государство состоит из столицы и областей, область состоит из районов, города входят в районы.
		//В беларуси правда не у всех городов есть свои районы, но реализовано исходя из условия.
		
		City polock = new City("Полоцк", "Франциска скорины");
		City vetrino = new City("Ветрино", "Юбилейная");     						 //два города и район из них
		District polockiy = new District("Полоцкий", polock, vetrino);
		
		City novopolock = new City("Новополоцк", "Молодёжная");
		City borovuha = new City("Боровуха", "Центральная"); 						 //два города и район из них
		District novopolockiy = new District("Новополоцкий", novopolock, borovuha);
		
		City vitebsk = new City("Витебск","Победы"); 								 //город для областного центра
															
		Region vitebskay = new Region("Витебская", vitebsk, polockiy, novopolockiy); //область из областного центра и районов
		
		City zaslavl = new City("Заславль", "Победителей");
		City machulischi = new City("Мачулищи", "Восстания");						 //два города и район из них
		District minskiy = new District("Минская", zaslavl, machulischi);
		
		City dzerzhinsk = new City("Дзержинск", "Максима Богдановича");
		City borovoe = new City("Боровое", "Ясная поляна"); 						//два города и район из них
		District dzerzhinskiy = new District("Дзержинский", dzerzhinsk, borovoe);
		
		City minsk = new City("Минск", "Независимости");							//город для областного центра и столицы
		
		Region minskaya = new Region("Минская", minsk, minskiy, dzerzhinskiy);      //область из областного центра и районов
		
		State belarus = new State("Беларусь", minsk, vitebskay, minskaya);          //государство из столицы и областных центров
		
		//Методы через гетеры и аналогичные кастомные:
		
		//Вывести на консоль столицу
		System.out.println(belarus.getCapital().getCityName());
		belarus.printCapital();
		
		//Вывести на консоль количество областей
		System.out.println(belarus.getRegions().size());
		belarus.printCountRegions();
		
		//Вывести на консоль площадь
		System.out.println(minsk.getSquare());
		minsk.printSquare();
		
		//Вывести на консоль областные центры
		belarus.printRegionsCentre();		
	}

}
