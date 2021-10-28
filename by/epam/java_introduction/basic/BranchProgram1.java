package by.epam.java_introduction.basic;

//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.

public class BranchProgram1 {

    public static void main(String[] args) {

        int angle1 = 20;
        int angle2 = 70;

        if (angle1 + angle2 >= 180) {
            System.out.println("Треугольника не существует");
        }
        else if (angle1 == 90 || angle2 == 90 || angle1 + angle2 == 90) {
            System.out.println("Треугольник существует и он прямоугльный");
        }
        else {
            System.out.println("Треугольник существует");
        }

    }
}
