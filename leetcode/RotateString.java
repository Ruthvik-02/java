public class RotateString {
    public boolean rotateString(String s, String goal) {
        if(s.length()==goal.length()){
          String word = s+s;
          boolean result = word.contains(goal);
          return result;
        }  
        return false;
    }
}
