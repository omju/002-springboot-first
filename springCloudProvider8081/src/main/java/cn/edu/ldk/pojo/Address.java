package cn.edu.ldk.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;


@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("tb_address")
public class Address {
    @TableId(type = IdType.AUTO)
    private int addressId;
    private String province;
    private String city;
    private String area;
    private String tel;
    @TableField("post_num")
    private String postNum;

}
