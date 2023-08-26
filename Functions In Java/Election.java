public class Election {
    public static void main(String[] args) {
        int age = 37;
        boolean vote = canVote(age);
        if (vote) {
            System.out.println("You can vote");
        } else {
            System.out.println("Sorry! You cannot vote");
        }
    }

    static boolean canVote(int age) {
        if (age >= 18) {
            return true;
        }
        return false;
    }
}
