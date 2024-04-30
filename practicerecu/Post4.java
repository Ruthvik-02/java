package practicerecu;

public class Post4 {
    public static void main(String[] args) {
        int nums[] = {2,4,1,2};

        int res[] = post4(nums);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }

    public static int[] post4(int[] nums) {
        int len = nums.length;
        int index = -1;
        for(int i=0;i<nums.length;i++){
          if(nums[i]==4){
            index = i;
          }
        }
        
        int[] arr = new int[len-1-index];
        int j=0;
        
        for(int i=index+1;i<len;i++){
          arr[j++] = nums[i];
        }
        
        return arr;
      }
}
