import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Checking if the text you entered is a palindrome or not.");
        System.out.print("Enter Something: ");
        String text = input.nextLine();
        char ch;
        String reverseText = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            ch = text.charAt(i);
            reverseText += ch;
        }
        if (text.equals(reverseText)) {
            System.out.println("The text you entered is palindrome");
        } else {
            System.out.println("The text you entered is not a palindrome");
        }
    }
}
