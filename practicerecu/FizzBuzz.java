package practicerecu;

public class FizzBuzz {
    public static void main(String[] args) {
        int start = 1, end = 11;

        String res[] = fizzBuzz(start,end);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
    public static String[] fizzBuzz(int start, int end) {
        String[] arr = new String[end-start];
        
        int j=0;
        
        for(int i=start;i<end;i++){
          if(i%5==0 && i%3==0) {
            arr[j++] = "FizzBuzz";
          }
          else if(i%5==0){
            arr[j++] = "Buzz";
          }
          else if(i%3==0){
            arr[j++] = "Fizz";
          }
          else {
            arr[j++] = String.valueOf(i);
          }
        }
        return arr;
      }
}
