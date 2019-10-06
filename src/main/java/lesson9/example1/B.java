package lesson9.example1;

import lesson9.example1.exception.ExceptionB;

public class B extends A {
    @Override
    public String method(Object object) throws ExceptionB, RuntimeException {
        return null;
    }
}
