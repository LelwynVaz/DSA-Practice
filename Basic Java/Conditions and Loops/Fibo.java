import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Giving nth fibonacci number");
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        int fibo0 = 0;
        int fibo1 = 1;

        int count = 2;

        if (num == 0) {
            System.out.println(fibo0);
            return;
        }
        if (num == 1) {
            System.out.println(fibo1);
            return;
        }
        else {
            while (count <= num) {
                int temp = fibo1;
                fibo1 = fibo1 + fibo0;
                fibo0 = temp;
                count++;
            }
            System.out.println(fibo1);
        }
    }
}
