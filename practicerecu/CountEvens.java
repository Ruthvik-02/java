package practicerecu;

import java.util.Scanner;
public class CountEvens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = {2,1,2,3,4};

        CountEvens ce = new CountEvens();
        System.out.println(ce.countEvens(nums));
    }

    public int countEvens(int[] nums) {
        int count = 0;
        
        for(Integer n : nums) {
          if(n % 2==0) {
            count++;
          }
        }
        
        return count;
    }
}
