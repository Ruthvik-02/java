package program;

public class Cycle {
    public static void main(String[] args) {
         int n =10;
        // int n2= 20;
        primeNtimes(n);   
        System.out.println(isPrime(n));
        
    }
    public static boolean isPrime(int n){
        for (int i = 2; i <=(Math.sqrt(n)); i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void primeUptoN(int n){
        for (int i = 2; i <=n; i++) {
            if(isPrime(i))
                System.out.println(i);
        }
    }

    public static void primeBetween(int n1,int n2){
        for (int i = n1; i <=n2; i++) {
            if(isPrime(i))
                System.out.println(i);
        }
    }

     public static void primeNtimes(int n){
        int count=0;
        for (int i = 2; count <=n; i++) {
            if(isPrime(i))
                System.out.println(i);
        }
    }
    
}
