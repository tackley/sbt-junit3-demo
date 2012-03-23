import junit.framework.TestCase

import org.junit.Assert._


abstract class MyTestBase extends TestCase {

}

class MyScalaTestDerivedFromTestBase extends MyTestBase {
  def testUnlikeTheJavaVersionThisTestDoesGetSeenByTheFingerprint() {
    assertTrue(2 + 2 == 4)
  }
}

class MyScalaTestDerviedDirectlyFromTestCase extends TestCase {
  def testThisTestAlsoWorks() {
    assertTrue(2 + 3 == 5)
  }

}
