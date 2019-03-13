package com.kuraki;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/**
 *
 */
public class ThreadPoolExecutor {

    /**
     * @param corePoolSize    核心线程数，也可以说是最小线程数
     * @param maximumPoolSize 最大线程数
     * @param keepAliveTime   空闲活跃时间
     * @param unit            时间单位
     * @param workQueue       工作队列
     * @param threadFactory   线程工厂
     * @param handler         拒绝异常处理，策略模式
     */
    public ThreadPoolExecutor(int corePoolSize,
                              int maximumPoolSize,
                              long keepAliveTime,
                              TimeUnit unit,
                              BlockingQueue<Runnable> workQueue,
                              ThreadFactory threadFactory,
                              RejectedExecutionHandler handler) {

    }
}
