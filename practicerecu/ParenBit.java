package practicerecu;

public class ParenBit {
    public static void main(String[] args) {
        String str = "xyz(abc)123";


        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
        // String s = parenBit(str);

        // int res[] = int()
        // for (int i = 0; i < res.length; i++) {
        //     System.out.print(res[i]+" ");
        // }
    }
    public static String parenBit(String str) {
        if(str.charAt(0)=='(') {
          int n = str.length()-1;
          
          if(str.charAt(n)==')')
          return str;
          
          return parenBit(str.substring(0,n));
        }
        
        return parenBit(str.substring(1));
      }
      
}
