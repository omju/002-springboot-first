package cn.edu.myRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 成为一个配置类
@Configuration
public class MyRule {

    // IRule 接口 有多个实现类，几乎每一个实现代表的是一种负载均衡策略
    // 这里虽然有叶子，但是是没有被扫描进主程序的，所以引用不了的
    @Bean
    public IRule getMyRule(){
        return new RandomRule();
    }

}
