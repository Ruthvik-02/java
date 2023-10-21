public class primepair {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        
        for (int i = 0; i <a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                 if (isPrime(a[i]) || isPrime(a[j])) 
                
                System.out.println(a[i]+" "+a[j]);
            }
        }
    }
    public static boolean isPrime(int n){
        if(n==1)
        return false;

        for (int i = 2; i <=(Math.sqrt(n)); i++) {
            if(n%i==0)
                return false;
        }
        

        return true;
    }
  
    
}
