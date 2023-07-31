import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Checking which is greater number");
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter first number: ");
        int number2 = input.nextInt();

        if (number1 < number2) {
            System.out.println("The greater number is " + number2);
        } else {
            System.out.println("The greater number is " + number1);
        }
    }
}
