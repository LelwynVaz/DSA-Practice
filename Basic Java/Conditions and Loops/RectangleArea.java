import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Area of a rectangle and Parallelogram");
        System.out.println("1. Area of Rectangle");
        System.out.println("2. Area of Parallelogram");
        System.out.print("Enter Number (1 or 2): ");
        int choice = in.nextInt();

        if (choice == 1) {
            System.out.print("Enter Lenght: ");
            int lenght = in.nextInt();
            System.out.print("Enter Width: ");
            int width = in.nextInt();
            System.out.println("Area of a Rectangle is " + (lenght * width));
        } else if (choice == 2) {
            System.out.print("Enter Base: ");
            int base = in.nextInt();
            System.out.print("Enter Height: ");
            int height = in.nextInt();
            System.out.println("Area of a Rectangle is " + (base * height));
        } else {
            System.out.println("Invalid Choice");
        }
    }
}
