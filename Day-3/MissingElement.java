public class MissingElement {
    public static void main(String[] args) {
        int[] arr ={1,2,4,3};
        int n=5;
        int sumrequi = n*(n+1)/2;
        int sumactual = 0;
        for (int i = 0; i < arr.length; i++) {
            sumactual += arr[i];
        }
        System.out.println(sumrequi-sumactual); 
    }
}
