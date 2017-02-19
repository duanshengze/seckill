package org.seckill.dao;

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
    int insertSuccessKilled(long seckilled,long userPhone);

    /**
     * 根据id查询SucceKilled并携带秒杀产品对象的实体
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(long seckillId);
}
