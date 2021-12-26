package cn.edu.ldk.controller;

import cn.edu.ldk.common.CommonJSONResult;
import cn.edu.ldk.pojo.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsulController {

//    public static final String SERVER_URL="http://localhost:8003";
    public static final String SERVER_URL="http://consul-provider-service";



    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consul/consumer/getAddress")
    public CommonJSONResult<Address> getConsulConsumerAddressInfo(){
        CommonJSONResult result =
                restTemplate.getForObject(SERVER_URL + "/consul/getAddress", CommonJSONResult.class);
        return result;
    }
}
