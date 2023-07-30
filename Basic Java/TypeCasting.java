import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();

        // System.out.println(num);

    //    Typecasting 
        int floatNum = (int)(452.46f);
        System.out.println(floatNum);

        // Automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a);

        System.out.println(b);

        byte p = 40;
        byte q =50;
        byte r = 100;
        int d = (p * q) / r; //The expression p * q is performed using integers to store the bigger value then a byte can store only because d is of type integer.

        System.out.println(d);

        // java is working on unicode values

        System.out.println("\u0928\u092E\u0938\u094D\u0924\u0947");

        byte by = 42;
        char ch = 'a';
        short sh = 1024;
        int i = 50000;
        float fl = 6.58f;
        double dl = 0.123456;
        double result = (fl *by) + (i / ch) - (dl - sh);
        System.out.println((fl *by) + " " + (i / ch) + " " + (dl - sh));
        System.out.println(result);

    }
}
