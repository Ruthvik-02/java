package practicerecu;

public class Either24 {
    public static void main(String[] args) {
        int nums[] = {4,4,1,2,2};
        Either24 res = new Either24();
        System.out.println(res.either24(nums));
    }
    public boolean either24(int[] nums) {
        int twos = 0;
        int fours = 0;
        for(int i=0;i<nums.length-1;i++){
          if(nums[i]==2 && nums[i+1]==2){
           twos++;
          }
          if(nums[i]==4 && nums[i+1]==4){
           fours++;
          }
        }
        if(twos>0 && fours>0)
          return false;
        else if(twos>0 || fours>0)
          return true;
        else
        return false;
        
      }
}

