import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num1 = in.nextInt();
        System.out.print("Enter number: ");
        int num2 = in.nextInt();
        int sum = add(num1, num2);
        int product = multiply(num1, num2);

        System.out.println("Sum = " + sum + ", Product = " + product);
    }

    static int add(int a, int b) {
        int sum  = a + b;
        return sum;
    }

    static int multiply(int a, int b) {
        int product  = a * b;
        return product;
    }
}
