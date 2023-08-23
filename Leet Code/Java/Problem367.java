import java.util.Scanner;

public class Problem367 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        boolean result = isPerfectSquare(num);
        System.out.println(result);
    }

    static boolean isPerfectSquare(int num) {
        return Math.sqrt(num) == (int) Math.sqrt(num);
    }
}
