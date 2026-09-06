
public class palindrome {

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static float getPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'W') {
                x--;
            } else {
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;

        return (float) Math.sqrt(x2 + y2);

    }

    public static String Substring(String arr, int si, int ei) {
        String newArr = "";
        for (int i = si; i < ei; i++) {
            newArr += arr.charAt(i);
        }
        return newArr;
    }

    public static void main(String[] args) {
        String arr = "hello world";

        System.out.println("Substring: " + Substring(arr, 0, 4));

    }

}
