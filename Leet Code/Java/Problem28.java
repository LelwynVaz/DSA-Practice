public class Problem28 {
    public static void main(String[] args) {
        int result = strStr("sadbudsad", "sad");
        System.out.println(result);
    }

    static int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);
        return index;
    }
}
