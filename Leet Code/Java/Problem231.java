public class Problem231 {
    public static void main(String[] args) {
        boolean isEqual = isPowerOfTwo(32);
        System.out.println(isEqual);

    }
    
    static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & n - 1) == 0;
    }
}
