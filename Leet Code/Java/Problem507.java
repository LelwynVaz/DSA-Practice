/**
 * Problem507
 */
public class Problem507 {
    public static void main(String[] args) {
        boolean isPerfect = checkPerfectNumber(28);
        System.out.println(isPerfect);
    }

    static boolean checkPerfectNumber(int num) {
        int sum = 0;

        if (num == 1) {
            return false;
        }

        for(int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i + (num / i);
            }
        }
        System.out.println("sum = " + sum);

        return sum == num;
    }
}