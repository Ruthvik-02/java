package practicerecu;

public class ReplacePI {
    public static void main(String[] args) {

        String str = "apibpicp";

        System.out.println(replacePi(str));
    }

    public static String replacePi(String str) {

        if(str.length()<=1)
            return str;
        if(str.charAt(0)=='p' && str.charAt(1)=='i'){
            return "3.14"+replacePi(str.substring(2));
        }
        else{
            return str.charAt(0)+replacePi(str.substring(1));
        }
    }
}
