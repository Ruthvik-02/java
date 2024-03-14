package a;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int fact = 4;
        int sum = 1;
        for (int i = 1; i <= fact; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
    }
}
