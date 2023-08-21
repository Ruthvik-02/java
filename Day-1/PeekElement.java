public class PeekElement {
    public static void main(String[] args) {
        int arr[] = {10,5,25,20,25};
        int n = arr.length;

        if(arr[0]>arr[1]){
            System.out.println(arr[0]);
        }
        for(int i=1; i<n-1;i++){
            if(arr[i]>arr[i+1] && arr[i]>arr[i-1])
                System.out.println(arr[i]);
        }
        if(arr[n-1]>arr[n-2])
        System.out.println(arr[n-1]);
    }
}
