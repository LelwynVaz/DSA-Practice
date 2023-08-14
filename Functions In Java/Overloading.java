public class Overloading {
    public static void main(String[] args) {
        fun(87);
        fun("Lelwyn Vaz");
        // fun(); // cannot be empty because of ambiguity

        int sum2 = sum(34, 56);
        int sum3 = sum(34, 56, 73);

        System.out.println("Sum of 2 numbers: " + sum2 + " Sum of 3 numbers: " + sum3);
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
