package practice1;

public class removearray {
    public static void main(String [] args) {
        int arr[] = {1,2,3,4,5,6};

        int arr1[] = new int[arr.length];

        for(int i=0;i<arr.length;i++) {
                arr1[i] = arr[i]; 
        }
        int x = 1;
        for(int i=0;i<arr1.length;i++) {
        	if(arr1[i]==x){
        		for(int j=i;j<arr1.length-1;j++){
        			arr1[j] = arr[j+1];
        		}
        	}
        }
         for(int i=0;i<arr1.length-1;i++) {
                System.out.println(arr1[i]);
        }
    }
}
