package cn.edu.ldk.controller;

import cn.edu.ldk.common.CommonJSONResult;
import cn.edu.ldk.pojo.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class AddressController {

//    public static final String PROVIDER_URL="http://localhost:8081/provider/";

    public static final String PROVIDER_URL="http://CLOUD-PROVIDER-SERVICE/provider/";


    // 这个是与客户的交互
    //还是返回JSON字符串
    //获取数据用getMappering 就可以了

    // 返回List <这里可以写Object 也可以写Address 用于数据封装>

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/getAll")
    public List<Address> getAllAddressInfos(){

        // 这里最主要的业务就是 和 8081 端口连接 用RestTemplate连接
        // RestTemplate是一个组件！

        //参数解析
        // 参数一： 访问提供服务的url 也就是访问路径！
        // 参数二： 提交给提供者的参数 没有参数可以不写
        // 调用完提供者后返回的数据类型（消费者需要知道数据类型）

       // 返回的数据类型
        List<Address> list =
                restTemplate.getForObject(PROVIDER_URL + "getAddressInfo",List.class);
        return list;
    }


    // 消费者的添加
    @PostMapping("/consumer/save")
    public CommonJSONResult<Void> save(Address address){
        // 端口和端口之间 现在要传一个 对象 🔺 传对象是由底层转成JSON格式传过去的
        // 引出一个问题： 服务者端口如何接收这个 JSON 对象 并转成对象
        CommonJSONResult commonJSONResult =
                restTemplate.postForObject(PROVIDER_URL + "save", address, CommonJSONResult.class);
        return commonJSONResult;
    }

    @PostMapping("consumer/findById")
    public CommonJSONResult<Address> findById(String id){
        CommonJSONResult commonJSONResult =
                restTemplate.postForObject(PROVIDER_URL+"findById",id,CommonJSONResult.class);
        System.out.println("这是消费者===================="+id);
        return commonJSONResult;
    }



}
