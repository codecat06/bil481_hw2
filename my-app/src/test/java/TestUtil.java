import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }

  @Test
  public void testCompute_OneArgument() {
    assertFalse(c.compute(5)); // Test with one argument
}

  @Test
  public void testCompute_EvenNumberOfArguments() {
      assertFalse(c.compute(2, 4)); // Test with even number of arguments
  }

  @Test(expected = RuntimeException.class)
  public void testCompute_ExceptionThrown() {
      c.compute(2, 3, 0, 7, 5); // Test with an exception thrown
  }
  public void testCompute_SumDivisibleByArgument() {
    assertTrue(c.compute(3, 5, 7, 11, 2)); // Test with sum divisible by one of the arguments
  }

  @Test
  public void testCompute_NoConditionsMet() {
    assertFalse(c.compute(2, 3, 5, 7,2)); // Test with no conditions met
  }
  
}