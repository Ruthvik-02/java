package practicerecu;

public class ShiftLeft {
    public static void main(String[] args) {
        int nums[] = {2,4,5,1};

        int res[] = shiftLeft(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(res[i]+" ");
        }
    }  

    public static int[] shiftLeft(int[] nums) {
        if(nums.length<=1){
          return nums;
        }
        
        int start = nums[0];
        for(int i=0;i<=nums.length-2;i++){
          nums[i] = nums[i+1];
        }
        nums[nums.length-1] = start;
        
        return nums;
      }
    
    
}
