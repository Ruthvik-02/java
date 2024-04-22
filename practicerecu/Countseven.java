package practicerecu;

import java.util.Scanner;

public class Countseven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(count7(num));
    }

    public static int count7(int num){
        if(num==0)
        return 0;
    
        if(num%10==7)
        return 1+count7(num/10);
        else
        return count7(num/10);
    }
}
