import java.util.Scanner;

public class Problem69 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        int sqRoot = (int) Math.sqrt(num);
        System.out.println("Square root of " + num + " is " + sqRoot);
    }
}
