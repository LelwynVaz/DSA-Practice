import java.util.Scanner;

public class FewQuestions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // compound interest 
        System.out.print("Principal Amount: ");
        double p = in.nextInt();
        System.out.print("Rate of Interest: ");
        double r = in.nextInt();
        System.out.print("Time in years: ");
        double n = in.nextInt();

        double a = p * (Math.pow((1 + r / 100), n));
        float ci = (float)(a - p);
        System.out.println("Final amount = " + (float)a);
        System.out.println("Compound Interest = " + ci);
    }
}
