import java.util.Scanner;

public class ShapesVolume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Volume of shapes of your choice");
        System.out.println("1. Volume of a Cone");
        System.out.println("2. Volume of a Prism");
        System.out.println("3. Volume of a Cylinder");
        System.out.println("4. Volume of a Sphere");
        System.out.println("5. Volume of a Pyramid");
        System.out.print("Enter number from 1 to 5 to choose: ");
        int choice = in.nextInt();
        float pi = 3.14f;

        if (choice == 1) {
            System.out.println("Volume of a Cone");
            System.out.print("Enter Radius: ");
            int radius = in.nextInt();
            System.out.print("Enter Height: ");
            int height = in.nextInt();
            System.out.println("Volume of a Cone is " + ((float)(pi * Math.pow(radius, 2) * height) / 3));
        } else if (choice == 2) {
            System.out.println("Volume of a Prism");
            System.out.print("Enter base: ");
            int base = in.nextInt();
            System.out.print("Enter Height: ");
            int height = in.nextInt();
            System.out.println("Volume of a Prism is " + (base * height));
        } else if (choice == 3) {
            System.out.println("Volume of a Cylinder");
            System.out.print("Enter Radius: ");
            int radius = in.nextInt();
            System.out.print("Enter Height: ");
            int height = in.nextInt();
            System.out.println("Volume of a Cylinder is " + ((float)(pi * Math.pow(radius, 2) * height)));
        } else if (choice == 4) {
            System.out.println("Volume of a Sphere");
            System.out.print("Enter Radius: ");
            int radius = in.nextInt();
            System.out.println("Volume of a Sphere is " + ((4 * pi * Math.pow(radius, 3)) / 3));
        } else if (choice == 5) {
            System.out.println("Volume of a Pyramid");
            System.out.print("Enter Length: ");
            int length = in.nextInt();
            System.out.print("Enter Width: ");
            int width = in.nextInt();
            System.out.print("Enter Height: ");
            int height = in.nextInt();
            System.out.println("Volume of a Pyramid is " + ((length * width * height) / 3));
        } else {
            System.out.println("Invalid Choice");
        }
    }
}
