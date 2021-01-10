package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c) {
        int d = 1;
        if (a >= b && a >= c);
        d = a;
        if (b >= a && b >= c)
        d = b;
       if (c >= a && c >= b)
        d = c;
       return d;
    }
    public static int minSide(int a, int b, int c) {
        int d = 1;
        if (a <= b && a <= c)
        d = a;
        if (b <= a && b <= c)
            d = b;
        if (c <= a && c <= b)
            d = c;
        return d;
    }

    public static void main(String[] args) {
        System.out.println(maxSide(8,10,10));
        System.out.println(minSide(5,4,4));
        System.out.println(isEquilateralTriangle(1,1,1));
    }
    public static boolean isEquilateralTriangle(int a, int b, int c) {
        boolean result1 = a == b && b == c;
        return result1;
    }
}

