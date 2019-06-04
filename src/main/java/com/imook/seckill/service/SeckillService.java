package com.imook.seckill.service;

import com.imook.seckill.dto.Exposer;
import com.imook.seckill.dto.SeckillExecution;
import com.imook.seckill.entity.Seckill;
import com.imook.seckill.exception.RepeatKillException;
import com.imook.seckill.exception.SeckillCloseException;
import com.imook.seckill.exception.SeckillException;
import java.util.List;

/**
 * Created by xianpeng.xia
 * on 2019-06-04 11:17
 */
public interface SeckillService {

    List<Seckill> getSeckillList();

    Seckill getById(long seckillId);


    /**
     * 秒杀开启输出秒杀接口地址
     * 否则输出系统时间和秒杀时间
     */
    Exposer exportSeckillUrl(long seckillId);

    /**
     * 执行秒杀
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5) throws SeckillException, RepeatKillException, SeckillCloseException;

}
