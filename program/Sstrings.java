import java.util.Scanner;

public class Sstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "mississippi";
        int size = sc.nextInt();
        
        Palindrome(str);
    }

    private static void Palindrome(String str) {
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
}

