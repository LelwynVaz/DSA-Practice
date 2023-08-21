import java.util.Scanner;

public class Problem258 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = in.nextInt();
        int result = addDigits(num);
        System.out.println(result);
    }

    static int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int numSum = num;
        while (numSum >= 10) {
            int newNum = digitSum(numSum);
            numSum = newNum;
        }
        return numSum;
    }

    static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            int last = num % 10;
            sum += last;
            num /= 10;
        }
        return sum;
    }
}
