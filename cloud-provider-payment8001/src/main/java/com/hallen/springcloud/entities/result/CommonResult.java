package com.hallen.springcloud.entities.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: CommonResult
 * @Description: TODO
 * @Author: Hallen
 * @Date: 2020/9/2 17:55
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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