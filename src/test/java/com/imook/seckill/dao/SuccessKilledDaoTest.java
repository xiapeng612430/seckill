package com.imook.seckill.dao;

import static org.junit.Assert.*;

import com.imook.seckill.entity.SuccessKilled;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by xianpeng.xia
 * on 2019-06-04 10:37
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {

    @Resource
    SuccessKilledDao successKilledDao;

    @Test
    public void testQueryByIdWithSeckill() throws Exception {
        SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(1000L, 18122112228L);
        System.out.println(successKilled);
    }

    @Test
    public void testInsertSuccessKilled() throws Exception {
        int insertCount = successKilledDao.insertSuccessKilled(1000L, 18122112228L);
        System.out.println(insertCount);
    }
}