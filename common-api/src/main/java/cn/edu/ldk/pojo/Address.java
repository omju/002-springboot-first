package cn.edu.ldk.pojo;


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
public class Address {
    private int addressId;
    private String province;
    private String city;
    private String area;
    private String tel;
    private String postNum;

}
