import java.util.Scanner;

public class sumof5no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        int total = 1;

        for (int i = 0; i < n; i++) {
            total*=arr[i];
        }

        int res[]=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[i]=total/arr[i];
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(res[i]);
        }
    }
}
