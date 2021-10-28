package by.epam.java_introduction.basic;

//Составить программу нахождения произведения квадратов первых двухсот чисел

public class CycleProgram4 {

    public static void main(String[] args) {

        long sum = 1;
        long sumPrevious = 1;
        boolean isOver = false;

        for (int i = 2; i <= 200; i++) {

            sum *= i * i;

            if (sum < sumPrevious || sum == 0 ) {
                System.out.println("Произошло переполнение на " + i + " элементе.");
                System.out.println("Произведение квадратов от 1 до " + (i - 1) +" = " + sumPrevious);
                isOver = true;
                break;
            }
            sumPrevious = sum;
        }

        if (!isOver) {
            System.out.println("Произведение квадратов первых двухсот чисел = " + sum);
        }

    }
}
