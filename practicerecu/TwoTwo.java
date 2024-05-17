package practicerecu;

public class TwoTwo {
    public static void main(String[] args) {
        int nums[] = {4, 2, 2, 3};

        System.out.println(twoTwo(nums));
    }

    public static boolean twoTwo(int[] nums) {
        for(int i=0;i<nums.length;i++){
          if(nums[i]==2) {
            boolean adjacent = false;
            if(i>0 && nums[i-1]==2){
              adjacent = true;
            }
            else if(i<nums.length-1 && nums[i + 1] == 2){
              adjacent = true;
              i++;
            }
            else {
              return false;
            }
          }
        }
        
        return true;
      }
      
}
