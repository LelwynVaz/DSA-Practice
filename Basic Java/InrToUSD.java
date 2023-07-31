import java.util.Scanner;

public class InrToUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Converting Indian rupees to USD");
        System.out.print("Enter amount in Rupess(INR): ");
        int inr = input.nextInt();
        float usd = (0.012f * inr);
        System.out.println("INR " + inr + " = " + usd + " USD");
    }
}
