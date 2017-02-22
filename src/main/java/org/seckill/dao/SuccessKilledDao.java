package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

/**
 * Created by dsz on 17/2/19.
 */
public interface SuccessKilledDao {
    /**
     * 插入购买明细，可过滤重复
     * @param seckilled
     * @param userPhone
     * @return 插入的行数即个数
     */
    int insertSuccessKilled(@Param("seckilled") long seckilled, @Param("userPhone") long userPhone);

    /**
     * 根据id查询SucceKilled并携带秒杀产品对象的实体
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId,@Param("userPhone")long userPhone);
}
