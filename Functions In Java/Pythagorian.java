public class Pythagorian {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 12;
        int num3 = 13;
        boolean triplets = numSquares(num1, num2, num3);
        if (triplets) {
            System.out.println("Numbers are triplets");
        } else {
            System.out.println("Not triplets");
        }
    }

    static boolean numSquares(int a, int b, int c) {
        int squareA = (int) Math.pow(a, 2);
        int squareB = (int) Math.pow(b, 2);
        int squareC = (int) Math.pow(c, 2);
        int sum = squareA + squareB;

        return sum == squareC;
    }
}
