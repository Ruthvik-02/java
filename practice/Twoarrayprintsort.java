
public class Twoarrayprintsort {
    public static void main(String[] args) {
        int arr1[] = {9,6,4,2,1};
    
        int arr2[] = {1,2,3,4,9,15,17,19};
    
        int res[] = new int[arr1.length+arr2.length];
    
        int k=0,i=arr1.length-1,j=0;
        
        for (; i >=0 && j<arr2.length;) {
            if(arr1[i]<=arr2[j])
                res[k++] = arr1[i--];
            else
                res[k++] = arr2[j++];
        }
        while (i>=0) {
            res[k++] = arr1[i--];
        }
        while (j<arr2.length) {
            res[k++] = arr2[j++];
        }
        for(int n=0;n<res.length;n++){
            System.out.print(res[n]+" ");
        }
      }  
}
