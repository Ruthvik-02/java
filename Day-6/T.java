public class T {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        
        for (int i = 0; i < args.length-1; i++) {
            for (int j = i+1; j < args.length; j++) {
                System.out.println(a[i]+" "+a[j]);
            }
        }
    }
}
