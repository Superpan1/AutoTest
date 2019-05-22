package com.course.testng.group;
//方法分组
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups="server")
    public void test01(){
        System.out.println("服务端组的测试方法1111111111111111");
    }
    @Test(groups="server")
    public void test02(){
        System.out.println("服务端组的测试方法2222222222222222");
    }
    @Test(groups="client")
    public void test03(){
        System.out.println("客户端组的测试方法1111111111111111");
    }
    @Test(groups="client")
    public void test04(){
        System.out.println("客户端组的测试方法2222222222222222");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("服务端组运行之后运行的方法！！！");
    }
    @AfterGroups("server")
    public void GroupsOnServer(){
        System.out.println("服务端组运行之前运行的方法！！！");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("客户端组运行之后运行的方法！！！");
    }
    @AfterGroups("client")
    public void GroupsOnClient(){
        System.out.println("客户端组运行之前运行的方法！！！");
    }
}

