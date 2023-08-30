public class NumPalindrome {
    public static void main(String[] args) {
        int num = 2342;
        boolean palindrome  = isPalindrome(num);
        if (palindrome) {
            System.out.println(num + " is palindrome");
        } else {
            System.out.println(num + " not a palindrome");
        }
    }

    static boolean isPalindrome(int num) {
        int orginal = num;
        int reverse = 0;
        while (orginal != 0) {
            int last = orginal % 10;
            reverse = (reverse * 10) + last;
            orginal /= 10;
        }
        System.out.println(reverse);
        return reverse == num;
    }
}
