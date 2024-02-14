package leetcode;

public class SqrtOfX {
    public static void main(String[] args) {
        long x = 4;
        long ans =0;
        long start = 0;
        long end = x;

        while(start<=end){
            long mid = (start+end)/2;
            if(mid*mid==x){
                System.out.println((int)mid);
                return ;
            }
            else if(mid*mid<x){
                start = mid +1;
                ans = mid;
            }
            else if(mid*mid>x){
                end = mid -1;
            }
        }
        System.out.println((int)ans);
        return;
    }
}
