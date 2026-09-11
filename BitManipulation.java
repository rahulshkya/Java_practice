
import java.util.Scanner;

public class BitManipulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(getBit(n, 2));
        System.out.println(setBit(n, 2));
    }

    public static int getBit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clearBit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }
}
