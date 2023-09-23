

public class Repeatedelementandcount {
    public static void main(String[] args) {
        int arr[] = {2,3,4,6,7,7,8,9};

        int count = 1;
        int e=0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1]) {
                count++;
                e=arr[i];
            }
        }
        System.out.println(e+" "+count);

    }
}
