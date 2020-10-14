import java.io.PrintStream;
import java.util.concurrent.Executors;

public class ConsumerProvider {
  public static Runner getRunner(ConsumerProvider cp) {
    return new Runner(cp::doSomething, Executors.newSingleThreadExecutor());
  }

  private final PrintStream out;

  ConsumerProvider(PrintStream out) {
    this.out = out;
  }

  public void doSomething(String t) {
    out.println(t);
  }
}
