package program;

public class Cycle {
    public static void main(String[] args) {
        int n =10;
      // int n2= 20;
      primeNtimes(n);   
      //System.out.println(isPrime(n));
   }

//     public static void main(String[] args) {
//         int n =10;
//        // int n2= 20;
//        primeNtimes(n);   
//        System.out.println(isPrime(n));
      
//    }
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
          if(isPrime(i)){
              System.out.println(i);
              count++;
          }
      }
  }

  public static void factor(int n){
   for (int i = 1;i<=n; i++) {
           if(n%i==0)
               System.out.println(i);
       }
   }

   public static void factorReverse(int n){
   for (int i = n;i>=1; i--) {
           if(n%i==0)
               System.out.println(i);
       }
   }

   public static void commonFactor(int n1,int n2){
      
       for (int i = 1;i<=n2; i++) {
           if(n1%i==0  &&  n2%i==0)
               System.out.println(i);
       }
    }

    public static void commonFactorreverse(int n1,int n2){
      
       for (int i = n2;i>=1; i--) {
           if(n1%i==0  &&  n2%i==0)
               System.out.println(i);
       }
    }
    
    public static void highCommonFactor(int n1,int n2){
      
       for (int i = n2;i>=1; i--) {
           if(n1%i==0  &&  n2%i==0)
               System.out.println(i);
       }
    }

    public static void leastcommonFactor(int n1,int n2){
       int hcf = 0;
       for (int i = 1;i<=n2; i++) {
           if(n1%i==0  &&  n2%i==0){
               hcf=i;
           }
       }
       int lcm = (n1*n2)/hcf;
       System.out.println(lcm);
    }
}
