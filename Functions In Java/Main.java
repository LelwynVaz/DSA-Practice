import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        sum();
        int answer = theSum();
        System.out.println("The answer is " + answer);

        int ans = sum3(20, 45);
        System.out.println("Ans = " + ans);
    }

    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static int theSum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = in.nextInt();
        System.out.print("Enter a number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;

        return sum;
        // System.out.println("This will never execute");
    }

    static void sum () {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = in.nextInt();
        System.out.print("Enter a number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;

        System.out.println("The sum is " + sum);

    }
}