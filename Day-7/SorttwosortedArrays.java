
public class SorttwosortedArrays {
  public static void main(String[] args) {
    int arr1[] = {3,5,7,9,13};

    int arr2[] = {1,2,3,4,9,15,17,19};

    int res[] = new int[arr1.length+arr2.length];

    int k=0,i=0,j=0;
    
    for (; i < arr1.length && j<arr2.length;) {
        if(arr1[i]<=arr2[j])
            res[k++] = arr1[i++];
        else
            res[k++] = arr2[j++];
    }
    while (i<arr1.length) {
        res[k++] = arr1[i++];
    }
    while (j<arr2.length) {
        res[k++] = arr2[j++];
    }
    for(int n=0;n<res.length;n++){
        System.out.println(res[n]+" ");
    }
  }  
}
