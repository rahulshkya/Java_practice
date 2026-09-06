
public class palindrome {

    public static void main(String[] args) {

        String one = "noon";
        boolean result = isPalindrome(one);

        System.out.println(result);

    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
