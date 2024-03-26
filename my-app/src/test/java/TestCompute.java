import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }
  @Test
  public void testCountNumberOfOccurrences_EmptyQueue() {
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(0);
    c = new Compute(mq);
    assertEquals(-1, c.countNumberOfOccurrences("element"));
}

@Test
public void testCountNumberOfOccurrences_ElementNotExist() {
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(3); // Assuming there are elements in the queue
    when(mq.contains("element")).thenReturn(false);
    c = new Compute(mq);
    assertEquals(0, c.countNumberOfOccurrences("element"));
}

@Test
public void testCountNumberOfOccurrences_ElementExist() {
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(3); // Assuming there are elements in the queue
    when(mq.contains("element")).thenReturn(true);
    when(mq.getAt(0)).thenReturn("element");
    when(mq.getAt(1)).thenReturn("not_element");
    when(mq.getAt(2)).thenReturn("element");
    c = new Compute(mq);
    assertEquals(2, c.countNumberOfOccurrences("element"));
}
}