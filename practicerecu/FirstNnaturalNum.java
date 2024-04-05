package practicerecu;

import java.util.Scanner;

public class FirstNnaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFirstNnum(n);
    }

    public static void printFirstNnum(int n){
        if (n==0) {
            return;
        }
        printFirstNnum(n-1);

        System.out.println(n);
    }

}
