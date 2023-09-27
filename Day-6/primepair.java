public class primepair {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        
        for (int i = 1; i <=a.length-1; i++) {
            for (int j = i+1; j <= a.length; j++) {
                if ( a[i]%i==0 ||  a[j]%j==0) 
                System.out.println(a[i]+" "+a[j]);
            }
        }
    }
    
}
