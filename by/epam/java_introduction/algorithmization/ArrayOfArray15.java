package by.epam.java_introduction.algorithmization;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class ArrayOfArray15 {

    public static void main(String[] args) {

        int a[][];
        int m = 5;
        int n = 5;
        int max = Integer.MIN_VALUE;
        a = new int[m][n];

        System.out.println("Сформированный массив: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 10);
                if (a[i][j] > max) {
                    max = a[i][j];
                }
                System.out.print("[" + a[i][j] + "] ");
            }
            System.out.println();
        }

        System.out.println("Максимальный элемент = " + max);
        System.out.println("Результат: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    a[i][j] = max;
                }
                System.out.print("[" + a[i][j] + "] ");
            }
            System.out.println();
        }

    }
}
