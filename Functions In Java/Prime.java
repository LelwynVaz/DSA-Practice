public class Prime {
    public static void main(String[] args) {
        int num = 62870;
        boolean prime = isPrime(num);
        if (prime) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");     
        }
    }

    static boolean isPrime(int num) {
        int count  = 2;

        while (count * count < num) {
            if (num % count == 0) {
                return false;
            }
            count++;
        }
        return true;
    }
}
