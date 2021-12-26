package cn.edu.ldk;

import cn.edu.ldk.mapper.AddressMapper;
import cn.edu.ldk.pojo.Address;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestAddress {

    @Autowired(required = false)
    private AddressMapper addressMapper;


    @Test
    public void test(){
        System.out.println("12");
        QueryWrapper<Address> wrapper = new QueryWrapper<>();
        List<Address> addresses = addressMapper.selectList(wrapper);

        for (Address address : addresses) {
            System.out.println(address);
        }
    }
}
