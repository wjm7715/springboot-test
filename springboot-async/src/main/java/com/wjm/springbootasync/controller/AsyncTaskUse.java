package com.wjm.springbootasync.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/v1.0/springbootAsync/asyncTaskUse")
public class AsyncTaskUse {

    @Autowired
    private TreadTasks treadTasks;

    @GetMapping("/startMysync")
    public void useMySyncTask() {
        treadTasks.startMyTreadTask();
        System.out.println("controller: " + new Date());
    }
}
