import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Checking for greatest of 3 numbers");
        System.out.println("Enter number: ");
        int number1 = in.nextInt();
        System.out.println("Enter number: ");
        int number2 = in.nextInt();
        System.out.println("Enter number: ");
        int number3 = in.nextInt();

        int max = number1;

        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }

        // easy method 

        int maximum = Math.max(Math.max(number1, number2), number3);

        System.out.println("Greatest number found using if statement is " + max);
        System.out.println("Greatest number found using Math formula (Max method) is " + maximum);
    }
}
