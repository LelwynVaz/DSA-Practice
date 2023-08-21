import java.util.Scanner;

public class MathQuestions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // distance between two points 
        System.out.println("Enter x values");
        System.out.print("X1: ");
        int x1 = in.nextInt();
        System.out.print("X2: ");
        int x2 = in.nextInt();
        int x = x2 - x1;
        System.out.println("Enter y values");
        System.out.print("Y1: ");
        int y1 = in.nextInt();
        System.out.print("Y2: ");
        int y2 = in.nextInt();
        int y = y2 - y1;

        int distance = (int)Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Distance between given points is " + distance);

        // commission percentage 
        System.out.print("Total Sales Revenue: ");
        int revenue = in.nextInt();
        System.out.print("Commission: ");
        float commission = in.nextFloat();

        float rate = revenue / commission;
        System.out.println("Commission percentage is " + rate);
        
        // discount of product 
        System.out.print("Product Price: ");
        int price = in.nextInt();
        System.out.print("Discount percentage: ");
        int percentage = in.nextInt();
        int discount = price * percentage / 100;
        int discountedPrice = price - discount;
        System.out.println("You got a discount of " + discount + " and your total price is " + discountedPrice);

        // depreciation value 
        System.out.print("Remaining life Years: ");
        double years = in.nextInt();
        System.out.print("Asset cost: ");
        int cost = in.nextInt();
        System.out.print("Salvage value: ");
        int salvage = in.nextInt();
        double syd = 0;
        for(int i = 1; i <= years; i++) {
            syd += i;
        }

        double depreciation = ((years / syd) * (cost - salvage));
        System.out.println("Yearly depreciation value is " + (float)depreciation);
    }
}
