package rec;

public class SumOfDigits {
    public static void main(String[] args) {
        int m = 12345;

        System.out.println(sumDigits(m));
    }

    public static int sumDigits(int n){
        int sum;
        if (n<10) {
            return n;
        }

        return sum = (n % 10) + sumDigits(n/10);
    }
}
