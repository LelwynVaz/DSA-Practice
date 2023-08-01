import java.util.Scanner;

public class Armstrong {
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
        int totalDigits;
        int temp, temp1;
        int sum, lastDigit;
        int count = 0;
        for (int i = minNumber; i <= maxNumber; i++) {
            temp = i;
            temp1 = i;
            totalDigits = 0;
            while (temp > 0) {
                temp = temp / 10;
                totalDigits ++;
            }

            lastDigit = 0;
            sum = 0;
            
            while (temp1 > 0) {
                lastDigit = temp1 % 10;
                sum += Math.pow(lastDigit, totalDigits);
                temp1 = temp1 / 10;
            }
            if (sum == i) {
                count ++;
                System.out.print(i + ", ");
            }

        }
        if (count == 0) {
            System.out.println("No Armstrong numbers found!");
        }
    }
}
