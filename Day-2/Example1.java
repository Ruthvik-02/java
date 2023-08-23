import java.util.Arrays;
public class Example1 {
    public static void main(String[] args) {
        int arr[] = {3,0,7,0,5,2};
        int n = arr.length;

        int arr1[] = new int[n];
        int z=0;

        for(int i=0;i<n;i++){
            if(arr[i]!=0)
                arr1[z++]=arr[i];
        }

        System.out.println(Arrays.toString(arr1));
    }
}
