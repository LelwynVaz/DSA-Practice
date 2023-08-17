public class Problem29 {
    public static void main(String[] args) {
        int result = divide(-2147483648, 1);
        System.out.println(result);
    }

    static int divide(int dividend, int divisor) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        if( dividend < 0 && divisor < 0) {
            int quotient = dividend / divisor;
            if(quotient == min) {
                return max;
            }
            return quotient;
        }

        if( dividend < 0 || divisor < 0) {
            int quotient = dividend / divisor;
            return quotient;
        }

        if (dividend > 0 && divisor > 0){
            int quotient = dividend / divisor;
            if(quotient == max) {
                return max;
            }
            return quotient;
        }
        return 0;
    }
}
