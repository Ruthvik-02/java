public class ToLowerCase {
    public String toLowerCase(String s) {
        String res = "";
        for(char c : s.toCharArray()){
            if(Character.isUpperCase(c)){
                res += Character.toLowerCase(c);
            }
            else{
                res +=c;
            }
        }
        return res;
    }
}
