public class EvenDays {
    public static void main(String[] args) {
        int august = 31;
        int count = 0;

        for(int i = 1; i <= august; i++) {
            if (i % 2 == 0) {
                count += 1;
            }
        }
        System.out.println("kunal can go out " + count + " times in August.");
    }
}
