package cn.edu.ldk;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // 启用consul客户端
public class SpringCloudConsulProvider8003 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsulProvider8003.class,args);
    }
}
