package com.lyl.demo.elastic;


import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

public class TestSimpleJob implements SimpleJob {


    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("定时1任务开始");
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("定时1任务结束");
    }

}
