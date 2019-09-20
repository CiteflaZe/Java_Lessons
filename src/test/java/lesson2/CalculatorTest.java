package lesson2;

import org.junit.*;
import org.junit.rules.ExpectedException;

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

//    @Test(expected = RuntimeException.class)

    @Test
    public void shouldThrowRuntimeExceptionForNullOperator(){
//        try {
//            Calculator.calc(1, null, 2);
//        }catch (RuntimeException e){
//            System.out.println("Catch!");
//        }
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Null operation.");

        Calculator.calc(1, null, 2);

    }

}