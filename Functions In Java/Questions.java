import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        System.out.println("Prime Number: " + isPrimeNumber(num));
        System.out.println("Armstrong Number: " + isArmstrong(num));

        System.out.println("All 3 digits Armstrong numbers: ");

        for(int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= num) {
            if(num % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > num;
    }

    static boolean isArmstrong(int num) {
        int sum = 0;
        int temp = num;
        int digits = 0;
        int temp1 = num;
        while (temp1 > 0) {
            digits += 1;
            temp1 /= 10;
        }
        while (temp > 0) {
            int last = temp % 10;
            sum += Math.pow(last, digits);
            temp /= 10;
        }

        return sum == num;
    }
}
