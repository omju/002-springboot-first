package cn.edu.ldk.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors
@AllArgsConstructor
@NoArgsConstructor
public class CommonJSONResult<T> {
    private Integer state;
    private String message;
    private T data;

    public CommonJSONResult(Integer state, String message){
        this.state = state;
        this.message = message;
    }
}
