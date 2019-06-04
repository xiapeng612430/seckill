package com.imook.seckill.exception;

/**
 * Created by xianpeng.xia
 * on 2019-06-04 11:35
 * 秒杀关闭异常
 */
public class SeckillCloseException extends SeckillException {

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
