package practicerecu;

public class TenRun {
   public static void main(String[] args) {
        int nums[] = {2, 10, 3, 4, 20, 5};

        int res[] = tenRun(nums);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
   }
   
   public static int[] tenRun(int[] nums) {
    for(int i=0;i<nums.length;i++) {
      int cur = nums[i];
      
      if(cur%10==0){
        
        for(int j=i+1;j<nums.length;j++){
          
          if(nums[j]%10==0){
            i=j-1;
            break;
          }
          else {
            nums[j] = cur;
            i= j-1;
          }
        }
      }
    }
    return nums;
  }
  
}
