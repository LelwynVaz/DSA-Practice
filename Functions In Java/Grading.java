public class Grading {
    public static void main(String[] args) {
        int marks = 40;
        String result  = grade(marks);
        System.out.println(result);
    }

    static String grade(int marks) {
        if (marks > 90) {
            return "AA";
        } else if (marks > 80) {
            return "AB";
        } else if (marks > 70) {
            return "BB";
        } else if (marks > 60) {
            return "BC";
        } else if (marks > 50) {
            return "CD";
        } else if (marks > 40) {
            return "DD";
        } else {
            return "Fail";
        }
    }
}
