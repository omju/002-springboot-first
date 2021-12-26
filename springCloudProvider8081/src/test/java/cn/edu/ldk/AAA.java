package cn.edu.ldk;

import cn.edu.ldk.mapper.AddressMapper;
import cn.edu.ldk.pojo.Address;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AAA {
    @Autowired(required = false)
    private AddressMapper addressMapper;
    @Test
    public void a(){
        addressMapper.selectList(new QueryWrapper<Address>());
    }
}
