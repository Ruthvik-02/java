public class RepeatedElement {
    public static void main(String[] args) {
        int[] arr = {3,5,8,8,1};
        for (int i = 0;i<arr.length;i++) {
            for (int j = i+1;j<arr.length;j++) {
                if (arr[i]==arr[j]){
                    System.out.println(arr[j]);
                    break;
                }
            }
        }
    }    
}