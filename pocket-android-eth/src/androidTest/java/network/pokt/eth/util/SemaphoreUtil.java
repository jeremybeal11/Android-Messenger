package network.pokt.eth.util;

import java.util.concurrent.Semaphore;

public class SemaphoreUtil {

    public interface SemaphoreCallback {
        void execute(final Semaphore semaphore);
    }

    public static void executeSemaphoreCallback(SemaphoreCallback callback) {
        final Semaphore semaphore = new Semaphore(0);
        callback.execute(semaphore);
        semaphore.acquireUninterruptibly();
    }

}
