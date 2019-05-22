package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//1.把参数直接传到方法里
//2.通过方法名去传递参数
import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println(" name= "+name+";"+"age = "+age);
    }

    @DataProvider(name="data")
    public Object[][] provideData(){
        Object[][] o=new Object[][]{
                {"baijihua",100},
                {"zhengjun",90},
                {"jixiang",0}
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name ,int age){
        System.out.println(" test1111111方法 name= "+name+";"+"age = "+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name ,int age){
        System.out.println("test22222222方法 name= "+name+";"+"age = "+age);
    }
    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result=null;
       if(method.getName().equals("test1")){
           result=new Object[][]{
                   {"aaaaaa1",20},
                   {"bbbbbb1",20}
           };
       }
       else if(method.getName().equals("test2")){
           result=new Object[][]{
                   {"aaaaaa2",30},
                   {"bbbbbb2",30}
           } ;
       }
        return result;
    }
}
