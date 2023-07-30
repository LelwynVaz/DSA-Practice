import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("This program adds two numbers");
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        System.out.println("Enter a number:");
        float num2 = input.nextFloat();
        float sum = num1 + num2;
        System.out.println("The sum is " + sum);
    }
}
