import junit.framework.TestCase;

public class MyJavaTestDerivedDirectlyFromTestCase extends TestCase {
    public void testThisTestIsExecuted() {
        assertTrue(2 + 2 < 5);
    }


}
