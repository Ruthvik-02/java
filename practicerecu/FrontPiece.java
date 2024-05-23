package practicerecu;

public class FrontPiece {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3};

        int res[] = frontPiece(nums);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }

    public static int[] frontPiece(int[] nums) {
        if(nums.length<=2)
          return nums;
          
        int arr[] = new int[2];
        
        for(int i=0;i<arr.length;i++){
          arr[i] = nums[i];
        }
        
        return arr;
      }
      
}
