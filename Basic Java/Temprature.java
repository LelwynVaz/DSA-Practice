import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program converts Temprature in Celcius into Farenheit");

        System.out.println("Enter temprature in C: ");
        float temprature = input.nextFloat();

        float tempF = (temprature * 9 / 5) + 32;

        System.out.println(tempF + " Farenheit");
    }
}
