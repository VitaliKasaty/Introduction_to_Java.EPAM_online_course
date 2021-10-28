package by.epam.java_introduction.basic;

//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
//Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.

public class LinearProgram5 {

    public static void main(String[] args) {

        int t = 7348;
        int hour;
        int min;
        int sec;

        hour = t / 3600;
        min = (t - (hour * 3600)) / 60;
        sec = t - hour * 3600 - min * 60;
        System.out.println(hour + "ч " + min + "мин " + sec + "с.");

    }
}
