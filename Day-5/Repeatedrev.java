public class Repeatedrev {
    public static void main(String[] args) {
        int arr[] = {2,2,2,4,4,5,7,7,8};

        int count = 1;
        int i;
        for (i = arr.length-1; i >=0; i--) {
            if (arr[i]==arr[i-1]) {
                count++;
            }
            else{
                if(count==1){
                    System.out.println(arr[i]+" "+count);
                    break;
                }
                count=1;
            }
        }
        if (count==1) {
            System.out.println(arr[i]+" "+count);
        }
    }
}
