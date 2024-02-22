package leetcode;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";


        int m = s.length();
        int n= t.length();
        boolean flag = true;

        int count[] = new int[26];

        for(int i=0;i<m;i++){
            count[s.charAt(i)-'a']++;
        }  

        for(int i=0;i<n;i++){
            count[t.charAt(i)-'a']--;
        } 

        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                System.out.println("false");
                flag = false;
            }
        }
        if (flag) {
            System.out.println("true");
        }
    }
}
