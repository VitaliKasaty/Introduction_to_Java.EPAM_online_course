package by.epam.java_introduction.basic_of_oop.task4.main;

import by.epam.java_introduction.basic_of_oop.task4.bean.DragonCave;
import by.epam.java_introduction.basic_of_oop.task4.bean.Treasure;
import by.epam.java_introduction.basic_of_oop.task4.bean.TypeTreasure;
import by.epam.java_introduction.basic_of_oop.task4.logic.Operation;
import by.epam.java_introduction.basic_of_oop.task4.view.ViewTreasure;

/*Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.
Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
выбора сокровищ на заданную сумму.*/

public class Main {
	
	public static void main(String[] args) {
		
		//В вебинарах говорилось, что консольное меню делать не нужно,тк работу с консолью прошли в прошлых модулях 
		//и кол-во сокровищ не ограничивать числом, а все операции продемонстрировать в мейне 
		
		DragonCave dragonCave1 = new DragonCave("Gosha"); 		
		
		Operation operation = new Operation();
		ViewTreasure viewTreasure = new ViewTreasure();
		
		operation.loadTreasureFromFile(dragonCave1, "Treasure.txt"); //загрузка сокровищ дракону из файла
		
		Treasure treasure1 = new Treasure("Amber", TypeTreasure.GEM, 30);
		Treasure treasure2 = new Treasure("Destroyer", TypeTreasure.SWORD, 60);	
		dragonCave1.addTreasure(treasure1, treasure2);	//добавление сокровищ	
		
		viewTreasure.printTreasureOnDragonCave(dragonCave1); //просмотр всех сокровищ		
		viewTreasure.printTreasure(operation.mostExpensiveTreasure(dragonCave1)); //выбор и просмотр самого дорогого сокровища	
		viewTreasure.printListTreasure(operation.getTreasureOnSum(dragonCave1, 400)); //выбор и печать сокровищ на заданную сумму
		
		operation.saveTreasureFromFile(dragonCave1, "Treasure.txt"); //Сохранение сокровищ в файл
	}

}
