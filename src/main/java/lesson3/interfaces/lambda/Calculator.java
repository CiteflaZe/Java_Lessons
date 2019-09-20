package lesson3.interfaces.lambda;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    Map<String, CalcInterface> operators = new HashMap<>();
    {
        operators.put("+", (a, b)-> a+b);
        operators.put("-", (a, b)-> a-b);
        operators.put("*", (a, b)-> a*b);
        operators.put("/", (a, b)-> a/b);
    }

    private int calc(int arg1, String operator, int arg2){
        return operators.get(operator).calc(arg1, arg2);
    }
}
