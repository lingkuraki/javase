package com.kuraki.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * newFixedThreadPool 固定线程池/有界的线程池
 */
public class NewFixed {

    /**
     *
     * @param nThreads 线程数数量
     * @return 线程封装类
     */
    public static ExecutorService newFixedThreadPool(int nThreads) {
        // newFixedThreadPool的corePoolSize和maximumPoolSize是相同的
        return new ThreadPoolExecutor(nThreads, nThreads,
                0L, TimeUnit.SECONDS,
                // 默认采用的是LinkedBlockingQueue队列,该队列可以说是无界的
                new LinkedBlockingQueue<Runnable>());
    }
}
