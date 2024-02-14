package ch;

public class Swaping {
    public static void main(String[] args) {
        int a[] = {1,3,7,2,4,6};

        for (int i = 0; i < a.length-1; i+=2) {
            int temp = a[i];//1
            a[i] = a[i+1];
            a[i+1] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }
    }
}










// int b = 21;

        // for (int i = 0; i < a.length; i++) {
        //     if(a[i]==b){
        //         System.out.println(i);
        //         return;
        //     }
        // }
        // System.out.println(-1);
