package com.lyl.demo.elastic;


import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

public class TestSimpleJob2 implements SimpleJob {

    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("定时2任务开始");
        try {
            Thread.sleep(10000);
//            int i = 10 / 0;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("定时2任务结束");
    }

}
