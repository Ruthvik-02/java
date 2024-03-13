package a;

import java.util.Scanner;

public class EligibleToVoteorNot{
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);

        age = sc.nextInt();

        if (age>=18) {
            System.out.println("The Person is eligible for vote");
        }
        else{
            System.out.println("The Person is not eligible for vote");
        }
    }
}