import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Reversing the given number");
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int answer = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            answer = (answer * 10) + lastDigit;
            number = number / 10;
        }
        System.out.println("The reverse number is " + answer);
    }
}
