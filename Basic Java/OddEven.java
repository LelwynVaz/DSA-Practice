import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Checking if a number is Even or Odd");
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if(number <= 0){
            System.out.println(number + " is not Even nor Odd");
        }
        else if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
}
