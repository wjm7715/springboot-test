package com.wjm.springbootasync.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TreadTasks {

    @Async
    public void startMyTreadTask() {
        System.out.println("this is my async task");
        try {
            Thread.sleep(10000);
            System.out.println("startMyTreadTask: " + new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
