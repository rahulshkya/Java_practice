
import java.util.Scanner;

public class BitManipulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(range(range, a, b));

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

    public static int range(int n, int i, int j) {

        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitmask = a | b;

        return n & bitmask;

    }

    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans *= a;
            }

            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}
