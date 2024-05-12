package practicerecu;

public class IsEveryWhere {
    public static void main(String[] args) {
      int nums[] = {1, 2, 1, 3};

      int val = 1;

      System.out.println(isEverywhere(nums,val));
    }
    public static boolean isEverywhere(int[] nums, int val) {
      int len = nums.length;
      
      for(int i=0;i<len-1;i++) {
        if(nums[i]!=val && nums[i+1]!=val){
          return false;
        }
      }
      
      return true;
    }
}
