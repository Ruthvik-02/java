package practicerecu;

import java.util.Scanner;
public class Sum28 {

    public static void main(String[] args) {
        int n[] = {2,1,1,4,3,2,2,2};

        Sum28 s = new Sum28();
        System.out.println(s.sum28(n));
    }
    public boolean sum28(int[] nums) {
        int sum =0;
        
        for(int i=0;i<nums.length;i++){
          if(nums[i]==2) {
            sum += nums[i];
          }
        }
        
        return sum == 8;
    }
}
