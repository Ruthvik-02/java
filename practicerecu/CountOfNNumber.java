package practicerecu;

import java.util.Scanner;

public class CountOfNNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(countOfNum(num));
    }

    public static int countOfNum(int num){
        if (num == 0) 
            return 0;

        return 1+ countOfNum(num/10);
    }
}
