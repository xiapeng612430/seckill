package com.imook.seckill.dao;

import com.imook.seckill.entity.Seckill;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by xianpeng.xia
 * on 2019-06-04 01:00
 */
public interface SeckillDao {

    /**
     * 减库存
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    Seckill queryById(long seckillId);

    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    void killByProcedure(Map<String, Object> paramMap);
}
