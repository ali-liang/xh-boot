package com.xingkong.timer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Timer;
@RestController
public class MyTimer {
    @GetMapping("/getTimer")
    public void testTimer(){
        Timer timer = new Timer();
        MyTimerTask myTimerTask = new MyTimerTask("No.1");
        timer.schedule(myTimerTask,2000,1000);
    }
}
