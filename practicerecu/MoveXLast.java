package practicerecu;

import java.util.Scanner;

public class MoveXLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(moveXLast(str));
    }

    public static String moveXLast(String str) {
        if (str.isEmpty()) 
            return "";    
        
        if (str.charAt(0) != 'x') {
            return str.charAt(0) + moveXLast(str.substring(1));
        }
        else{
            return moveXLast(str.substring(1)) + 'x';
        }
    }
}
