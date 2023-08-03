import java.util.Scanner;

/**
 * TriangleArea
 */
public class TriangleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Area of a triangle program");
        System.out.println("1. Area of a Triangle");
        System.out.println("2. Area of a Isoceles Triangle");
        System.out.println("3. Area of a Equivilateral Triangle");
        System.out.print("Enter Number (1, 2 or 3): ");
        int choice = input.nextInt();
        
        if (choice == 1) {
            System.out.print("Enter Base: ");
            float base = input.nextFloat();
            System.out.print("Enter Height: ");
            float height = input.nextFloat();
            System.out.println("Area of a Triangle is " + ((base * height) / 2));
        } else if (choice == 2) {
            System.out.print("Enter Base: ");
            float base = input.nextFloat();
            System.out.print("Enter Height: ");
            float height = input.nextFloat();
            System.out.println("Area of an Isoceles Triangle is " + ((base * height) / 2));
        } else if (choice == 3) {
            System.out.print("Enter Side: ");
            int side = input.nextInt();
            System.out.println("Area of an Equivilateral Triangle is " + ((Math.sqrt(3) / 4) * Math.pow(side, 2)));
        } else {
            System.out.println("Invalid Choice");
        }
    }
}