package leetcode;

import java.util.HashMap;

class RansomeNote{
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<magazine.length();i++){
            char ch = magazine.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }

        int count =0;
        for(int i=0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            if(map.containsKey(ch) && map.get(ch)>0){
                map.put(ch,map.get(ch)-1);
                count++;
            }
            else{
                break;
            }
        }

        if(count==ransomNote.length())
        return true;
        else
        return false;
    }
}