import java.util.Scanner;

public class RhombusArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Area of a Isoceles Triangle. Press 1, 2, or 3 below");
        System.out.println("1. If Base and Hight are given");
        System.out.println("2. If Diagonals are given");
        System.out.println("3. If Base and Angle is given");
        System.out.print("Enter number (1, 2 or 3): ");
        int choice = in.nextInt();

        if (choice == 1) {
            System.out.print("Enter Base: ");
            int base = in.nextInt();
            System.out.print("Enter hieght: ");
            int height = in.nextInt();
            System.out.println("Area of a Rhombus using Base and Height is " + base * height);
        } else if (choice == 2) {
            System.out.print("Enter Daigonal 1: ");
            int diag1 = in.nextInt();
            System.out.print("Enter Daigonal 2: ");
            int diag2 = in.nextInt();
            System.out.println("Area of a Rhombus using Diagonals is " + ((diag1 * diag2) / 2));
        } else if (choice == 3) {
            System.out.print("Enter Base: ");
            int base = in.nextInt();
            System.out.print("Enter Angle: ");
            float angle = in.nextFloat();
            System.out.println("Area of a Rhombus using Base and Angle is " + (Math.pow(base, 2) * Math.sin(angle)));
        } else {
            System.out.println("Invalid Choice");
        }
    }
}
