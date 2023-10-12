package practice1;

public class Sumofpairfive {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
            int total = 5;
    
            for (int size = 1; size <= a.length; size++) {
                for (int i = 0; i <= a.length-size; i++) {
                    int sum =0;
                    for (int j = i; j < size+i; j++) {
                        sum += a[j];
    
                    }
                    
                    if(sum==total){
                        for (int j = i; j < size+i; j++) {
                        System.out.print(a[j]+" ");
    
                    }
                    System.out.println();
                    }
                     //System.out.println(sum);
                }
            }
       } 
}
