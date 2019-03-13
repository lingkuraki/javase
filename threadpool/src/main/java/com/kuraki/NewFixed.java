package com.kuraki;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * newFixedThreadPool 固定线程池/有界的线程池
 */
public class NewFixed {

    public static ExecutorService newFixedThreadPool(int nThreads) {
        return new ThreadPoolExecutor(nThreads, nThreads,
                0L, TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>());
    }
}
