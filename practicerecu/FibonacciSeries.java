package practicerecu;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fibonacci(i));
        }
    }

    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnum = fibonacci(n-1);
        int snum = fibonacci(n-2);
        return fnum+snum;
    }
}
