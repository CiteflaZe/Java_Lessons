package secondLesson;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UserANTest {


    Address address = new Address("Denver", 0);
    UserAN userAN = new UserAN(address, "John");
    @Test
    public void shouldBeImmutable(){
        System.out.println("before");
        System.out.println(address.getCity());
        System.out.println(address.getCode());
        System.out.println(userAN.getAddress());
        address.setCode(2);
        address.setCity("Toronto");
        Address other = userAN.getAddress();
        other.setCity("Moscow");
        other.setCode(23);
        System.out.println("after");
        System.out.println(address.getCity());
        System.out.println(address.getCode());
        System.out.println(userAN.getAddress());
        assertThat(userAN.toString(), is("UserAN{address=Address{city='Denver', code=0}, name='John'}"));
        assertEquals(userAN.toString(), "UserAN{address=Address{city='Denver', code=0}, name='John'}");
    }



}
