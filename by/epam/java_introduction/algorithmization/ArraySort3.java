package by.epam.java_introduction.algorithmization;

//Сортировка выбором. Дана последовательность чисел
//a1 <= a2 <= ... <= an. Требуется переставить элементы так,чтобы они были расположены по убыванию. 
//Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место, а первый - на место наибольшего.
//Затем, начиная со второго, эта процедура повторяется. Написать алгоритм сортировки выбором

public class ArraySort3 {
	
	public static void main(String[] args) {
		
		int a[] = new int[] {2, 6, 6, 10, 19, 26, 34, 56};
		int max;
		int temp;		
		
		for (int i = 0; i < a.length; i++) {
			max = a[i];
			
			for (int j = i + 1; j < a.length; j++) {
				if(a[j] > max) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}			
		}
		
		for (int i : a) {
			System.out.print("[" + i + "] ");
		}

	}
}
