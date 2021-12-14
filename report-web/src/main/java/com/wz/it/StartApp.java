package com.wz.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 应用启动入口
 *
 * @author zhaowangquan
 * @since 2021/12/14 5:04 下午
 */
@SpringBootApplication
public class StartApp {

    public static void main(String[] args) {
        new SpringApplication(StartApp.class).run(args);
    }
}
