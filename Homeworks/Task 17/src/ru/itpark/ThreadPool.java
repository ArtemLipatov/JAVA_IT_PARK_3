package ru.itpark;

import java.util.Deque;
import java.util.LinkedList;

public class ThreadPool {

    // объявим массив потоков, которые будут выполнять задачи
    private PoolWorker threads[];

    // очередь задач
    // используется двунаправленная очередь Дек
    private Deque<Runnable> tasks;
    private boolean isStopped = false;

    public ThreadPool(int threadCount) {
        // объявили массив из threadCount потоков
        threads = new PoolWorker[threadCount];

        for (int i = 0; i < threadCount; i++) {
            // инициализировали каждый поток
            threads[i] = new PoolWorker();
            // запустили его
            threads[i].start();
        }

        tasks = new LinkedList<>();
    }

    public void submitTask(Runnable task) {
        // блокируем очередь задач, потому что пока мы кладем
        // никто не имеет права забирать
        if (!isStopped) {
            synchronized (tasks) {
                tasks.add(task);
                // оповещаем всех, кто ждет задач из этой очереди
                tasks.notify();
            }
        }
    }

    public void shutdown() {
        isStopped = true;
    }

    // вложенный класс, который отвечает
    // за выполнение какой либо задачи
    private class PoolWorker extends Thread {
        public void run() {
            // взять задачу из очереди задач
            // и запустить ее на выполнение
            Runnable task = null;
            // поток работает всегда в фоновом режиме, никогда не закрывается
            while (true) {
                // блокируем очередь задач
                while (!isStopped) {
                    synchronized (tasks) {
                        // пока очередь задач пустая
                        while (tasks.isEmpty()) {
                            try {
                                tasks.wait();
                            } catch (InterruptedException e) {
                                throw new IllegalStateException(e);
                            }
                        }
                        task = tasks.removeFirst();
                    }
                    // как только мы дождались момента, что задача есть

                    // получили задачу
                    // запустили на выполнение
                    task.run();
                }
            }
        }
    }
}