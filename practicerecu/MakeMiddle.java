package practicerecu;

public class MakeMiddle {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};

        int res[] = makeMiddle(nums);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] makeMiddle(int[] nums) {
        int arr[] = new int[2];
        
        int leng = (nums.length-1)/2;
        
        for(int i=0;i<arr.length;i++){
          arr[i] = nums[leng];
          leng++;
        }
        
        return arr;
      }
      
}
