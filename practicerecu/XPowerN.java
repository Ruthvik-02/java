package practicerecu;

import java.util.Scanner;

public class XPowerN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();

        System.out.println(XPowerN(base, exponent));

    }

    public static int XPowerN(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base*XPowerN(base, exponent-1);
    }
}
