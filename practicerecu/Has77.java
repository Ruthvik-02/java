package practicerecu;

public class Has77 {
  public static void main(String[] args) {
    int nums[] = {1, 7, 7};

        System.out.println(has77(nums));
  } 
  
  public static boolean has77(int[] nums) {
    for(int i=0;i<nums.length-2;i++){
      if(nums[i]==7 && nums[i+1]==7){
        return true;
      }
    
      if(nums[i]==7 && nums[i+2]==7){
        return true;
      }
    }
    
    if(nums.length>=2) {
      if(nums[nums.length-2]==7 && nums[nums.length-1]==7){
        return true;
      }
    }
    
    return false;
  }
}
