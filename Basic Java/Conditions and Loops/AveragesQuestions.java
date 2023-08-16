import java.util.Scanner;

public class AveragesQuestions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // numbers average and sum 
        System.out.print("Enter total numbers: ");
        int totalNum = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= totalNum; i++) {
            System.out.print("Enter Number: ");
            int num = in.nextInt();
            sum += num;
            System.out.println();
        }
        System.out.println("Sum of Numbers = " + sum);
        System.out.println("Average of Numbers = " + sum / totalNum);

        // marks average 
        System.out.print("Enter total number of subjects: ");
        int totalSub = in.nextInt();
        int totalMarks = 0;
        for(int i = 1; i <= totalSub; i++) {
            System.out.print("Marks of subject " + i + ": ");
            int marks = in.nextInt();
            totalMarks += marks;
            System.out.println();
        }
        System.out.println("Average Marks = " + totalMarks / totalSub);

        // batting average 
        System.out.print("Player score: ");
        int score = in.nextInt();
        System.out.print("Total outs: ");
        int out = in.nextInt();
        int battingAverage = (score / out);
        System.out.println("Player Batting Average: " + battingAverage);
        
        // finding CGPA
        System.out.print("Enter total marks in 6 subjects: ");
        int finalMarks = in.nextInt();
        float percentage = (float)(finalMarks / 600.0) * 100;
        float cgpa = (float)(percentage / 9.5);
        System.out.println("Your CGPA is " + cgpa);
    }

}
