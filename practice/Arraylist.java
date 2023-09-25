package practice;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        int arr[] = {3,5,6,3,2,1,7,11,1,2,3,6,8};

        int n = arr.length;

        ArrayList<Integer> heven = new ArrayList<>();

        ArrayList<Integer> hodd = new ArrayList<>();

        for(int i=0;i<n;i++){

            if(arr[i]%2 == 0){
                heven.add(arr[i]);
            }
            else{
                hodd.add(arr[i]);
            }
        }
        for(var r:heven){
            System.out.println("even "+r);
        }

        for(var r:hodd){
            System.out.println("odd "+r);
        }
    }
}

