public class NaturalSum {
    public static void main(String[] args) {
        int n = 10;
        int sum = sum(n);
        System.out.println(sum);
    }

    static int sum(int num) {
        int sum = 0;
        for(int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
