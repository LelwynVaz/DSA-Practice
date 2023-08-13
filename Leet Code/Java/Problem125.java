import java.util.Scanner;

public class Problem125 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter a string with non characters between: ");
        String original = in.nextLine();

        String cleanStr = original.replaceAll("[^A-Za-z0-9]", "");
        String lowerStr = cleanStr.toLowerCase();
        String reversStr = "";

        for (int i = lowerStr.length() - 1; i >= 0; i--) {
            reversStr = reversStr + lowerStr.charAt(i);
        }

        boolean result = lowerStr.equals(reversStr);

        System.out.println(lowerStr);
        System.out.println(reversStr);
        System.out.println(result);
    }
}
