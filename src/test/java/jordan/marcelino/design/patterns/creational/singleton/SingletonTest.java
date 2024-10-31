package jordan.marcelino.design.patterns.creational.singleton;

import lombok.Cleanup;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SingletonTest {

    @Test
    void testSingletonInstance() {
        Singleton instanceOne = Singleton.getInstance();
        Singleton instanceTwo = Singleton.getInstance();

        Assertions.assertNotNull(instanceOne);
        Assertions.assertNotNull(instanceTwo);
        Assertions.assertSame(instanceOne, instanceTwo);
    }

    @Test
    void testSingletonMultiThread() throws InterruptedException, ExecutionException {
        @Cleanup ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();

        List<Callable<Singleton>> tasks = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            tasks.add(Singleton::getInstance);
        }

        List<Future<Singleton>> futures = executorService.invokeAll(tasks);

        Singleton firstInstance = futures.getFirst().get();

        for (Future<Singleton> future : futures) {
            Assertions.assertSame(firstInstance, future.get());
        }
    }

}
