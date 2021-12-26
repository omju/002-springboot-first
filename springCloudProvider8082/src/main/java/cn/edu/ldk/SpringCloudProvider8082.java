package cn.edu.ldk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan(value = "cn.edu,ldk.mapper")
@EnableEurekaClient
public class SpringCloudProvider8082 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProvider8082.class,args);
    }
}
