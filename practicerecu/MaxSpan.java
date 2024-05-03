package practicerecu;

public class MaxSpan {
    public static void main(String[] args) {
        int arr[] = {1,2,1,1,3};

        System.out.println(maxSpan(arr));
    }
    public static int maxSpan(int[] nums) {
        int max = 0;
        
        for(int i=0;i<nums.length;i++){
          int cur = nums[i];
          int index = i;
          
          for(int j=i+1;j<nums.length;j++){
            if(nums[j]==cur) {
              index = j;
            }
          }
          
            int element = index-i+1;
        
            if(element > max) {
                max = element;
            }
        }
        
        return max;
      }
}
