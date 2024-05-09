package practicerecu;

public class Sum13 {
    public static void main(String[] args) {
        int nums[] = {1,2,2,1};

        System.out.println(sum13(nums));
    }

    public static int sum13(int[] nums) {
        int len = nums.length;
        
        if(len == 0){
          return 0;
        }
        
        int sum =0;
        
        for(int i=0;i < len;){
          if(nums[i] == 13 && i!=len-1){
            i+=2;
          }
          
          else if(nums[i]==13){
            i++;
          }
          
          else {
            sum += nums[i];
            i++;
          }
        }
        
        return sum;
      }
      
}
