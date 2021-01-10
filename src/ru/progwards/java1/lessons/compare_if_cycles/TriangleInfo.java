package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c) {

        boolean result = (a < (b + c) && b < (a + c) && c < (a + b));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isTriangle(4, 1, 5));
        System.out.println(isRightTriangle(21, 20, 29));
        System.out.println(isIsoscelesTriangle(6, 6, 6));
    }
    public static boolean isRightTriangle(int a, int b, int c) {
boolean result2 = ((a > c && a > b && a * a == c * c + b * b) || (b > c && b > a && b * b == c * c + a * a) ||
        (c > a && c > b && c * c == a * a + b * b));
return result2;
    }
    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        boolean result3 = ((a == b && a != c) || (a == c && a != b) || (b == c && b != a));
        return result3;

    }
}

