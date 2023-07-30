import java.util.Scanner;

/**
 * Inputs
 */
public class Inputs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int rollno = input.nextInt();
        System.out.println("Your roll no is " + rollno);

        int a = 234_000_000;
        System.out.println(a);

        System.out.print("Your Name: ");
        String name = input.next();
        System.out.println("Your Name is" + name);

        System.out.print("Enter marks: ");
        float marks = input.nextFloat();
        System.out.println("Your marks are " + marks);
    }
}