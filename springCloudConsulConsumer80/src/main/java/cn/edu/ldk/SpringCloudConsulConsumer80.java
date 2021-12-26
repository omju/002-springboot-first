package cn.edu.ldk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudConsulConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsulConsumer80.class,args);
    }
}
