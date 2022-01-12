package by.epam.java_introduction.basic_of_oop.task4.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DragonCave implements Serializable{
			
	private static final long serialVersionUID = -7017815933926353176L;
	
	private String nameDragon;
	private List<Treasure> treasures = new ArrayList<>();
	
	public DragonCave() {
		
	}
	
	public DragonCave(String nameDragon) {		
		this.nameDragon = nameDragon;		
	}

	public DragonCave(String nameDragon, List<Treasure> treasures) {		
		this.nameDragon = nameDragon;
		this.treasures = treasures;
	}
	
	public void addTreasure(Treasure... treasures) {
		for (Treasure treasure : treasures) {
			this.treasures.add(treasure);
		}
	}

	public String getNameDragon() {
		return nameDragon;
	}

	public void setNameDragon(String nameDragon) {
		this.nameDragon = nameDragon;
	}

	public List<Treasure> getTreasures() {
		return treasures;
	}

	public void setTreasures(List<Treasure> treasures) {
		this.treasures = treasures;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameDragon == null) ? 0 : nameDragon.hashCode());
		result = prime * result + ((treasures == null) ? 0 : treasures.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		DragonCave other = (DragonCave) obj;
		if (nameDragon == null) {
			if (other.nameDragon != null) {
				return false;
			}
		} else if (!nameDragon.equals(other.nameDragon)) {
			return false;
		}
		if (treasures == null) {
			if (other.treasures != null) {
				return false;
			}
		} else if (!treasures.equals(other.treasures)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "DragonCave [nameDragon=" + nameDragon + ", treasures=" + treasures + "]";
	}

}
