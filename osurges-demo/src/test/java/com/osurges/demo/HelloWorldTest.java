package com.osurges.demo;

import org.junit.Assert;
import org.junit.Test;

/**
 * TODO 功能描述
 *
 * @author Li.shangjin@icloud.com
 * @date 2019-01-02 15:23
 */
public class HelloWorldTest {

    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String ss = hw.testMethod1();
        Assert.assertNotNull(ss);
    }
//
//    @Test
//    public void testmethod2() {
//        HelloWorld hw = new HelloWorld();
//        int ss = hw.addMethod(1, 1);
//        Assert.assertEquals(ss, 2);
//    }
//
//    @Test
//    public void test1(){
//        DemoApp demoApp = new DemoApp();
//        demoApp.main(new String[]{"abc"});
//    }

}
