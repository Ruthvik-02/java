package rec;

public class countzero {
    public static void main(String[] args) {
        int m = 102040;

        System.out.println(count(m));
    }

    public static int count(int n){
        if (n<10) {
            if (n == 0) 
                return 1;
            else
                return 0;
        }

        if(n%10==0){
            return count(n/10)+1;
        }
        return count(n/10);
    }
}
