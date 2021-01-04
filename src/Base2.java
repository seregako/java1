public class Base2 {
    public static final String X_EQUALS = "x = ";
    public static final String Y_EQUALS = "y = ";
    public static final String A_EQUALS = "a = ";
    public static final String B_EQUALS = "b = ";
    public static final String C_EQUALS = "c = ";

    public static int subtraction(int x, int y) {
        System.out.print("Вызвана функция subtraction() с параметрами ");
        System.out.print(X_EQUALS + x);
        System.out.print(", " );
        System.out.println(Y_EQUALS + y);
        return x - y;
    }

    public static int addition(int x, int y) {
        System.out.print("Вызвана функция addition() с параметрами ");
        System.out.print(X_EQUALS + x);
        System.out.print(", " );
        System.out.println(Y_EQUALS + y);
        return x + y;
    }
   public static int multiplication(int x, int y) {
       System.out.print("Вызвана функция multiplication() с параметрами ");
       System.out.print(X_EQUALS + x);
       System.out.print(", " );
       System.out.println(Y_EQUALS + y);
       return x * y;
   }
   public static void calculation() {
        int a = 34;
        int b = 55;
        System.out.print(A_EQUALS);
       System.out.println(a);
       System.out.print(B_EQUALS);
       System.out.println(b);
       int c = addition(a, b);
       System.out.println("a + b = " + c);
       int c1 = subtraction(a,b);
       System.out.println("a - b = " + c1);
       int c2 = multiplication(a,b);
       System.out.println("a * b = " + c2);
   }

    public static void calculation(int a, int b, int c) {
        System.out.print("Вызвана функция calculation() с параметрами ");
        System.out.print(A_EQUALS + a + ", ");
        System.out.print(B_EQUALS + b +  ", ");
        System.out.println(C_EQUALS + c);
        int c4 = addition(a,b);
        int c5 = addition(c4,c);
        System.out.println("a + b + c = " + c5);
        int c6 = multiplication(a,a);
        int c7 = multiplication(c6,a);
        System.out.println("a^3 = " + c7);
        int c8 = multiplication(c,c);
        int c9 = addition(b,c8);
        int c10 = subtraction(a,c9);
        System.out.println("a - (b + c^2) = " + c10);
    }
    public static void main(String[]args) {
        subtraction(45,12);
        subtraction(23,55);
        addition(128,787);
        addition(528,387);
        multiplication(124,87);
        multiplication(1528,3);
        calculation();
        calculation(11,25,410);
        calculation(100,9,98);
    }

}
