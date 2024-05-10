package practicerecu;

public class More14 {
  public static void main(String[] args) {
    int nums[] = {1,4,1};

    System.out.println(more14(nums));
  } 
  
  public static boolean more14(int[] nums) {
    int ones =0;
    int fours = 0;
    
    for(int i=0;i<nums.length;i++){
      if(nums[i]==1) {
        ones++;
      }
      
      if(nums[i]==4){
        fours++;
      }
    }
    
    return ones > fours;
  }
}
