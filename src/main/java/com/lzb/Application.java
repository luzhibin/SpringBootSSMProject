package com.lzb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Created by luzhibin on 2019/11/5 11:40
 */
@SpringBootApplication
@MapperScan("com.lzb.mapper")   //mapper接口扫描：在main方法上添加@MapperScan("包名") 注解
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        System.out.println("你好");
    }
}
//皮卡丘1111
    //是的撒多撒
    //5ds4d5sa4
    //555
//52153165
//4444
