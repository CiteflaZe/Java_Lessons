package hometask8;

public class FieldsTest {
    private int arg1;
    public int arg2;
    private final int ARG3;
    public final Integer ARG4 = 8;
    public static final Integer ARG5 = 13;
    public static int arg6 = 15;
    public static final int[] arr1 = {4, 3, 5, 2};


    enum Type{
        ONE("name1"), TWO("name2"), THREE("name3");
        private String name;
        Type(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public FieldsTest(int arg1, int arg2, int ARG3) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.ARG3 = ARG3;
    }

    public int getArg1() {
        return arg1;
    }

    public int getARG3() {
        return ARG3;
    }
}
