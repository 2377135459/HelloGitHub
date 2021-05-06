package com.uniin.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaApplication
 *
 * @author ZhangYY
 * @date 2020/12/24
 */
//设置不配置数据库
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

}
