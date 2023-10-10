import java.util.Scanner;

public class CharaStrings1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

    //    traversing(str);
    //    reversing(str);
    //    printVowels(str);
    //    pritConsonant(str);
    //    printNumber(str);
    //     specialCharacters(str);
//        System.out.println(revereString(str));
//        System.out.println(removeVowel(str));
//        System.out.println(removeConsonant(str));
//        System.out.println(removeUppercase(str));
//        System.out.println(removeLowercase(str));
//        System.out.println(removeSpecialchara(str));
//        System.out.println(removeNumder(str));
System.out.println(addSumnumber(str));

    }

    private static String addSumnumber(String str) {
        String res = "";
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9'))
                res+=str.charAt(i);
            else
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return res+sum;
    }

    private static String removeNumder(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9'))
                res+=str.charAt(i);
        }
        return res;
    }

    private static String removeSpecialchara(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i)>='A' && str.charAt(i)<='Z')||(str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='0' && str.charAt(i)<='9'))
                res+=str.charAt(i);
        }
        return res;
    }

    private static String removeLowercase(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if(!(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))
                res+=str.charAt(i);
        }
        return res;
    }

    private static String removeUppercase(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if(!(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'))
            res+=str.charAt(i);
        }
        return res;
    }

    public static String removeConsonant(String str) {
        String res="";
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
                if(str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' && str.charAt(i)!='u')
                res+=str.charAt(i);
            }
        }
        return res;
    }

    private static String removeVowel(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' && str.charAt(i)!='u')
                res+=str.charAt(i);
        }
        return res;
    }

    private static String revereString(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            res+=str.charAt(i);
        }
        return res;
    }

    public static void specialCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            if(!((str.charAt(i)>='A' && str.charAt(i)<='Z')||(str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='0' && str.charAt(i)<='9')))
                System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void printNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
                System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void pritConsonant(String str) {
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i)>='A' && str.charAt(i)<='Z')||(str.charAt(i)>='a' && str.charAt(i)<='z')){
                if(str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' && str.charAt(i)!='u')
                    System.out.print(str.charAt(i)+" ");
            }
        }
        System.out.println();
    }

    public static void printVowels(String str) {
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
                System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void reversing(String str) {
        for (int i = str.length()-1; i>=0; i--) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void traversing(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
}



