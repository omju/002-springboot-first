package cn.edu.ldk;

import cn.edu.ldk.mapper.AddressMapper;
import cn.edu.ldk.pojo.Address;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class springCloudProvider8081Tests {
    @Resource
    private AddressMapper addressMapper;


    @Test
    public void test01(){
        System.out.println("12");
        QueryWrapper<Address> wrapper = new QueryWrapper<>();
        List<Address> addresses = addressMapper.selectList(wrapper);

        for (Address address : addresses) {
            System.out.println(address);
        }
    }
}
