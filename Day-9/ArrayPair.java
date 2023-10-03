
public class ArrayPair {
   public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int size = 3;

        for (int i = 0; i <= a.length-size; i++) {
            for (int j = i; j < size+i; j++) {
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
   } 
}
