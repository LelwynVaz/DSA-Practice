import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Checking if a character entered is lower or upper case");
        System.out.println("Enter a character: ");
        char ch = input.next().trim().charAt(0);


        if (ch >= 'a' && ch <= 'z') {
            System.out.println( "Lower Case");
        }
        else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Upper Case");
        }
        else {
            System.out.println("Not a character");
        }
    }
}
