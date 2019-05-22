package com.course.testng;


import org.testng.annotations.*;

public class BasicAnnotation {

    //最基本的注解test
    @Test
    public void testCase1(){
        System.out.println("测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.println("测试用例2");

    }
    //测试套件是在class运行之前！！！
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("测试套件前");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("测试套件后");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("类运行前");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("类运行后");
    }
    @BeforeMethod
    public void beforeMethod(){

        System.out.println("方法前");
    }
    @AfterMethod
    public void  afterMethod(){
        System.out.println("方法后");
    }
}
