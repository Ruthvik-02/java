package practice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.add(60);

        //System.out.println(a);
        //System.out.println(a.indexOfValue(60));
         //a.removeOfindex(4);
        System.out.println(a.min());

    }
}
class ArrayList{
    private int items[];

    private int size;

    private int index = 0;

    private int max = 0;

    private int min = 0;

    ArrayList(){
        this(5);
    }

    public ArrayList(int size){
        items = new int[size];
    }

    void add(int value){
        if(index == items.length){
            resize();
        }
        if(value>max){
            max = value;
        }
        
        items[index++] = value;
    }

    int indexOfValue(int value){
        for(int i=0;i<index;i++) {
            if(value == items[i])
                return i;
        }
        return -1;
    }

    int max(){
        return max;
    }

    int min(){
        for (int i = 0;i<index; i++) {
            if(items[i]<min){
                min = items[i];
            }
            return min;
        }
    }
    private void resize(){
        int tempArray[] = new int[items.length*2];
        for(int i=0;i<items.length;i++){
            tempArray[i]=items[i];
        }
        items = tempArray;
    }

    public void removeOfindex(int value){
        
        for(int i=value;i<index;i++) {
                items[i] = items[i+1];
        }
        index--;
    }

    public String toString(){
        int[] temp2 = new int[index];
        for(int i=0;i<index;i++){
            temp2[i] = items[i];
        }
        return Arrays.toString(temp2);
    }
}