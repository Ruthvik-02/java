package practicerecu;

public class SameEnds {
    public static void main(String[] args) {
        int nums[] = {5, 6, 45, 99, 13, 5, 6};

        int n = 2;
        System.out.println(sameEnds(nums,n));
    }

    public static boolean sameEnds(int[] nums, int n) {
        int first[] = new int[n];
        int second[] = new int[n];
        
        for(int i=0;i<n;i++){
          first[i] = nums[i];
        }
        
        int j=0;
        for(int i=nums.length-n;i<=nums.length-1;i++){
          second[j++] = nums[i];
        }
        
        for(int i=0;i<n;i++){
          if(first[i]!=second[i]){
            return false;
          }
        }
        return true;
      }
      
}
