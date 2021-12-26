package cn.edu.ldk.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//这是一个配置类 需要用到下面注解
@Configuration
public class RestTemplateConfig {

    // 思想： 在springcloud中 要使用组件，是先要把这个组件放进这个容器中，
    // 以前是用xml的配置文件注入，现在用 javaConfig 的方法注入进来 在其他笔记有讲！
    @Bean
    @LoadBalanced // 使用负载均衡策略 Ribbon 默认使用轮询策略
    public RestTemplate getTemplateBean(){
        return new RestTemplate();
    }

}
