package practicerecu;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 10;

        int start = 0;
        int end = arr.length-1;

        System.out.println(binarySearch(arr, start, end, key));
    }

    public static int binarySearch(int arr[], int start, int end, int key){
        if (start>end) {
            return -1;
        }

        int mid = (start+end)/2;

        if (arr[mid] == key) {
            return mid;
        }
        else if (arr[mid] < key) {
            return binarySearch(arr, mid+1, end, key); 
        }
        else {
            return binarySearch(arr, start, mid-1, key);
        }
    }
}
