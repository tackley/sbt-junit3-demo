import static org.junit.Assert.assertTrue;

public class MyJavaTestDerivedFromTestBase extends MyTestBase {

  public void testThisTestShouldBeExecutedButIsNot() {
      assertTrue(2 + 2 == 5);
  }
}
