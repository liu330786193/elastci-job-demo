package com.lyl.demo.elastic;


import com.dangdang.ddframe.job.executor.handler.JobExceptionHandler;

public class CustomJobExceptionHandler implements JobExceptionHandler {
    @Override
    public void handleException(String jobName, Throwable throwable) {
        System.out.println(String.format("Job '%s' exception occur in job processing", jobName));
    }
}
