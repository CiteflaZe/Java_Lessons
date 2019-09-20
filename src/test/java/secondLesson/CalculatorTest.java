package secondLesson;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @BeforeClass
    public static void init(){
        System.out.println("Before Class.");
    }

    @AfterClass
    public static void destroy(){
        System.out.println("After Class.");
    }

    @Before
    public void initBeforeEachMethod(){
        System.out.println("Before method.");
    }

    @After
    public void destroyAfterEachMethod(){
        System.out.println("After method.");
    }

    @Test
    public void shouldReturnSumOfArguments(){
        int actual = Calculator.calc(1, "+", 1);
        int expected = 2;

        Assert.assertEquals("Description", expected, actual);
    }
}
