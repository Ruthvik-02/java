package leetcode;

public class LeaderArray {
    
    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        arrLeaders(arr);
    }
    public static void arrLeaders(int[] arr){
        int max = 0;
        int length = arr.length-1;
        for (int i = length; i>=0; i--) {
            if(arr[i]>max){
                max = arr[i];
                System.out.print(arr[i]+" ");
            }
        }
    }
}
