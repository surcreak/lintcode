package com.company.api_demo;

import com.company.base.BaseDemo;

import java.util.Timer;
import java.util.TimerTask;


/**
 * TimerTask开启定时和关闭操作。
 */
public class TimerTaskDemo extends BaseDemo {

    private volatile int count = 0;

    @Override
    public void solution() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("count = "+count);
                if (count > 5) {
                    timer.cancel();
                }
                count++;
            }
        };
        long delay = 0;
        long intevalPeriod = 1 * 1000;
        timer.scheduleAtFixedRate(task, delay, intevalPeriod);
    }
}
