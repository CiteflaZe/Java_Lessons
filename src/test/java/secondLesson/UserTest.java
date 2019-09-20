package secondLesson;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UserTest {

    User original = new User("John", "Malkom", 21, false);
    User second = new User("John", "Malkom", 21, false);
    User copy = original;
    User different = new User("Alex", "Ketov", 7, true);
    User withNull = new User(null, null, 0, true);

    @Test
    public void shouldBeTrueWithCopy(){
        assertThat(original.equals(copy), is(true));
        assertThat(original.hashCode(), is(copy.hashCode()));
    }

    @Test
    public void shouldBeFalse(){
        assertThat(original.equals(different), is(false));
        assertThat(original.hashCode() == different.hashCode(), is(false));
    }

    @Test
    public void shouldBeTrueWithSame(){
        assertThat(original.equals(second), is(true));
        assertThat(original.hashCode(), is(second.hashCode()));
    }
    @Test
    public void shouldBeFalseWithNull(){
        assertThat(original.equals(withNull), is(false));
        assertThat(original.hashCode() ==  withNull.hashCode(), is(false));
    }

}
