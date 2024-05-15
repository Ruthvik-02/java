package practicerecu;

public class ModThree {
    public static void main(String[] args) {
        int nums[] = {2,1,3,5};

        System.out.println(modThree(nums));
    }
    
    public static boolean modThree(int[] nums) {
        for(int i=0;i<nums.length-2;i++) {
          if(nums[i]%2==0 && nums[i+1]%2==0 && nums[i+2]%2==0) {
            return true;
          }
          
          if(nums[i]%2!=0 && nums[i+1]%2!=0 && nums[i+2]%2!=0) {
            return true;
          }
        }
        return false;
      }      
}
