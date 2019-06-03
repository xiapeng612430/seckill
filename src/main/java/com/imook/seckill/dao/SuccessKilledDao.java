package com.imook.seckill.dao;

import com.imook.seckill.entity.SuccessKilled;

/**
 * Created by xianpeng.xia
 * on 2019-06-04 01:03
 */
public interface SuccessKilledDao {

    int insertSuccessKilled(long seckillId, long userPhone);

    SuccessKilled queryByIdWithSeckill(long seckillId);

}
