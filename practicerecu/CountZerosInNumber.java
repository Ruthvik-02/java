package practicerecu;

import java.util.Scanner;

public class CountZerosInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(countOfZeros(num));
    }

    public static int countOfZeros(int num){
        if (num == 0) 
            return 0;
        
        if (num%10==0) {
            return 1 + countOfZeros(num/10);
        }
        else{
            return countOfZeros(num/10);
        }
    }
}
