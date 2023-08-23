import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nSum = 0;
        int peSum = 0;
        int poSum = 0;
        System.out.println("Enter zero to break the loop");
        while (true) {
            System.out.print("Enter number: ");
            int num = in.nextInt();
            if (num == 0) {
                break;
            }

            if (num > 0 && num % 2 == 0) {
                peSum += num;
            } else if (num > 0 && num % 2 != 0) {
                poSum += num;
            } else {
                nSum += num;
            }
        }
        System.out.println("sum of positive even numbers = " + peSum);
        System.out.println("sum of positive odd numbers = " + poSum);
        System.out.println("sum of negative numbers = " + nSum);
    }
}
