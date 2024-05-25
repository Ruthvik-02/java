package practicerecu;

public class SwapEnds {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};

        int res[] = swapEnds(nums);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }

    public static int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = temp;
        
        return nums;
      }
      
}
