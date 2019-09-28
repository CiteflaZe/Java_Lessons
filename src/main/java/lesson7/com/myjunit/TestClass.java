package lesson7.com.myjunit;

public class TestClass {
    @BeforeClass
    public static void staticInit(){
        System.out.println("Before class");
    }

    @AfterClass
    public static void staticAfter(){
        System.out.println("After class");
    }

    @Before
    public void someMethodBefore(){
        System.out.println("Before method");
    }

    @After
    public void someMethodAfter(){
        System.out.println("After method");
    }

    @Test
    public void shouldReturnResult1(){
        System.out.println("Result1");
    }

    @Test
    public void shouldReturnResult2(){
        System.out.println("Result2");
    }


}
