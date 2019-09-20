package lesson3.interfaces.annonim;

public class Main {
    public static void main(String[] args) {
        AI ai = new AI() {
            @Override
            public int method() {
                return 0;
            }

            @Override
            public void hello() {
                System.out.println("Hi");
            }
        };
        ai.hello();

        MyClass myClass = new MyClass(){
            @Override
            public void hello() {
                System.out.println("Hello");
            }
        };

        System.out.println(myClass.getClass());
    }
}
