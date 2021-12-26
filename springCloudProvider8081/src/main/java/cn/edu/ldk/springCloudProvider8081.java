package cn.edu.ldk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan(value = "cn.edu.ldk.mapper")
@EnableEurekaClient // 启动Eureka 客户端
public class springCloudProvider8081 {
    public static void main(String[] args) {
        SpringApplication.run(springCloudProvider8081.class,args);
        System.out.println("123");
    }
}
