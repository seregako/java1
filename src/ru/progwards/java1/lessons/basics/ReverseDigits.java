package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static final double π = 3.14;
    public static int reverseDigits(int number) {
       int number1 = number % 10;
       //первая цифра с конца
       int number2 = (number - number1) / 10;
       int number3 = number2 % 10;
       //вторая цифра с конца
       int number4 = (number2 - number3) / 10;
       //третья цифра с конца
int result = (number1 * 100) + (number3 * 10) + (number4);
return result;
    }
    public static Double sphereSquare(Double r) {
        double S = 4 * π * r * 2;
        return S;
        }
    public static Double earthSquare() {
       double earthSquare1 = sphereSquare(6371.2);
       return  earthSquare1;
    }
    public static Double mercurySquare() {
        double mercurySquare1 = sphereSquare(2439.7);
        return mercurySquare1;
    }
    public static Double jupiterSquare() {
        double jupiterSquare1 = sphereSquare(71492.0);
        return jupiterSquare1;
    }
    public static Double earthVsMercury() {
       double earthVsMercury1 = earthSquare() / mercurySquare();
       return earthVsMercury1;
    }
    public static Double earthVsJupiter() {
        double earthVsJupiter1 = earthSquare() / jupiterSquare();
        return earthVsJupiter1;
    }
    public static double volumeBallDouble(double radius) {
        double volumeBallDouble1 = 4 / 3 * π * radius * 3;
        return volumeBallDouble1;
    }
    public static float volumeBallFloat(float radius) {
        float volumeBallFloat1 = (float) (4 / 3 * π * radius * 3);
        return volumeBallFloat1;
    }
    public static double calculateAccuracy(double radius) {
        double calculateAccuracy1 = volumeBallDouble(6371.2) - volumeBallFloat((float) 6371.2);
        return calculateAccuracy1;
    }
    public static void main(String[] args) {
        System.out.println(reverseDigits(126));
        System.out.println(sphereSquare(356.00));
        System.out.println(earthSquare());
        System.out.println(mercurySquare());
        System.out.println(jupiterSquare());
        System.out.println(earthVsJupiter());
        System.out.println(earthVsMercury());
        System.out.println (calculateAccuracy(1));

    }
}
