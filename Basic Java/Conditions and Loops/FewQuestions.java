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

        // future investment value
        System.out.println("Future value = " + (int)a);
        System.out.println("Total Interest = " + (int)ci);

        // ncr and npr 
        System.out.print("Enter number: ");
        int num1 = in.nextInt();
        System.out.print("Enter number: ");
        int num2 = in.nextInt();
        int num3 = num1 - num2;
        int factnum1 = 1;
        int factnum2 = 1;
        int factnum3 = 1;

        for(int i = 1; i <= num1; i++) {
            factnum1 *= i;
        }
        for(int i = 1; i <= num2; i++) {
            factnum2 *= i;
        }
        for(int i = 1; i <= num3; i++) {
            factnum3 *= i;
        }

        int ncr = factnum1 / (factnum2 * factnum3);
        int npr = factnum1 / factnum3;
        System.out.println("NCR = " + ncr + " NPR = " + npr);

        // hcf and lcm 
        int hcf;
        for(hcf = (num1 < num2) ? num1 : num2; true; hcf--) {
            if (num1 % hcf == 0 && num2 % hcf == 0) {
                break;
            }
        }
        int lcm = (num1 * num2) / hcf;
        System.out.println("HCF of (" + num1 + ", " + num2 + ") = " + hcf);
        System.out.println("LCM of (" + num1 + ", " + num2 + ") = " + lcm);
    }
}
