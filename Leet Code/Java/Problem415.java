public class Problem415 {
    public static void main(String[] args) {
        String num1 = "12";
        String num2 = "10";
        String sum = addStrings(num1, num2);
        System.out.println(sum);
    }

    static String addStrings(String num1, String num2) {
        java.math.BigInteger a = new java.math.BigInteger(num1);
        java.math.BigInteger b = new java.math.BigInteger(num2);
        a = a.add(b);
        return a.toString();
    }
}
