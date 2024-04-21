package practicerecu;

public class ArraySortedorNot {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,2};
        int index = 0;
        System.out.println(arraySorted(arr,index));
    }

    public static boolean arraySorted(int[] arr, int index) {
        if(index == arr.length-1)
            return true;
        if(arr[index] > arr[index+1])
            return false;
        return arraySorted(arr, index+1);
    }
}
