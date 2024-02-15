package leetcode;

public class SingleNumder {
    public static void main(String[] args) {
        int res = 0;
        int nums[] = {2,2,1}; 
        for(int i=0;i<nums.length;i++){
            res = res ^ nums[i];
        }
        System.out.println(res);
    }
}
