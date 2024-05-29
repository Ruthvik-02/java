package practicerecu;

public class MaxEnd3 {
    public static void main(String[] args) {
        int nums[] = {11, 2, 5};

        int res[] = maxEnd3(nums);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] maxEnd3(int[] nums) {
        int temp = 0;
        for(int i=0;i<nums.length;i++){
        if(temp<nums[0]){
          temp=nums[0];
        }
        else if(temp<nums[nums.length-1]){
          temp=nums[nums.length-1];
        }
      }
      
      for(int i=0;i<nums.length;i++){
        nums[i] = temp;
      }
      
      return nums;
    }
      
}
