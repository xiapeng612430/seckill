package com.imook.seckill.exception;

/**
 * Created by xianpeng.xia
 * on 2019-06-04 11:36
 */
public class SeckillException extends RuntimeException {

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
