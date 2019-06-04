package com.imook.seckill.dao;

import com.imook.seckill.entity.SuccessKilled;
import org.apache.ibatis.annotations.Param;

/**
 * Created by xianpeng.xia
 * on 2019-06-04 01:03
 */
public interface SuccessKilledDao {

    int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

}
