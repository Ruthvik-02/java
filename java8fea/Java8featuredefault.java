package java8fea;

public class Java8featuredefault {
    public static void main(String[] args) {
        
        // int age = 10;
        // age = 20;
        //System.out.println(Rock.age);
        
        Mock m = new Mock();
        m.display();
        m.msg();
    }
}

interface Rock{ // cannot create obj of interface
    int age = 10;

    // java 8 feature method default
    default void msg(){
        System.out.println("I am Rock");
    }

    void display();
}


class Mock implements Rock{
    @Override
    public void display() {
        System.out.println("I am Mock");
        msg();
        System.out.println(age);
    }
    
}