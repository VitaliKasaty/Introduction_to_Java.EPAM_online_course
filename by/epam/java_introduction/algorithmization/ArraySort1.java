package by.epam.java_introduction.algorithmization;

//Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//дополнительный массив.

public class ArraySort1 {
	
	public static void main(String[] args) {
		
		int a[] = new int[] {1, 2, 3, 4, 5, 6};
		int b[] = new int[] {7, 8, 9};
		int k = 3;
		int ab[] = new int[a.length + b.length]; 
		int count = 0;
		
		//В java размер массива статичен, иначе пришлось бы использовать ArrayList или просто выводить последовательность на экран
		
		for (int i = 0; i < ab.length; i++) {
			if (i < k) {
				ab[i] = a[i];				
			} else if (count < b.length) {
				ab[i] = b[count];
				count++;				
			} else {
				ab[i] = a[i - b.length];
			}			
		}
		
		for (int i : ab) {
			System.out.print("[" + i + "] ");
		}

	}
}
