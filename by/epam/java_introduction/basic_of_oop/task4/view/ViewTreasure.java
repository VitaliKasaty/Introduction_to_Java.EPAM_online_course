package by.epam.java_introduction.basic_of_oop.task4.view;
import java.util.List;

import by.epam.java_introduction.basic_of_oop.task4.bean.DragonCave;
import by.epam.java_introduction.basic_of_oop.task4.bean.Treasure;

public class ViewTreasure {
	
	public void printTreasure(Treasure treasure) {
		System.out.println(treasure);
	}
	
	public void printListTreasure(List<Treasure> treasures) {
		System.out.println("Ваш список сокровищ:");
		for (Treasure treasure : treasures) {
			System.out.println(treasure);
		}
	}
	
	public void printTreasureOnDragonCave(DragonCave dragonCave) {
		System.out.println("Все сокровища дракона " + dragonCave.getNameDragon() + ":");
		for (Treasure treasure : dragonCave.getTreasures()) {
			System.out.println(treasure);
		}
	}

}
