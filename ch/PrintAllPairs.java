package ch;

public class PrintAllPairs {
    public static void main(String[] args) {
        int a[] = {1,3,7,2,4};

            for (int i = 0; i < a.length-1; i++) {
                for (int j = i+1; j < a.length; j++) {
                    System.err.println(a[i]+" "+a[j]);
                }
            }    
    
    }
}
