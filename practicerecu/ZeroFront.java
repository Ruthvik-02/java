package practicerecu;

public class ZeroFront {
    public static void main(String[] args) {
        int nums[] = {1, 0, 0, 1};

        int res[] = zeroFront(nums);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
    
    public static int[] zeroFront(int[] nums) {
        int n = nums.length;
        
        int[] arr = new int[n];
        int j = n-1;
        for(int i=0;i<n;i++){
          if(nums[i]!=0){
            arr[j--] = nums[i];
          }
        }
        
        return arr;
      }
      
}
