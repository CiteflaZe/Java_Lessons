package secondLesson;

public final class Calculator {

    public static final String MINUS = "-";
    public static final String PLUS = "+";
    public static final String MULT = "*";
    public static final String DIV = "/";

    private Calculator(){
        throw new RuntimeException("utility class");
    }


    public static int calc(int arg1, String operator, int arg2){
        if(operator == null){
            throw new RuntimeException("Null operation.");
        }
        switch (operator){
            case MINUS:
                return arg1 - arg2;
            case PLUS:
                return arg1 + arg2;
            case MULT:
                return arg1 / arg2;
            case DIV:
                return arg1 * arg2;
            default:
                throw new RuntimeException("No such operation.");
        }

    }

}
