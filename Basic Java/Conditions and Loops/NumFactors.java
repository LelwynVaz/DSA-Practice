import java.util.Scanner;

public class NumFactors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Know All the factors of entered number");
        System.out.print("Enter any number: ");
        int num = in.nextInt();

        System.out.println("The Factors are");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
