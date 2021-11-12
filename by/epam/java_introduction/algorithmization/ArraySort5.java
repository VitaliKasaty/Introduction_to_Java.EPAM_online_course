package by.epam.java_introduction.algorithmization;

//Сортировка вставками. Дана последовательность чисел  a1, a2, ... , an. 
//Требуется переставить числа в порядке возрастания. Делается это следующим образом.
//Пусть a1, a2, ..., ai - упорядоченная последовательность, т. е. a1 <= a2 <= ... <= ai.
//Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
//последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i + 1 до n
//не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
//с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

public class ArraySort5 {
	
	public static void main(String[] args) {
		
		int a[]; 
		int pos;
		int temp;
		int n = 10;
		a = new int[n];
		
		System.out.println("Случайный массив:");
        for (int i = 0; i < n; i++) {            
        	a[i] = (int) (Math.random() * 100);
        	System.out.print("[" + a[i] + "] ");
        }        
		
		for (int i = 1; i < a.length; i++) {			
			if (a[i] < a[i - 1]) {
				pos = binarySearchPos(a, 0, i, a[i]);
				temp = a[i];
				for(int j = i; j > pos; j--) {
					a[j] = a[j - 1];					
				}				
				a[pos] = temp;
			}			
		}
		
		System.out.println("\nОтсортирован вставками с бинарным поиском:");
		for (int i = 0; i < a.length; i++) {
			System.out.print("[" + a[i] + "] ");
		}

	}
	
	public static int binarySearchPos(int a[],int firstIndex, int lastIndex, int elem) {
		
		while (firstIndex <= lastIndex) {
			int midleIndex = (firstIndex + lastIndex) / 2;
			
			if (a[midleIndex] < elem) {
				firstIndex = midleIndex + 1;
			} else if (a[midleIndex] > elem) {
				lastIndex = midleIndex - 1;
			} else {
				return midleIndex;
			}		
		}		
		return firstIndex;
	}

}
