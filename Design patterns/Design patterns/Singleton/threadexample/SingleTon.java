package Singleton.threadexample;

import java.util.concurrent.atomic.AtomicInteger;

class SingleTon {
    private static SingleTon instance;
    private static final AtomicInteger created = new AtomicInteger();

    private SingleTon() {
        created.incrementAndGet();
    }

    static int createdCount() {
        return created.get();
    }

    public static SingleTon getInstance() {
        if (instance == null) {
            pause();
            instance = new SingleTon();
        }
        return instance;
    }

    private static void pause() {
        try {
            Thread.sleep(100); // demo only: widens window
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
