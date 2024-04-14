package a;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "noon";

        if(isPalindrome(str)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

