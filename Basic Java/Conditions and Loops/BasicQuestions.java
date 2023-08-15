import java.util.Scanner;

public class BasicQuestions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        // perfect number 

        int factorSum = 0;
        int factCount = 1;
        while (factCount < num) {
            if (num % factCount == 0) {
                factorSum += factCount;
            }
            factCount++;
        }
        if (factorSum == num) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not perfect");
        }

        // factorial number 
        int factorial = 1;

        for (int i = num; i > 0; i--) {
            factorial *= i;
        }
        if (num > 0) {
            System.out.println(num + " factorial: " + factorial);
        } else if (num == 0) {
            System.out.println("Factorial = 1");
        } else {
            System.out.println("Factorial does not exist");
        }

        // sum of digits 
        int digitSum = 0;
        int armCount = 0;
        int temp = num;
        while (temp != 0) {
            digitSum += (digitSum * 10) + (temp % 10);
            armCount += 1;
            temp /= 10;
        }
        System.out.println("Sum of digits of " + num + " is " + digitSum);

        // armstrong number 
        int armSum = 0;
        int temp1 = num;
        while (temp1 != 0) {
            int lastDigit = temp1 % 10;
            armSum += Math.pow(lastDigit, armCount);
            temp1 /= 10;
        }
        if (armSum == num) {
            System.out.println(num + " is armstrong");
        } else {
            System.out.println(num + " not armstrong");
        }

        // number power of 3
        System.out.println(num + " pow(3) = " + Math.pow(num, 3)); 

        // leap year or not 
        System.out.print("Enter a year: ");
        int year = in.nextInt();
        if (year % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }

        // vowels or consonant 
        System.out.print("Enter character: ");
        String ch = in.next();
        if (ch.charAt(0) == 'A' || ch.charAt(0) == 'E' || ch.charAt(0) == 'I' || ch.charAt(0) == 'O' || ch.charAt(0) == 'U' || ch.charAt(0) == 'a' || ch.charAt(0) == 'e' || ch.charAt(0) == 'i' || ch.charAt(0) == 'o' || ch.charAt(0) == 'u') {
            System.out.println("Vawel");
        } else {
            System.out.println("Consonant");
        }

        // reverse a string 
        System.out.print("Enter a string: ");
        String originalString = in.next();
        String reverseString = "";
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reverseString += originalString.charAt(i);
        }
        System.out.println(reverseString);
    }
}
