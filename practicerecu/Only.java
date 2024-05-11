package practicerecu;

public class Only {

    public static void main(String[] args) {
        int nums[] = {1,4,2,4};

    System.out.println(only14(nums));
    }

    public static boolean only14(int[] nums) {
        for(int i=0;i<nums.length;i++){
          if(nums[i]!=1 && nums[i]!=4){
            return false;
          }
        }
        return true;
      }
}