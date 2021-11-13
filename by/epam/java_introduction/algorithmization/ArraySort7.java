package by.epam.java_introduction.algorithmization;

//Пусть даны две неубывающие последовательности действительных чисел
//a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
//Требуется указать те места, на которые нужно вставлять элементы последовательности
//b1 <= b2 <= ... <= bm в первую последовательность так, чтобы новая последовательность оставалась возрастающей.

public class ArraySort7 {
	
	public static void main(String[] args) {
		
		double a[] = new double[] {0.3, 2.2, 5.8, 10.2, 19.5, 24.4, 98.2};
		double b[] = new double[] {1.7, 13.6, 55.9};
		int pos = 0;
		
		for (int i = 0; i < b.length; i++) {
			for (int j = pos; j < a.length; j++) {
				if (b[i] <= a[j]) {
					System.out.println("Элемент 'b' = " + b[i] + " необходимо вставить в 'а' в позицию " + (j+1));
					pos++;
					break;					
				}				
			}			
		}

	}

}
