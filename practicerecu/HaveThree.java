package practicerecu;
public class HaveThree {
    public static void main(String[] args) {
        int nums[] = {3,1,3,1,3};

        System.out.println(haveThree(nums));
    }

    public static boolean haveThree(int[] nums) {
        int i;
        int count = 0;
        for(i=0; i<nums.length-1;i++) {
          if(nums[i]==3 && nums[i+1]==3) {
            return false;
          }
          
          if(nums[i]==3) {
            count++;
          }
        }
        
        if(nums.length>0){
          if(nums[i]==3){
            count++;
          }
        }
        
        return count==3;
      }
}
