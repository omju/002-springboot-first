package cn.edu.ldk.controller;

import cn.edu.ldk.common.CommonJSONResult;
import cn.edu.ldk.pojo.Address;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsulController {

    @GetMapping("/consul/getAddress")
    public CommonJSONResult<Address> getAddress(){
        // 假设从数据库获取到数据
        // 模拟数据
        Address address = new Address().setPostNum("123").setProvince("湛江").setArea("赤坎").
                setAddressId(10).setTel("12345");
        return new CommonJSONResult<>(200,"查询成功",address);
    }
}
