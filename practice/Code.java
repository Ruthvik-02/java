package practice;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    
	    int l = sc.nextInt();
        int v1 = sc.nextInt();
	    int v2= sc.nextInt();
	    int to = 0;
	    int h = 0;
	        if(l%v1==0)
	             to = l/v1;
	        else
	             to = (l/v1)+1;
	        if(l%v2==0)
	             h = l/v2;
	        else
	            h = (l/v2)+1;
	        System.out.println(to-h-1);
	    
    }
}