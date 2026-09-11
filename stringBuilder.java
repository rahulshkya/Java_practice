
public class stringBuilder {

    public static void main(String[] args) {

        String str = "my name is rahul shakya";

        String str1 = "aaabbcccdd";
        System.out.println(count(str1));

    }

    public static String toUppercase(String str) {
        StringBuilder sb = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i - 1) != ' ') {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        System.out.println("Here is the uppercase string " + sb);
        return sb.toString();
    }

    public static String count(String str) {

        StringBuilder sb = new StringBuilder();
        Integer count = 1;

        for (int i = 0; i < str.length(); i++) {

            while (i < str.length() - 1 && str.charAt(i + 1) == str.charAt(i)) {
                count++;
                i++;
            }

            sb.append(str.charAt(i));

            if (count > 1) {
                sb.append(count.toString());
            }

            count = 1;
        }

        return sb.toString();
    }
}
