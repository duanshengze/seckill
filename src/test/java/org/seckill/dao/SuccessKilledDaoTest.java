package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/2/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {
    @Resource
    private SuccessKilledDao successKilledDao;
    @Test
    public void insertSuccessKilled() throws Exception {
       int sd= successKilledDao.insertSuccessKilled(1001,1356666);
       System.out.println(sd);
    }

    @Test
    public void queryByIdWithSeckill() throws Exception {
        SuccessKilled successKilled=successKilledDao.queryByIdWithSeckill(1001,1356666);
        System.out.println(successKilled);
    }

}