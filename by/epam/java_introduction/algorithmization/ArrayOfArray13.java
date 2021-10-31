package by.epam.java_introduction.algorithmization;

//Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class ArrayOfArray13 {

    public static void main(String[] args) {

        int a[][];
        int m = 5;
        int n = 5;
        int temp;
        a = new int[m][n];

        System.out.println("Сформированный массив: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 10);
                System.out.print("[" + a[i][j] + "] ");
            }
            System.out.println();
        }

        //сравниваем элемент со следующим и если > меняем их местами
        //возвращаем цикл на начало, снова сравниваем
        //цикл по столбцу закончится когда будет отсортировано по возрастанию
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m - 1; i++) {
                if (a[i][j] > a[i + 1][j]) {
                    temp = a[i][j];
                    a[i][j] = a[i + 1][j];
                    a[i + 1][j] = temp;
                    i = -1;
                }
            }
        }

        System.out.println("Отсортированные столбцы по возрастанию значения элементов: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + a[i][j] + "] ");
            }
            System.out.println();
        }

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m - 1; i++) {
                if (a[i][j] < a[i + 1][j]) {
                    temp = a[i][j];
                    a[i][j] = a[i + 1][j];
                    a[i + 1][j] = temp;
                    i = -1;
                }
            }
        }

        System.out.println("Отсортированные столбцы по уменьшению значения элементов: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + a[i][j] + "] ");
            }
            System.out.println();
        }

    }
}
