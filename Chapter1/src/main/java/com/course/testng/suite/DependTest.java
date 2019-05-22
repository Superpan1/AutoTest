package com.course.testng.suite;
//依赖测试：依赖的方法不通过，本身方法就不能再执行下去
import org.testng.annotations.Test;

public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})//注意写法{""}
    public void test2(){
        System.out.println("test2 run");
    }
}
