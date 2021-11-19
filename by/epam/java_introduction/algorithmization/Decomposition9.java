package by.epam.java_introduction.algorithmization;

/*  Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
 *  если угол между сторонами длиной X и Y— прямой. */

public class Decomposition9 {
	
	public static void main(String[] args) {

		int x = 7;
		int y = 18;
		int z = 4;
		int t = 23;
		double area;
		
		area = areaQuadrangle(x, y, z, t);
		System.out.println("Площадь = " + area);	
		
	}
	
	public static double areaQuadrangle (int x, int y, int z, int t) { // По формуле Брахмагупты
		
		double p; // полупериметр
		double area;
		
		p = (x + y + z + t) / 2;
		area = Math.sqrt((p - x) * (p - y) * (p - z) * (p - t));
		
		return area;
	}

}
