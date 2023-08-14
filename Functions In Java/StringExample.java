import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);

        String personalizedMessage = myGreet("Lelwyn Vaz");
        System.out.println(personalizedMessage);
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = in.nextLine();
        String userMessage = myGreet(userName);
        System.out.println(userMessage);
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greet() {
        String greeting = "How are you";
        return greeting;
    }
}
