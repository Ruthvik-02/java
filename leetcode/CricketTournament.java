package leetcode;

import java.util.Scanner;

public class CricketTournament {
    	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    if(n<=m){
		        System.out.println("No");
		    }
		    else{
		        System.out.println("Yes");   
		    }
		}
	}
}
