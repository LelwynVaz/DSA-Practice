import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();

        if (num < 0) {
            System.out.println(false);
        } else {
            int reverse = 0;
            int tempNum = num;
            while (tempNum > 0) {
                reverse = (reverse * 10) + (tempNum % 10);
                tempNum /= 10;
            }
            if (reverse == num) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}