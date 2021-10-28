package by.epam.java_introduction.basic;

//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.

public class BranchProgram4 {

    public static void main(String[] args) {

        int a = 10;
        int b = 8;
        int x = 18;
        int y = 5;
        int z = 9;

        //кирпич пройдёт, если оба отверстия будут >= двум параметрам кирпича
        if ((a >= x || a >= y || a >= z) && (b > x || b >= y || b >= z)) {
            System.out.println("Кирпич пройдёт");
        }
        else {
            System.out.println("Кирпич не пройдёт");
        }

    }
}
