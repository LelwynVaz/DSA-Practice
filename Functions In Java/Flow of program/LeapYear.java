/**
 * LeapYear
 */
public class LeapYear {
    public static void main(String[] args) {
        int year = 2012;
        boolean leap = isLeap(year);

        if (leap) {
            System.out.println("Its a leap year");
        } else {
            System.out.println("Its not a leap year");
        }
    }

    static boolean isLeap(int yr) {
        return yr % 4 == 0;
    }
}