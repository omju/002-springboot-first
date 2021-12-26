package cn.edu.ldk.service;

import cn.edu.ldk.common.CommonJSONResult;
import cn.edu.ldk.mapper.AddressMapper;
import cn.edu.ldk.pojo.Address;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService{

    //注入持久层对象
    //也可以用@Resource注解
    @Autowired(required = false)
    private AddressMapper addressMapper;

    @Override
    public List<Address> findAllAddress() {
       return addressMapper.selectList(new QueryWrapper<Address>());

    }

    @Override
    public CommonJSONResult<Void> save(Address address) {
        // 可以在这里做参数判断 address判断
        int insert = addressMapper.insert(address);
        if (insert!=1){
            return new CommonJSONResult<>(201,"添加失败",null);
        }
        return new CommonJSONResult<>(200,"添加成功",null);
    }

    @Override
    public CommonJSONResult<Address> findAddressById(String id) {
        Address address = addressMapper.selectById(id);
        if (address == null){
            // 在这里就封装好了数据！！！
            return new CommonJSONResult<Address>(201,"8082查找失败",null);
        }
        return new CommonJSONResult<Address>(200,"8082查询成功",address);

    }
}
