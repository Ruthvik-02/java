package practicerecu;

public class MatchUp {
    public static void main(String[] args) {
        int nums1[] = {1, 2, 3};
        int nums2[] = {2, 3, 10};

        System.out.println(matchUp(nums1,nums2));
    }
    public static int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for(int i=0;i<nums1.length;i++){
          if(nums1[i]!=nums2[i]){
            int diff = (int) Math.abs(nums1[i]-nums2[i]);
            if(diff<=2){
              count++;
            }
          }
        }
        
        return count;
      }
}
