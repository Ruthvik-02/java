package practicerecu;

import java.util.Scanner;

public class Has22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = {1,2,2};

        Has22 hs = new Has22();
        System.out.println(hs.has22(nums));
    }
    public boolean has22(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
          
          if(nums[i] == 2 && nums[i+1] == 2){
            return true;
          }
        }
        
        return false;
      }
}
