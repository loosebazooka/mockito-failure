import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.PrintStream;

@RunWith(MockitoJUnitRunner.class)
public class ConsumerProviderTest {
  @Mock PrintStream psMock;
  @Mock ConsumerProvider mock;

  @Test
  public void testConsumerProvider() {
    // running this test first is vital for test failure
    // commenting this out will result in test success
    ConsumerProvider cp = new ConsumerProvider(psMock);
    cp.doSomething("hi");
    Mockito.verify(psMock).println("hi");
  }

  @Test
  public void testConsumerProxy() {
    Runner cp = ConsumerProvider.getRunner(mock);
    cp.consume("hi");

    Mockito.verify(mock).doSomething("hi");
  }
}