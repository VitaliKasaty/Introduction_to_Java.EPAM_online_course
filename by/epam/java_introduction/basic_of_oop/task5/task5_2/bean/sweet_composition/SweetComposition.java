package by.epam.java_introduction.basic_of_oop.task5.task5_2.bean.sweet_composition;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import by.epam.java_introduction.basic_of_oop.task5.task5_2.bean.sweet.Sweet;
import by.epam.java_introduction.basic_of_oop.task5.task5_2.bean.wrap.Wrap;

public class SweetComposition implements Serializable{
	
	private static final long serialVersionUID = -8746311375481637946L;
	
	private List<Sweet> sweets = new ArrayList<>();
	private Wrap wrap;
	
	public SweetComposition() {			
	}
	
	public SweetComposition(List<Sweet> sweets, Wrap wrap) {		
		this.sweets = sweets;
		this.wrap = wrap;
	}
	
	public void addSweet(Sweet sweet) {
		sweets.add(sweet);
	}

	public List<Sweet> getSweets() {
		return sweets;
	}

	public void setSweets(List<Sweet> sweets) {
		this.sweets = sweets;
	}

	public Wrap getWrap() {
		return wrap;
	}

	public void setWrap(Wrap wrap) {
		this.wrap = wrap;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sweets == null) ? 0 : sweets.hashCode());
		result = prime * result + ((wrap == null) ? 0 : wrap.hashCode());
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
		SweetComposition other = (SweetComposition) obj;
		if (sweets == null) {
			if (other.sweets != null) {
				return false;
			}
		} else if (!sweets.equals(other.sweets)) {
			return false;
		}
		if (wrap == null) {
			if (other.wrap != null) {
				return false;
			}
		} else if (!wrap.equals(other.wrap)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "SweetComposition [sweets=" + sweets + ", wrap=" + wrap + "]";
	}	
	
}
