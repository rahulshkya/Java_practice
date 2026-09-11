
public class Largest_string {

    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "mango";

        large(str1, str2, str3);

    }

    public static String large(String str1, String str2, String str3) {

        System.out.println(str1.compareTo(str2));
        System.out.println();
        System.out.println("The largest string is: " + large(str1, str2, str3));
        return str1;
    }
   


}
