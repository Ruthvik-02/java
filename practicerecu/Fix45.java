package practicerecu;
public class Fix45 {
    public static void main(String[] args) {
        int nums[] = {5,4,9,4,9,5};
        int res[] = fix45(nums);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] fix45(int[] nums) {
        for(int i=0;i<nums.length;i++){
          if(nums[i]==4){
              
              for(int j=0;j<nums.length;j++){
                  if(nums[j]==5 && (j == 0 || nums[j - 1] != 4)){
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
