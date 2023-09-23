import java.util.Scanner;

public class Sumarray {
    public static void main(String[] args) {
         
        // int arr[] = {1,2,3,4,5};
        // int n = arr.length;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        int sum=0;

        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println(sum-max);
        System.out.println(sum-min);

        //5System.out.println(sum);
    }


}
