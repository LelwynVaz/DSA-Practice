import java.util.Scanner;

public class ShapesPerimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Program to find perimenter different shapes");
        System.out.println("1. Perimeter of Circle");
        System.out.println("2. Perimeter of Equilateral Triangle");
        System.out.println("3. Perimeter of Parallelogram");
        System.out.println("4. Perimeter of Rectangle");
        System.out.println("5. Perimeter of Square");
        System.out.println("6. Perimeter of Rhombus");
        System.out.print("Enter numbers from 1 to 6 to choose: ");
        int choice = in.nextInt();

        if (choice == 1) {
            System.out.println("perimeter of a Circle");
            System.out.print("Enter Radius: ");
            int radius = in.nextInt();
            float pi = 3.14f;
            System.out.println("Perimeter of a Circle is " + (2 * pi * radius));
        } else if (choice == 2) {
            System.out.println("Perimeter of an Equilateral Triangle");
            System.out.print("Enter side: ");
            int side = in.nextInt();
            System.out.println("Perimeter of an Equilateral Triangle is " + (3 * side));
        } else if (choice == 3) {
            System.out.println("Perimeter of a Parallelogram");
            System.out.print("Enter Base: ");
            int base = in.nextInt();
            System.out.print("Enter side: ");
            int side = in.nextInt();
            System.out.println("Perimeter of a Parallelogram is " + (2 * (base + side)));
        } else if (choice == 4) {
            System.out.println("Perimeter of a Rectangle");
            System.out.print("Enter Length: ");
            int length = in.nextInt();
            System.out.print("Enter Width: ");
            int width = in.nextInt();
            System.out.println("Perimeter of a Rectangle is " + (2 * (length + width)));
        } else if (choice == 5) {
            System.out.println("Perimeter of a Square");
            System.out.print("Enter Side: ");
            int side = in.nextInt();
            System.out.println("Perimeter of a Square is " + (4 * side));
        } else if (choice == 6) {
            System.out.println("Perimeter of a Rhombus");
            System.out.print("Enter Side: ");
            int side = in.nextInt();
            System.out.println("Perimeter of a Rhombus is " + (4 * side));
        } else {
            System.out.println("Invalid Choice");
        }
    }
}
