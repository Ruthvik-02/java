package java8fea;

import java.util.function.Predicate;

public class PreDefinedFunctionalInterface {
    public static void main(String[] args) {
        // Predicate<Integer> pre = new Predicate<Integer>(){
        //     @Override
        //     public boolean test(Integer number){
        //         return number>2;
        //     }
        // };

        // System.out.println(pre.test(5));

        // Predicate<Integer> pre = (number) -> number >2;
        // System.out.println(pre.test(5));

        // Predicate<Character> pre = (ch) -> ch=='b';
        // System.out.println(pre.test('b'));

        Predicate<Float> floatt = (number) -> number >2;
        System.out.println(floatt.test(1.9f));

        Predicate<Double> doublee = (number) -> number >2;
        System.out.println(doublee.test(5.00));

        Predicate<String> stringg = (str) -> str=="hello";
        System.out.println(stringg.test("hell"));
    }
}
