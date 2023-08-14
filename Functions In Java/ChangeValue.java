import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 45, 6};
        change(arr); // pass by value
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 99; // if you make a change to this object via this reference variable, same object will be changed
    }
}
