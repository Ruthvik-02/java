package a;

public class StringPalndrome {
    public static void main(String[] args) {
        String str = "noon";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!=str.charAt(str.length()-1-i)) {
                System.out.println("not a palindrome");
                return;
            }
        }

        System.out.println("it is a palindrome");
    }
}
