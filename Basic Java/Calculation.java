import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Performing calculations based on user operations");
        System.out.println("Enter '+' to perform Addition");
        System.out.println("Enter '-' to perform Subtraction");
        System.out.println("Enter '*' to perform Multiplication");
        System.out.println("Enter '/' to perform Division");
        System.out.print("What operation do you want to perform: ");
        String operation = input.nextLine();
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        int result;
        
        if (operation.equals("+")) {
            result = number1 + number2;
            System.out.println("The sum of " +number1 + " and " + number2 + " is " + result);
            return;
        }
        if (operation.equals("-")) {
            result = number1 - number2;
            System.out.println("The substration of " +number1 + " and " + number2 + " is " + result);  
            return;
        } 
        if (operation.equals("*")) {
            result = number1 * number2;
            System.out.println("The multiplication of " +number1 + " and " + number2 + " is " + result);
            return;
        }
        if (operation.equals("/")) {
            if (number2 == 0) {
                System.out.println("Connot Divide by 0");
                return;
            }
            result = number1 / number2;
            System.out.println("The division of " +number1 + " and " + number2 + " is " + result);  
            return;
        }else {
            System.out.println("Invalid operation");
        }
    }
}
