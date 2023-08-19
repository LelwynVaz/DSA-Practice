public class Problem520 {
    public static void main(String[] args) {
        boolean result = detectCapitalUse("leetcode");
        System.out.println(result);
    }

    static boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase())) {
            return true;
        }

        if (word.equals(word.toLowerCase())) {
            return true;
        }

        String captitalize = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
        return word.equals(captitalize);
    }
}
