public class Problem50 {
    public static void main(String[] args) {
        double numPow = myPow(2.0000, 10);

        System.out.println(numPow);
        
    }

    static double myPow(double x, int n) {
        double result = Math.pow(x, n);
        return result;
    }
}
