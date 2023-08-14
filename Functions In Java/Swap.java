public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        numSwap(a, b); // pass by value
        System.out.println("The swapped values a = " + a + ", " + "b = " + b);

        String name = "Lelwyn Vaz";
        changeName(name); // pass by value
        System.out.println(name);
    }

    static void changeName(String name) {
        name = "Kunal Kushwaha"; // here we are creating a new object so it will not change. It will also not change because strings are immutable
    }

    static void numSwap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        // this change will only be valid in this function only because of the scope
    }
}
