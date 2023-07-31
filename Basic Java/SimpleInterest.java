import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Finding Simple Interest");
        System.out.print("Enter Principle amount: ");
        int principle = input.nextInt();
        System.out.print("Enter time: ");
        int time = input.nextInt();
        System.out.print("Enter Interest rate: ");
        int interest = input.nextInt();
        int simpleInterest = principle * (1 + (interest * time));
        System.out.println("Simple Interest is: " + simpleInterest);
    }
}
