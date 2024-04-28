package practicerecu;

public class TripleUp {
  public static void main(String[] args) {
    int nums[] = {1,4,5,6,2};

    System.out.println(tripleUp(nums));
  }  

  public static boolean tripleUp(int[] nums) {
    for(int i=0;i<=nums.length-3;i++){
      
      int curr = nums[i];
      
      if(nums[i+1]==curr+1 && nums[i+2]==curr+2){
        return true;
      }
    }
    return false;
  }
}
