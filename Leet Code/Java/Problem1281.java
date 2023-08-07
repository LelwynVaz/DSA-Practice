import java.util.Scanner;

/**
 * Problem1281
 */
public class Problem1281 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Subtracts the product and sum of digits of an integer");
        System.out.print("Enter an Integer: ");
        int num = in.nextInt();
        int sum = 0;
        int product = 1;

        while (num > 0) {
            int temp = num % 10;
            sum += temp;
            product *= temp;
            num = num / 10;
        }

        System.out.println("Result = " + (product - sum));
    }
}