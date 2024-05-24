package practicerecu;

public class MidThree {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};

        int res[] = midThree(nums);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }

    public static int[] midThree(int[] nums) {
        int arr[] = new int[3];
        
        int leng = (nums.length-2)/2;
        for(int i=0;i<arr.length;i++){
          arr[i] = nums[leng];
          leng++;
        }
        
        return arr;
      }
      
}
