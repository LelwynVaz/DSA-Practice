import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num1 = in.nextInt();
        System.out.print("Enter number: ");
        int num2 = in.nextInt();
        System.out.print("Enter number: ");
        int num3 = in.nextInt();

        int max = maxNum(num1, num2, num3);
        int min = minNum(num1, num2, num3);
        System.out.println("Greatest number = " + max + " and Smallest number = " + min);
    }

    static int maxNum(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }

    static int minNum(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }

        if (c < min) {
            min = c;
        }

        return min;
    }
}
