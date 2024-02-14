import java.util.Scanner;

public class Sstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "mississippi";
        int size = sc.nextInt();
        
        isSubstrings(str,size);
    }

    private static void isSubstrings(String str, int size) {
        for (int i = 0; i <=str.length()-size ; i++) {
            String res="";
            for (int j = i; j < i+size; j++) {
                res += str.charAt(j);
            }
            System.out.println(res);
        }
    }
}

