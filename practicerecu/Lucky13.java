package practicerecu;

public class Lucky13 {
    public static void main(String[] args) {
        int nums[] = {1,2,3};

        System.out.println(lucky13(nums));
    }
    public static boolean lucky13(int[] nums) {
        for(int i=0; i<nums.length;i++){
          if(nums[i]==1 || nums[i]==3)
          return false;
        }
        return true;
      }
}
