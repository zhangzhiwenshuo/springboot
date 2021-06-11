package com.sxnkcd.crawler;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    protected String[] filePaths = new String[1];


    @Scheduled(fixedRate = 50000)
    public void reportCurrentTime() {
        ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(new File("/usr/bin/chromedriver")).usingAnyFreePort().build();
        ChromeDriver driver=new ChromeDriver(service,WebDriverUtil.setDownloadPath("/home/zhangzw/temp"));
        try {
            Thread.sleep(1 * 1000);
        } catch (InterruptedException e) {
            log.error("睡眠异常");
        }
        driver.get("http://sthjj.dt.gov.cn/dthbj/gsxx/list.shtml");
        try {
            Thread.sleep(1 * 10000);
        } catch (InterruptedException e) {
            log.error("睡眠异常");
        }
        log.info("The time is now {}", dateFormat.format(new Date()));
    }
}
