package practicerecu;

public class Pre4 {
    public static void main(String[] args) {
        int nums[] = {1, 2, 4, 1};

        int res[] = pre4(nums);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }

    public static int[] pre4(int[] nums) {
        int count =0;
        
        for(int i=0;i<nums.length;i++){
          if(nums[i]==4)
            break;
          count++;
        }
        
        int[] arr = new int[count];
        
        for(int i=0;i<count;i++){
          arr[i] = nums[i];
        }
        
        return arr;
      }
      
}
