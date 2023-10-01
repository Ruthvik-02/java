
public class Indexorder {
    public static void main(String[] args) {
        int arr1[] = {3,5,7,9,13};

    int arr2[] = {1,2,3};

    int arr3[] = {8,6,9,3};

    int res[] = new int[arr1.length+arr2.length+arr3.length];

    int k=0;
    
    int max = Math.max(Math.max(arr1.length, arr2.length),arr3.length);

    for (int i=0; i< max; i++) {
        if(i<arr1.length)
            res[k++] = arr1[i];
        if(i<arr2.length)
            res[k++] = arr2[i];
        if(i<arr3.length)
            res[k++] = arr3[i];
    }
    
    for(int n=0;n<res.length;n++){
        System.out.println(res[n]+" ");
    }
  }  
}