public class OddEven {
    public static void main(String[] args) {
        int num = 40;
        boolean isEven = oddEven(num);
        if (isEven) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

    static boolean oddEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}
