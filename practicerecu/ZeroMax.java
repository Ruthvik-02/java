package practicerecu;

public class ZeroMax {
    public static void main(String[] args) {
        int nums[] = {0,5,0,3};

        int res[] = zeroMax(nums);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }

    public static int[] zeroMax(int[] nums) {
        int odd=0;
        
        for(int i=nums.length-1;i>=0;i--){
          
          if(nums[i]==0){
            nums[i] =odd;
          }
          
          if(nums[i]%2!=0 && nums[i]>odd){
            odd = nums[i];
          }
        }
        return nums;
      }
}
