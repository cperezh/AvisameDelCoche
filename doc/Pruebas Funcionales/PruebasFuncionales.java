import junit.framework.Test;
import junit.framework.TestSuite;

public class PruebasFuncionales {

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(Comprobar Estado.class);
    suite.addTestSuite(Editar Kilometraje.class);
    return suite;
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}