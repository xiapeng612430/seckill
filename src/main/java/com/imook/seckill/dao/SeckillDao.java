package com.imook.seckill.dao;

import com.imook.seckill.entity.Seckill;
import java.util.Date;
import java.util.List;

/**
 * Created by xianpeng.xia
 * on 2019-06-04 01:00
 */
public interface SeckillDao {

    /**
     * 减库存
     */
    int reduceNumber(long seckillId, Date killTime);

    Seckill queryById(long seckillId);

    List<Seckill> queryAll(int offet, int limit);
}
