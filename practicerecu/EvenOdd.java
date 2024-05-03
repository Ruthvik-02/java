package practicerecu;

public class EvenOdd {
    public static void main(String[] args) {
        // int nums[] = {3,3,2};

        int nums[] = {1,0,1,0,0,1};
        int res[] = evenOdd(nums);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }

    public static int[] evenOdd(int[] nums) {
        int j = 0;
        
        for(int i=0;i<nums.length;i++){
          if(nums[i]%2==0){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            
            j++;
          }
        }
        return nums;
      }
}
