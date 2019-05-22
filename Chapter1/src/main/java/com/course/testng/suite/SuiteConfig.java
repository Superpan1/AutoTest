package com.course.testng.suite;

import org.testng.annotations.*;

//套件运行前需要设置的共有东西
public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite 运行了");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite 运行了");
    }
    @BeforeTest
    public void test(){
        System.out.println("before class 运行了");
    }
    @AfterTest
    public void test1(){
        System.out.println("after class 运行了");
    }
}
