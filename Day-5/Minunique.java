public class Minunique {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,3,4,5,7,7};

        int count = 1;
        int i;
        for (i = 0; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1]) {
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
        //if(count==1)
        //System.out.println(arr[i]+" "+count);
    }
}
