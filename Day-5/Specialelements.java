public class Specialelements {
    public static void main(String[] args) {
        int a[] = {7,3,2,4,9,5};
        int i;
        for ( i = 0; i < a.length-1; i++) {
            if(a[i]%2==0 && a[i+1]%2==0){
                System.out.print(a[i]+"#");
            }
            else if(a[i]%2==1 && a[i+1]%2==1){
                System.out.print(a[i]+"*");
            }
            else{
                System.out.print(a[i]+"$");
            }
        }
        System.out.println(a[i]);
    }
}
