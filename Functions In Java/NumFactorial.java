public class NumFactorial {
    public static void main(String[] args) {
        int num = 5;
        int fact = Factorial(num);
        System.out.println(fact);
    }

    static int Factorial(int num) {
        int factorial = 1;
        if (num == 0) {
            return factorial;
        }

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
