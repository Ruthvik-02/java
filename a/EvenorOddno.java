package a;

import java.util.Scanner;

public class EvenorOddno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num%2==0) {
            System.out.println("it is a even number");
        }
        else{
            System.out.println("it is a odd number");
        }
    }
}
