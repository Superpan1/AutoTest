package com.course.testng.group;

import org.testng.annotations.Test;

@Test(groups="teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("GroupsOnClass3中的tch1运行");
    }
    public void teacher2(){
        System.out.println("GroupsOnClass3中的tch2运行");
    }
}
