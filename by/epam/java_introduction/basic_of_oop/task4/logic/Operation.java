package by.epam.java_introduction.basic_of_oop.task4.logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.epam.java_introduction.basic_of_oop.task4.bean.DragonCave;
import by.epam.java_introduction.basic_of_oop.task4.bean.Treasure;
import by.epam.java_introduction.basic_of_oop.task4.bean.TypeTreasure;


public class Operation {
	
	public static String pathResource = "src/by/epam/java_introduction/basic_of_oop/task4/resource/";	
	
	public List<Treasure> getTreasureOnSum(DragonCave dragoncave, int sum) {
		List<Treasure> treasures = new ArrayList<>();
		
		for (Treasure treasure : dragoncave.getTreasures()) {
			if (treasure.getPrice() < sum) {
				treasures.add(treasure);
				sum -= treasure.getPrice();
			}
		}			
		return treasures;
	}
	
	public Treasure mostExpensiveTreasure(DragonCave dragonCave) {
		int maxPrice = 0;
		int indexMaxTreasure = 0;
		
		for (int i = 0; i < dragonCave.getTreasures().size(); i++) {
			if(dragonCave.getTreasures().get(i).getPrice() > maxPrice) {
				maxPrice = dragonCave.getTreasures().get(i).getPrice();
				indexMaxTreasure = i;
			}
		}		
		System.out.println("Самое дорогое сокровище:");
		return dragonCave.getTreasures().get(indexMaxTreasure);
	}
	
	public void loadTreasureFromFile(DragonCave dragonCave, String nameFile) {	
		
			try (BufferedReader reader = new BufferedReader(new FileReader(pathResource + nameFile))) {				
				String line = reader.readLine();
				
				while (line != null) {
					String objectTreasure[] = line.split(" ");
					String nameTreasure = objectTreasure[0];
					Enum<TypeTreasure> typeTreasure = TypeTreasure.valueOf(objectTreasure[1]);					
					int priceTreasure = Integer.parseInt(objectTreasure[2]);					
					Treasure treasure = new Treasure(nameTreasure, typeTreasure, priceTreasure);
					dragonCave.addTreasure(treasure);
					line = reader.readLine();
				}
				
				System.out.println("Сокровища для " + dragonCave.getNameDragon() + " загружены успешно!");
				
			} catch (IOException e) {				
				e.printStackTrace();
			} 				
	}
	
	public void saveTreasureFromFile(DragonCave dragonCave, String nameFile) {
		
		try (FileWriter writer = new FileWriter(pathResource + nameFile)) {		
		
		for (Treasure treasure : dragonCave.getTreasures()) {
			writer.append(treasure.getName() + " " + treasure.getTypeTreasure().toString() + " " + Integer.toString(treasure.getPrice()));
			writer.append("\n");
			writer.flush();			
		}				
		
		System.out.println("Сокровища для " + dragonCave.getNameDragon() + " сохранены успешно!");
		
	} catch (IOException e) {		
		e.printStackTrace();
	}
		
	}

}
