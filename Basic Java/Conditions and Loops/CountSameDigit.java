import java.util.Scanner;

public class CountSameDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Counting the number of 3 in entered number");
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int count = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit == 3) {
                count += 1;
            }
            num = num / 10;
        }

        if (count > 0) {
            System.out.println("The digit 3 occoured " + count + " times");
        } else {
            System.out.println("Digit 3 is not present in a number");
        }
    }
}
