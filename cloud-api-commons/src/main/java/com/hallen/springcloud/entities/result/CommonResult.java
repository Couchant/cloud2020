package com.hallen.springcloud.entities.result;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: CommonResult
 * @Description: TODO
 * @Author: Hallen
 * @Date: 2020/9/3 12:23
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommonResult<T> {
    /**
     * 返回码 200-成功
     */
    private String code;
    /**
     * 返回描述
     */
    private String message;
    /**
     * 返回数据
     */
    private T data;

    public CommonResult(String code,String message){
        this(code,message,null);
    }
}
