package cn.edu.ldk.service;

import cn.edu.ldk.common.CommonJSONResult;
import cn.edu.ldk.pojo.Address;

import java.util.List;

public interface AddressService {

    //查询所有地址格式
    List<Address> findAllAddress();

    // 添加功能
    CommonJSONResult<Void> save(Address address);

    CommonJSONResult<Address> findAddressById(String id);


}
