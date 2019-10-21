import hometask12.HashMap;

public class A implements B, C{
    public static void main(String[] args) {
        A a = new A();
        a.method();

        HashMap<byte[], Object> objectObjectHashMap = new HashMap<>();

    }

    @Override
    public void method() {
        B.super.method();
        C.super.method();
    }


}
