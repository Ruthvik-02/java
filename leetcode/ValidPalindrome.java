package leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        //String s = " ";

        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        int i = 0;
        int j = s.length()-1;
        boolean flag = true; 

        while (i<=j) {
            if (s.charAt(i)!=s.charAt(j)) {
                System.out.println("false");
                 flag = false;
            }
            i++;
            j--;
        }
        if (flag) {
            System.out.println("true");
        }
    }
}
