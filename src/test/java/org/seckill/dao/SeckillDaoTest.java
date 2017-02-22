package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/2/21.
 * 配置Spring和junit整合 junit启动时加载springIOC容器
 * spring-test ,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {

    //注入Dao实现类依赖
    @Resource
    private SeckillDao seckillDao;
    private Seckill seckill;

    @Test
    public void testqueryById() throws Exception {
        long id=1001;
        Seckill seckill= seckillDao.queryById(id);
        System.out.println(seckill.getName());
        System.out.println(seckill);
        /*
        * 500秒杀ipad2
            Seckill{seckillId=1001, name='500秒杀ipad2',
             number=200, startTime=Sun Nov 01 00:00:00 CST 2015,
             endTime=Mon Nov 02 00:00:00 CST 2015, createTime=Sun Feb 19 22:01:45 CST 2017}
        * */
    }
    @Test
    public void testreuceNumber() throws Exception {
//        java没有保存形参的记录：queryALL(int offset,in limit)->
        // queryAll(arg0,arg1) 导致找不到参数
       int result= seckillDao.reuceNumber(1004,new Date());
       System.out.println(result);
    }



    @Test
    public void queryAll() throws Exception {
        List<Seckill>seckills=seckillDao.queryAll(0,100);
        for (Seckill seckill:seckills){
            System.out.println(seckill);
        }
    }

}