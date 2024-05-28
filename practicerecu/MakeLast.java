package practicerecu;

public class MakeLast {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3};

        int res[] = makeLast(nums);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] makeLast(int[] nums) {
        int arr[] = new int[nums.length*2];
        
        arr[arr.length-1] = nums[nums.length-1];
        
        return arr;
      }
      
}
