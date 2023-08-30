public class Primes {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 80;
        for(int i = num1; i <= num2; i ++) {
            boolean prime = isPrime(i);
            if (prime) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int num) {
        int count  = 2;

        while (count * count <= num) {
            if (num % count == 0) {
                return false;
            }
            count++;
        }
        return true;
    }
}
