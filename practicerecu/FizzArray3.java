package practicerecu;

public class FizzArray3 {
    public static void main(String[] args) {
        int start = 5;

        int end = 10;

        int[] res = fizzArray3(start,end);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }

    }

    public static int[] fizzArray3(int start, int end) {
        int[] arr = new int[end-start];
        
        for(int i=0;i<arr.length;i++){
          arr[i] = start++;
        }
        return arr;
      }
      
}
