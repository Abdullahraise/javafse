package DeepSkilling.week2;

public class LifecycleTest {

    private static final String Assert = null;

    @BeforeClass
    public static void setupOnce() {
        System.out.println("Run once before all tests");
    }

    @AfterClass
    public static void tearDownOnce() {
        System.out.println("Run once after all tests");
    }

    @BeforeClass
    public void setup() {
        System.out.println("Setup before each test");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Cleanup after each test");
    }

    @Test
    public void testOne() {
        System.out.println("Test case 1");
        Assert.assertTrue(true);
    }

    @Test
    public void testTwo() {
        System.out.println("Test case 2");
        Assert.assertEquals(10, 5 + 5);
    }
}
