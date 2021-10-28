package by.epam.java_introduction.basic;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class BranchProgram3 {

    public static void main(String[] args) {

        int x1 = -2;
        int y1 = 5;
        int x2 = 4;
        int y2 = 3;
        int x3 = 16;
        int y3 = -1;

        // через площадь треугольника по трём координатам, если площадь треугольника равно 0, то они лежат на одной прямой
        if ((x1 - x3) * (y2-y3) - (x2 - x3) * (y1 - y3) == 0) {
            System.out.println("Точки лежат на одной прямой");
        }
        else {
            System.out.println("Точки не лежат на одной прямой");
        }

    }
}
