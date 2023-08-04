import java.util.Scanner;

public class SurfaceArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Surface area of shapes");
        System.out.println("1. Curved Surface area of a Cylinder");
        System.out.println("2. Total Surface area of a Cube");
        System.out.println("Enter choice");
        int choice = in.nextInt();
        float pi = 3.14159f;

        if (choice == 1) {
            System.out.print("Enter Radius: ");
            int radius = in.nextInt();
            System.out.print("Enter Height: ");
            int height = in.nextInt();
            System.out.println("Curved surface area of a Cylinder is " + (2 * pi * radius * height));
        } else if (choice == 2) {
            System.out.print("Enter Side: ");
            int side = in.nextInt();
            System.out.println("Total surface area of a Cube is " + (6 * Math.pow(side, 2)));
        } else {
            System.out.println("Invalid Choice");
        }
    }
}
