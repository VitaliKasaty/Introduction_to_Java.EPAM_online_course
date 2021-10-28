package by.epam.java_introduction.basic;

//Найти max{min(a, b), min(c, d)}.

public class BranchProgram2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 6;
        int c = 14;
        int d = 3;
        int max;
        int minAB;
        int minCD;

//      max = Math.max(Math.min(a,b), Math.min(c,d)); //упрощенно

//      с ветвлением
        if (a < b) {
            minAB = a;
        }
        else {
            minAB = b;
        }

        if (c < d) {
            minCD = c;
        }
        else {
            minCD = d;
        }

        if (minAB > minCD) {
            max = minAB;
        }
        else {
            max = minCD;
        }

        System.out.println(max);

    }
}
