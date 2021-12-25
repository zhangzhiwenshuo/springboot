package com.zzw.springboot.sys.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zzw.springboot.restservice.GreetingController;
import com.zzw.springboot.sys.entity.TUser;
import com.zzw.springboot.sys.service.ITUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Configuration
@EnableScheduling
public class ScheduleTask {

    Logger logger = LoggerFactory.getLogger(ScheduleTask.class);

    @Autowired
    private ITUserService service;

    @Scheduled(cron = "0/15 * * * * ?")
    //或直接指定时间间隔，例如：5秒
    //@Scheduled(fixedRate=5000)
    private void configureTasks() {
//        System.err.println("执行静态定时任务时间: " + LocalDateTime.now());
        logger.info("执行静态定时任务时间: {}",LocalDateTime.now());
//        IPage<TUser> userIPage = service.findAllByPage(1,2);
//        System.out.println(userIPage);
    }
}