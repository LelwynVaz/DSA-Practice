import java.util.Scanner;

public class Problem58 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter anything: ");
        String myStr = in.nextLine();
        myStr = myStr.trim();
        int count = 0;
        for(int i = myStr.length() - 1; i >= 0; i--) {
            if (myStr.charAt(i) != ' ') {
                count += 1;
            } else {
                break;
            }
        }
        System.out.println("The lenght of the last word in input is " + count);
    }
}
