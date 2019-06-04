package com.imook.seckill.exception;

/**
 * Created by xianpeng.xia
 * on 2019-06-04 11:33
 *
 * 重复秒杀异常
 */
public class RepeatKillException extends SeckillException {

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
