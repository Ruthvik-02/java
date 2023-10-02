
public class CommonElements {
    public static void main(String[] args) {
        int arr1[] = {3,5,7,9,13};

        int arr2[] = {1,2,3,4,9,15,17,19};

        int i=0,j=0;
    
    for (; i < arr1.length && j<arr2.length;){
        if (arr1[i]<=arr2[j]) {
            if (arr1[i]==arr2[j]) {
                System.out.println(arr1[i]);
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        else{
            j++;
        }
    }
    }
}
