package com.imook.seckill.dao;

import static org.junit.Assert.*;

import com.imook.seckill.entity.Seckill;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by xianpeng.xia
 * on 2019-06-04 09:20
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {

    @Resource
    private SeckillDao seckillDao;


    @Test
    public void testQueryById() throws Exception {
        Seckill seckill = seckillDao.queryById(1000);
        System.out.println(seckill);
    }

    @Test
    public void testQueryAll() throws Exception {
        List<Seckill> list = seckillDao.queryAll(0, 100);
        for (Seckill seckill : list) {
            System.out.println(seckill.toString());

        }
    }

    @Test
    public void testReduceNumber() throws Exception {
        int flag = seckillDao.reduceNumber(1000, new Date());
        System.out.println(flag);
    }

}