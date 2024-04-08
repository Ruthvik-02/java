package practicerecu;

public class FirstOccuranceOfN {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,8,8,9,10};
        int key = 4;

        System.out.println(firstOccuranceOfN(arr, 0, key));

    }

    public static int firstOccuranceOfN(int arr[], int i, int key) {
        if(i == arr.length)
            return -1;

        if (arr[i] == key) {
            return i;
        }

        return firstOccuranceOfN(arr, i+1, key);
    }
}
