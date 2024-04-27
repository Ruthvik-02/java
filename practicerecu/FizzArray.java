package practicerecu;

public class FizzArray {
    public static void main(String[] args) {
        int n = 4;

        int[] res = fizzArray(n);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }

    }

    public static int[] fizzArray(int n) {
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
          arr[i] = i;
        }
        return arr;
      }
}
