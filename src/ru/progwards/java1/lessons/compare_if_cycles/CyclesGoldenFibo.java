package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {
        int x;
        int x1;
        int x2 = number * 10;
        boolean z;
        do {
            x = x2 /= 10;
            x1 = x % 10;

        } while (digit != x1 || x == 0);
        {
            if (digit == x1) {
                z = true;
            } else z = false;
        }
        return z;
    }


    public static int fiboNumber(int n) {
        int x = 0;
        int x1 = 1;
        for (int y = 1; y < n; y++) {
            x1 = x + x1;
            x = x1 - x;
        }
        return x1;
    }

    public static boolean isGoldenTriangle(int a, int b, int c) {

        double e = a / c;
        if (a == b && a != c)
            e = (double) a / c;
        if (a == c && a != b)
            e = (double) a / b;
        if (b == c && b != a)
            e = (double) b / a;
        boolean z = e >= 1.61703 && e <= 1.61903;
        return z;
    }

    public static void main(String[] args) {
        int x = 0;
        int x1 = 1;
        int n = 15;
        double u;
        for (int y = 1; y <= n; y++) {
            x1 = x + x1;
            x = x1 - x;
            System.out.print(x + " ");
            u = (double) x1 / x;
            if (x1 <= 100 && u >= 1.61703 && u <= 1.61903) {
                System.out.print("стороны золотого треугольника" + x + " ");
                System.out.println(x1);
            }
        }
        }


        }


//        Далее в функции public static void main(String[] args) вывести на консоль, используя цикл,
//        15 первых чисел Фибоначчи. После этого, используя вложенные циклы, определить: есть ли среди
//        треугольников, длины сторон которых являются натуральными числами Фибоначчи не превышающими 100,
//        Золотые треугольники. Таким образом одно число Фибоначчи является одной парой сторон треугольника,
//        а следующее является снованием. И если найдены Золотые треугольники, вывести на консоль длины основания
//        и рёбер этих треугольников.
//        Если всё получилось, посмотрите на консоль и сделайте вывод: есть ли связь между числами Фибоначчи
//        и Золотыми треугольниками.