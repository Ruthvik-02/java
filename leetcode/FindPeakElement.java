package leetcode;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        int start = 0;
        int end = len-1;
        while(start<=end){
            int mid = (start + end)/2;
            if((mid==0 || nums[mid]>nums[mid-1]) && (mid==len-1 || nums[mid]>nums[mid+1])){
                return mid;
            }
            else if(mid>0 && nums[mid-1]>nums[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
