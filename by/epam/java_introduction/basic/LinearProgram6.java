package by.epam.java_introduction.basic;

//Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//принадлежит закрашенной области, и false — в противном случае:

public class LinearProgram6 {

    public static void main(String[] args) {

        int x = -3;
        int y = -2;
        boolean space1;
        boolean space2;

        space1 = (x >= -4 && x <= 4) && (y >= -3 && y <= 0);
        space2 = (x >= -2 && x <= 2) && (y >= 0 && y <= 4);
        System.out.println(space1 || space2);

    }
}
