import java.util.Scanner;

public class ArmstrongFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Displaying armstrong numbers between the inputs provided");
        System.out.print("Enter the starting number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the ending number: ");
        int number2 = input.nextInt();

        int maxNumber, minNumber;

        if (number1 < number2) {
            maxNumber = number2;
            minNumber = number1;
        } else {
            maxNumber = number1;
            minNumber = number2;
        }
        int countDigit, lastDigit, sum;
        int countArm = 0;
        for (int i = minNumber; i <= maxNumber; i++) {
            countDigit = 0;
            sum = 0;
            lastDigit = 0;
            for ( int j = i; j != 0; j /= 10) {
                countDigit += 1;
            }
            for (int k = i; k != 0; k /= 10) {
                lastDigit = k % 10;
                sum += Math.pow(lastDigit, countDigit);
            }
            if(sum == i) {
                System.out.print(i + " ");
                countArm += 1;
            }
        }
        if (countArm == 0) {
            System.out.println("Armstrong numbers not found!");
        }
    }
}
