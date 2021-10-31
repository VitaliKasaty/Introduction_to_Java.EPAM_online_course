package by.epam.java_introduction.algorithmization;

//Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.

import java.util.Scanner;

public class ArrayOfArray14 {

    public static void main(String[] args) {

        int a[][];
        int m;
        int n;
        int randomPosition;
        int countOne = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        m = in.nextInt();

        //Для того, чтобы соблюдалось условие "кол-во единиц в столбце = номер столбца"
        //кол-во столбцов должно меньше или равно кол-ву строк
        do {
            System.out.print("Введите число столбцов <= числу строк : ");
            n = in.nextInt();
        } while (n > m);

        a = new int[m][n];

//      Проходим по столбцам, кол-во единиц для стоблца = номер столбца
//      берем случайную позицию в столбце, если она == 0, а счётчик колв-ва
//      единиц для этого столбца не закончился, то присваиваем 1
//      и декрементируем счётчик единиц для этого стобца
        for (int j = 0; j < n; j++) {
            countOne = j + 1;
            while (countOne != 0) {
                randomPosition = (int) (Math.random() * m);
                if (a[randomPosition][j] == 0) {
                    a[randomPosition][j] = 1;
                    countOne--;
                }
            }
        }

        System.out.println("Результат: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + a[i][j] + "] ");
            }
            System.out.println();
        }

    }
}
