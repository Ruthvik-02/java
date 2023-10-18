import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "mississippi";
        int size = sc.nextInt();
        //isSubstrings(str,size);
        //subStrings(str);
        //reverseSubStrings(str);
//        startPalindrome(str);
        endPalindrome(str);
    }

    private static void endPalindrome(String str) {
        for (int size = str.length(); size >0 ; size--) {
            for (int i = 0; i <= str.length() - size; i++) {
                String res = "";
                for (int j = i; j < i + size; j++) {
                    res += str.charAt(j);
                }
                if(isPalindrome(res))
                System.out.println(res);
            }
        }
    }

    private static void startPalindrome(String str) {
        for (int size = 0; size <=str.length() ; size++) {
            for (int i = 0; i <= str.length() - size; i++) {
                String res = "";
                for (int j = i; j < i + size; j++) {
                    res += str.charAt(j);
                }
                if(isPalindrome(res))
                System.out.println(res);
            }
        }
    }

    private static void reverseSubStrings(String str) {
        for (int size = str.length(); size >0 ; size--) {
            for (int i = 0; i <= str.length() - size; i++) {
                String res = "";
                for (int j = i; j < i + size; j++) {
                    res += str.charAt(j);
                }
                System.out.println(res);
            }
        }
    }

    private static void subStrings(String str) {
        for (int size = 0; size <=str.length() ; size++) {
            for (int i = 0; i <= str.length() - size; i++) {
                String res = "";
                for (int j = i; j < i + size; j++) {
                    res += str.charAt(j);
                }
                System.out.println(res);
            }
        }
    }

    private static void isSubstrings(String str, int size) {
        for (int i = 0; i <=str.length()-size ; i++) {
            String res="";
            for (int j = i; j < i+size; j++) {
                res += str.charAt(j);
            }
            if(isPalindrome(res))
                System.out.println(res);
        }
    }

    private static boolean isPalindrome(String str) {
        for (int i = 0,j = str.length()-1; i < str.length()/2; i++,j--) {
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
