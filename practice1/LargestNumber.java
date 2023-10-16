package practice1;

public class LargestNumber {
    public static void main(String[] args) {
        int arr[] = {10,5,25,20,15,0};
        int n = arr.length;

        int max = arr[0];

        for(int i=1;i<n;i++){
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println(max);

        int min = arr[0];

        for(int i=1;i<n;i++){
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
