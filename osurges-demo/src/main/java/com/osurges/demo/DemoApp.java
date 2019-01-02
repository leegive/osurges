package com.osurges.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * TODO 功能描述
 *
 * @author Li.shangjin@icloud.com
 */
@SpringBootApplication
public class DemoApp {

    public static void main(String[] args) {
        SpringApplication.run(DemoApp.class, args);
    }

    public void say(String hello) {
        System.out.println(hello);
    }

}
