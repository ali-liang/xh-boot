package com.xingkong.timer;

import java.util.TimerTask;

public class MyTimerTask extends TimerTask {
    private String name;

    public MyTimerTask(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("current name is:"+name);
    }
}
