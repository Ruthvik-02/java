package practicerecu;

import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the number");

        int num = sc.nextInt();

        System.out.println(sumOfNums(num));
        System.out.println(sumOfNums1(num));
        System.out.println(sumOfNumsRec(num));

    }

    public static int sumOfNums(int num){
        return (num*(num+1))/2;
    }


    public static int sumOfNums1(int num){
        int sum = 0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        return sum;
    }

    public static int sumOfNumsRec(int num){
        if(num==1){
            return 1;
        }

        return num+sumOfNumsRec(num-1);
    }
}
