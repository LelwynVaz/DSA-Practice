import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = in.nextInt();
        double pi = 3.14;

        double area = circleArea(radius, pi);
        double circumference = circleCircumference(radius, pi);

        System.out.println("Area = " + area + ", Circumference = " + circumference);
    }

    static double circleArea(double r, double p) {
        double area = p * Math.pow(r, 2);
        return area;
    }

    static double circleCircumference(double r, double p) {
        double circumference = 2 * p * r;
        return circumference;
    }
}
