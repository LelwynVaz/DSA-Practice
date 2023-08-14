public class Scope {
    public static void main(String[] args) {
        int a = 10;
        String name = "Lelwyn";

        {
            // block scope 
            // int a = 78; // cannot initialise local variable again in this block because it is already initialise in the same method
            a = 78; // you can change the values of local variables
            name = "Kunal";
            System.out.println(a);
            System.out.println(name);
            int c = 99;
            System.out.println(c);
            // values initialised in this block, will remain in block 
        }

        int c = 9000; // you can initialise the inside variable again outside bacause you cannot access it outside

        System.out.println(a);
        System.out.println(name);
        System.out.println(c);

        // System.out.println(c); // cannot use outside the block

        // System.out.println(marks);  // not in this scope
    }

    static void randomM(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
        // System.out.println(a); // not in this scope
    }
}
