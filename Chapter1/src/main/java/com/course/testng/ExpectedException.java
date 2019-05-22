package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {

    //异常测试:期待一个结果为异常但希望后续程序能够继续下去
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();
    }
}
