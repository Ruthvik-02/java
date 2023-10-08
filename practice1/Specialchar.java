package practice1;

public class Specialchar {
    public static void main(String[] args) {
        int arr[] = {7,1,3,5,2,7};
        int i;
        for ( i = 0; i < arr.length-1; i++) {
            if(arr[i]%2==1 && arr[i+1]%2==1){
                System.out.print(arr[i]+"*");
            }
            else if(arr[i]%2==0 && arr[i+1]%2==0){
                System.out.print(arr[i]+"#");
            }
            else{
                System.out.print(arr[i]+"$");
            }
        }
        System.out.println(arr[i]);
    }
}
