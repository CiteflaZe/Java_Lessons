package lesson12.example1;

import java.util.Objects;

public class B {
    private int code;


    public B(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof B)) {
            return false;
        }
        B b = (B) o;
        return code == b.code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
