package practicerecu;

public class Fix23 {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3};

        int res[] = fix23(nums);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] fix23(int[] nums) {
        for(int i=0;i<nums.length;i++){
          if(nums[i]==2){
            if(nums[i+1]==3){
              nums[i+1]=0;
            }
          }
        }
        
        return nums;
      }
      
}
