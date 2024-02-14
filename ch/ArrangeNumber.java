package ch;

public class ArrangeNumber {
     public static void main(String[] args) {
        int n = 6;
        int arr[] = new int[n];
        int start =0;
        int end = n-1;
        int num = 1;
 
        while(start<=end){
            if(num%2==1){
                arr[start] = num;
                num +=1;
                start +=1;
            }
            else{
                arr[end]= num;
                num += 1;
                end  -=1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
