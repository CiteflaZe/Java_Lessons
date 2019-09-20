package lesson5.classes;

public class Car {
    private static final String CODE = "100";
    private static String staticCode;
    private String name;
    private Engine engine;

    public Car(String name, int volume, int code) {
        this.name = name;
        this.engine = new Engine(volume, code);

        engine.innerMethod();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    private void method(){
        System.out.println("Method");
    }

    public class Engine{
        private static final String CODE_INNER = "10000";
//        private static String innerStaticCode;
        private final int volume;
        private final int code;

        public Engine(int volume, int code) {
            this.volume = volume;
            this.code = code;
            System.out.println(CODE);
            System.out.println(staticCode);
            setName("Hello");
            method();
        }

        private void innerMethod(){
            System.out.println("Inner Method");
        }

    }

}
