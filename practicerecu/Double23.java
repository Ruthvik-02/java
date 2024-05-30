package practicerecu;

public class Double23 {

    public static void main(String[] args) {
        int nums[] = {2, 2};

        System.out.println(double23(nums));
    }

    public static boolean double23(int[] nums) {
        int two = 0;
        int three = 0;
        
        for(int i=0;i<nums.length;i++){
          if(nums[i]==2){
            two+=1;
          }
          else if(nums[i]==3){
            three+=1;
          }
        }
        
        if(two==2 || three==2){
          return true;
        }
         
        return false;
      }
      
}
