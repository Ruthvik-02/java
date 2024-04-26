package java8fea;

import java.util.function.Function;
public class FunctionPreDefined {
    public static void main(String[] args) {

        //function -> filter(2 parameter) calculations

        Function<Integer, Integer> square = (num) -> num * num;

        System.out.println(square.apply(5));

        Function<String, Integer> len = (str) -> str.length();

        System.out.println(len.apply("abcd"));
    }

    
}
