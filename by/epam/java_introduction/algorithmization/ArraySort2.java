package by.epam.java_introduction.algorithmization;

//Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. Образовать из них новую последовательность
//чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.

public class ArraySort2 {
	
	public static void main(String[] args) {
		
		int a[] = new int[] {1, 6, 6, 6, 19, 26, 34, 56};
		int b[] = new int[] {2, 26, 56, 99};
		int ab[] = new int[a.length + b.length]; 
		
		//В java размер массива статичен, иначе пришлось бы использовать ArrayList или просто выводить последовательность на экран
		
		int j = 0;
		int z = 0;
		int posA = a[j];
		int posB = b[z];
				
		for (int i = 0; i < ab.length; i++) {
			
			if (posA < posB) {
				ab[i] = posA;				
				if (++j < a.length) {
					posA = a[j];
				} else {
					posA = Integer.MAX_VALUE;
				}				
			} else {
				ab[i] = posB;				
				if (++z < b.length) {
					posB = b[z];
				} else {
					posB = Integer.MAX_VALUE;
				}				
			}
			
		}
		
		for (int i : ab) {
			System.out.print("[" + i + "] ");
		}

	}
}
