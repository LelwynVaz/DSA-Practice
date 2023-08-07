import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Program takes numbers until you press 0 and print greatest of all numbers");
        int maxNum = 0;

        while (true) {
           System.out.print("Enter Number: ");
           int num = in.nextInt();

           if (num != 0) {
            if (num > maxNum) {
                maxNum = num;
            }
           } else {
            break;
           }
        }
        System.out.println("The greatest numbers is " + maxNum);
    }
}
