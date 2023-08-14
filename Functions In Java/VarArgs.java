import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1, 3, 4, 45, 67, 8, 32, 4, 5, 80);

        multiple(3, 56, "lelwyn", "kunal"); // order should be maintained and cannot skip any value

        demo("lelwyn", "kunal", "tim");
        demo(1, 45, 23, 10);
        // demo(); //connot be empty because of ambiguity
    }

    static void fun(int ...arr) {
        System.out.println(Arrays.toString(arr));
    }

    static void multiple(int a, int b, String ...s) { //variable length argument always at the end

    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }
}
