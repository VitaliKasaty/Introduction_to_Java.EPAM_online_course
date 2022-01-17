package by.epam.java_introduction.basic_of_oop.task5.task5_1.bean.flower_composition;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import by.epam.java_introduction.basic_of_oop.task5.task5_1.bean.flower.FlowerInterface;
import by.epam.java_introduction.basic_of_oop.task5.task5_1.bean.wrap.WrapInterface;

public class FlowerComposition implements Serializable {
	
	private static final long serialVersionUID = -2148499082086130509L;
	
	private List<FlowerInterface> flowers = new ArrayList<>();
	private List<WrapInterface> wraps = new ArrayList<>();
	
	public FlowerComposition() {		
	}
	
	public FlowerComposition(List<FlowerInterface> flowers, List<WrapInterface> wraps) {
		this.flowers = flowers;
		this.wraps = wraps;
	}
	
	public void addFlower(FlowerInterface flower) {		
			this.flowers.add(flower);		
	}
	
	public void addWrap(WrapInterface wrap) {				
			this.wraps.add(wrap);		
	}

	public List<FlowerInterface> getFlowers() {
		return flowers;
	}

	public void setFlowers(List<FlowerInterface> flowers) {
		this.flowers = flowers;
	}

	public List<WrapInterface> getWraps() {
		return wraps;
	}

	public void setWraps(List<WrapInterface> wraps) {
		this.wraps = wraps;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flowers == null) ? 0 : flowers.hashCode());
		result = prime * result + ((wraps == null) ? 0 : wraps.hashCode());
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
		FlowerComposition other = (FlowerComposition) obj;
		if (flowers == null) {
			if (other.flowers != null) {
				return false;
			}
		} else if (!flowers.equals(other.flowers)) {
			return false;
		}
		if (wraps == null) {
			if (other.wraps != null) {
				return false;
			}
		} else if (!wraps.equals(other.wraps)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "FlowerComposition [flowers=" + flowers + ", wraps=" + wraps + "]";
	}
	

}
