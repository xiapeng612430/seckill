package com.imook.seckill.service;

import com.imook.seckill.entity.Seckill;
import java.util.List;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by xianpeng.xia
 * on 2019-06-04 12:39
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class SeckillServiceTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private SeckillService seckillService;

    @Test
    public void getSeckillList() throws Exception {
        List<Seckill> list = seckillService.getSeckillList();
        logger.info("list={}", list);
    }

    @Test
    public void getById() throws Exception {
        Seckill seckill = seckillService.getById(1000);
        logger.info("seckill={}" + seckill);
    }


    /**
     * 秒杀开启输出秒杀接口地址
     * 否则输出系统时间和秒杀时间
     */
    @Test
    public void exportSeckillUrl() throws Exception {

    }

    /**
     * 执行秒杀
     */
    @Test
    public void executeSeckillhrows() throws Exception {

    }


}