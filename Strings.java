
import java.util.*;

public class Strings {

    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd', 'e'};
        String str = new String(arr);

        //Strings are immutable
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String myname = "rahul";
        String mysr = "shakya";
        String fullname = myname + "" + mysr;
        System.out.println(fullname);

        System.out.print(name);
    }
}
