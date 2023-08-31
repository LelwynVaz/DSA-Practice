public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 6;
        for(int i =1; i <= 10; i++) {
            int product = multiply(num, i);
            System.out.println(num + " X " + i + " = " + product);
        }
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}
