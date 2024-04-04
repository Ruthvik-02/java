package leetcode;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factOfNumber(n));
        System.out.println(factorialRec(n));
    }

    public static int factOfNumber(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact*=i;
        }
        return fact;
    }

    public static int factorialRec(int n){
        if (n==1) {
            return 1;
        }

        return n*factorialRec(n-1);
    }
}
