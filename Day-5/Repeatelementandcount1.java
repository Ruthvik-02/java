

public class Repeatelementandcount1 {
    public static void main(String[] args) {
        int arr[] = {2,2,2,4,4,5,7,7};

        int count = 1;
        int i;
        for (i = 0; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1]) {
                count++;
            }
            else{
                if(count>1)
                    System.out.println(arr[i]+" "+count);
                    
                count=1;
            }
        }
        System.out.println(arr[i]+" "+count);
    }
}
