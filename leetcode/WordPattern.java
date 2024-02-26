package leetcode;

import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
      String h[] = s.split(" ");

        if(pattern.length()!= h.length){
            return false;
        }

        HashMap<Character,String> map = new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);

            if(map.containsKey(ch)){
                if(!map.get(ch).equals(h[i])){
                    return false;
                }
            }
            else{
                if(map.containsValue(h[i])){
                    return false;
                }
                map.put(ch,h[i]);
            }
        }
        return true;

    }
}
