import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Generating Fibonacci numbers upto your input");
        System.out.print("Enter number: ");
        int maxFibo = input.nextInt();
        int fibo1 = 0;
        int fibo2 = 1;
        int fibo;

        if (maxFibo == 0) {
            System.out.println(0);
            return;
        }
        if (maxFibo == 1) {
            System.out.println(fibo1);
        } else {
            System.out.println(fibo1);
            System.out.println(fibo2);
        }
        for (int count = 2; count < maxFibo; count ++) {
            fibo = fibo1 +fibo2;
            System.out.println(fibo);
            fibo1 = fibo2;
            fibo2 = fibo;
        }
    }
}
