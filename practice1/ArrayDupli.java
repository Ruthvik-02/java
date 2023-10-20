package practice1;

public class ArrayDupli {
    public static void main(String[] args) {
        int arr[] = {3,2,6,9,1,2,5};

        int n = arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
