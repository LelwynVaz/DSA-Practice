import java.util.Scanner;

public class JavaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This calculator will end only when you enter x");
        int answer = 0;

        while (true) {
            System.out.println("Enter first number: ");
            int num1 = input.nextInt();
            System.out.println("Enter operation: ");
            char ch = input.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                System.out.println("Enter second number: ");
                int num2 = input.nextInt();
                if (ch == '+') {
                    answer += num1 + num2;
                }
                else if (ch == '-') {
                    answer += num1 - num2;
                }
                else if (ch == '*') {
                    answer += num1 * num2;
                }
                else if (ch == '/') {
                    if (num2 != 0) {
                        answer += num1 / num2;
                    } else {
                        System.out.println("Connot divide by zero");
                    }
                }
                else if (ch == '%') {
                    answer += num1 % num2;
                }
            } else if (ch == 'x' || ch == 'X') {
                break;
            } else {
                System.out.println("Invalid operation");
                continue;
            }
            System.out.println(answer);
        }
        System.out.println("Final answer: " + answer);
    }
}
