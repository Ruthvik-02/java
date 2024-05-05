package practicerecu;

public class Fix34 {
    public static void main(String[] args) {

        int nums[] = {1, 3, 1, 4, 4, 3, 1};
        int res[] = fix34(nums);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }

    public static int[] fix34(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
          if(nums[i]==3){
              for(;j<nums.length;j++){
                  if(nums[j]==4){
                      int temp = nums[j];
                      nums[j] = nums[i+1];
                      nums[i+1]=temp;
                      
                      break;
                  }
              }
          }
        }
        return nums;
      }
}
