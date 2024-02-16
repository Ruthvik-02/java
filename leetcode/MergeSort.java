package leetcode;

public class MergeSort {
public static void main(String[] args) {
    int nums1[] = {1,2,3,0,0,0}, m = 3, nums2[] = {2,5,6}, n = 3;
    int i= m-1, j= n-1;
    int k = nums1.length-1;

    while (j>=0) {
        if ((i>=0 && nums1[i]>nums2[j])) {
            nums1[k] = nums1[i];
                i--;
                k--;
        }
        else{
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

   for(int a=0;a<nums1.length;a++){
    System.out.print(nums1[a]+" ");
   }

}
}