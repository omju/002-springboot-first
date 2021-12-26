package cn.edu.ldk.controller;

import cn.edu.ldk.common.CommonJSONResult;
import cn.edu.ldk.pojo.Address;
import cn.edu.ldk.service.AddressService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class AddressController {

    @Resource
    private AddressService addressService;


    //localhost:8081/provider/getAddressInfo
    //输入地址，返回json数据给浏览器
    @GetMapping("/provider/getAddressInfo")
    public List<Address> getAddressInfo(){
        return addressService.findAllAddress();
    }

    // 添加
    @PostMapping("/provider/save")
    // 用@RequestBody 将字符串转为对象
    public CommonJSONResult<Void> save(@RequestBody Address address){
        CommonJSONResult<Void> save = addressService.save(address);
        return save;
    }

    // 根据id 查询 具体的某条地址信息
    @RequestMapping("/provider/findById")
    public CommonJSONResult<Address> findById(@RequestBody String id){
        System.out.println("调用 8081 的/provider/findById 方法");
        CommonJSONResult<Address> find= addressService.findAddressById(id);
        return find;
    }





}
