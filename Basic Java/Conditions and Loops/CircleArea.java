import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Area of a circle program");
        System.out.print("Enter radius: ");
        float radius = input.nextFloat();
        float pi = 3.14f;
        float circleArea = (pi * (float) Math.pow(radius, 2));

        System.out.println("The area of a circle is " + circleArea);
    }
}