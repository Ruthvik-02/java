package practicerecu;

public class SumNDigits {
    public static void main(String[] args) {
        int number = 174;

        System.out.println(sumOfDigits(number));
    }

    public static int sumOfDigits(int number) {
        if(number==0)
            return 0;

        return number%10 + sumOfDigits(number/10);
    }
}
