import java.util.Scanner;

public class NumSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Program Adds number until you press 0");
        int sum = 0;

        while (true) {
           System.out.print("Enter Number to Add: ");
           int num = in.nextInt();

           if (num != 0) {
            sum += num;
           } else {
            break;
           }
        }
        System.out.println("The sum of entered numbers is " + sum);
    }
}
