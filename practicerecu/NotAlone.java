package practicerecu;

public class NotAlone {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        int n = 2;
        int res[] = notAlone(nums,n);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
    
    public static int[] notAlone(int[] nums, int val) {
        for(int i=0;i<nums.length;i++){
          if(nums[i]== val && i!=0 && i!= nums.length-1) {
            
            int before = nums[i-1];
            int after = nums[i+1];
            
            if(before != nums[i] && after != nums[i]){
              
              if(before>after){
                nums[i] = before;
              }
              else{
                nums[i] = after;
              }
            }
          }
          
        }
        return nums;
    } 
}
