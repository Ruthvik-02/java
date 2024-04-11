package practicerecu;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        int[] arr = new int[26];
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        removeDuplicate(str, index, arr, sb);
    }
    public static void removeDuplicate(String str, int index, int[] arr, StringBuilder sb){
        if (index == str.length()) {
            System.out.println(sb);
            return;
        }
        char ch = str.charAt(index);
        if (arr[ch - 'a'] != 1) {
            arr[ch - 'a'] = 1;
            removeDuplicate(str, index + 1, arr, sb.append(ch));
        } else {
            removeDuplicate(str, index + 1, arr, sb);
            
        }
    }

}
