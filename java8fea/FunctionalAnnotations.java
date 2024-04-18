package java8fea;

public class FunctionalAnnotations {
    public static void main(String[] args) {

        //anonymous class
        // Duck duck = new Duck() {
        //     @Override
        //     public void run() {
        //         System.out.println("Running");
        //     }
        // };
        // duck.run();

        // Using lambda Expression
        // Duck duck = (a) -> System.out.println(a);
        // duck.run();
        // duck.value(10);
    }
    // @Override
    // public void run() {
    //     System.out.println("Running");
    // }
}

@FunctionalInterface
interface Duck {
    void run();

    // void swim();
    //void fly();

    int a = 10;
    int b = 20;
    int c = 30;

    // if default method is created it is not counted
    // default void display() {
    //     System.out.println("I am Duck");
    // }

    // void value(int a);
    
}