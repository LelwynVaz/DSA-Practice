import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // for loop 
        // print numbers 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // print numbers from 1 to n 
        System.out.println("Enter a number: ");
        int n = in.nextInt();

        for (int num = 1; num <= n; num++) {
            System.out.print(num + " ");
        }

        // while loop 
        // coverting first for loop into while loop 

        int num = 1;
        System.out.println();
        while (num <= 5) {
            System.out.print(num + " ");
            num++;
        }

        // converting second for loop into while loop 

        int num1 = 1;
        System.out.println();
        while (num1 <= n) {
            System.out.print(num1 + " ");
            num1++;
            
        }

        // do while loop 
        // converting first for loop to do while loop 

        System.out.println();
        int num2 = 1;
        do {
            System.out.print(num2 + " ");
            num2++;
        } while (num2 <= 5);
    }
}
