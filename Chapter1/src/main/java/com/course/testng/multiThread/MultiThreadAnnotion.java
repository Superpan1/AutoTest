package com.course.testng.multiThread;

//多个测试之间没有关联可以用多线程跑
import org.testng.annotations.Test;

public class MultiThreadAnnotion {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id :%s%n",Thread.currentThread().getId());
    }
}
