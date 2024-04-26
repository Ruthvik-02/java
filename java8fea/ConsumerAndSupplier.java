package java8fea;

import java.util.function.Consumer;
import java.util.function.Supplier;
public class ConsumerAndSupplier {

    public static void main(String[] args) {

        //Consumer - takes 1 parameter, but doesn't return anything
        Consumer<Integer> consumer = (x)-> System.out.println(x);
        consumer.accept(1);

        Consumer<String> consumer1 = (x)-> System.out.println(x);
        consumer1.accept("hello");
        
        Consumer<Object> consumer2 = (value) -> System.out.println(value);
        consumer2.accept("hello world");
        consumer2.accept(2.43);
        consumer2.accept(2);
        consumer2.accept('r');

        //Supplier - doesn't take any parameter, so returns something
        Supplier<Integer> supplier = ()-> 5;
        System.out.println(supplier.get());

        Supplier<Object> supplier1 = ()-> "hii";
        System.out.println(supplier1.get());
    }
}