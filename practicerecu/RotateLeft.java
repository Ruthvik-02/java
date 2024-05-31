package practicerecu;

public class RotateLeft {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3};

        int res[] = rotateLeft3(nums);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] rotateLeft3(int[] nums) {
        int temp = nums[0];
        int j = 1;
        for(int i=0;i<nums.length-1;i++){
          nums[i] = nums[j];
          j++;
        }
        
        nums[nums.length-1]=temp;
        
        return nums;
      }
      
}
