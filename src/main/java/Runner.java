import java.util.concurrent.Executor;
import java.util.function.Consumer;

public class Runner {
  private final Consumer<String> consumer;
  private final Executor executor;

  public Runner(Consumer<String> consumer, Executor executor) {
    this.consumer = consumer;
    this.executor = executor;
  }

  public void consume(String str) {
    // happening in an executor is vital for test failure
    // running directly and bypassing executor will result in test success
    executor.execute(() -> consumer.accept(str));
  }
}
