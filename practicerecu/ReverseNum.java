package practicerecu;

public class ReverseNum {
    public static void main(String[] args) {
        int num = 123;
        int ans = 0;

        System.out.println(reverseNum(num, ans));
    }

    public static int reverseNum(int number,int ans){
        if (number == 0) {
            return ans;
        }
        ans = (ans * 10) + (number % 10);

        return reverseNum(number/10, ans);
    }
}
