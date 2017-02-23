package org.seckill.dto;

import org.seckill.entity.SuccessKilled;
import org.seckill.enums.SeckillStatEnum;

/**
 * Created by dsz on 17/2/22.
 * 封装秒杀执行后结果
 */
public class SeckillExecution {

    private  long seckillId;
    //秒杀执行结果状态
    private  int state;
    //状态表示
    private  String  stateInfo;
    //秒杀成功对象
    private SuccessKilled successKilled;

    /**
     * 秒杀成功构造函数
     * @param seckillId
     * @param statEnum

     * @param successKilled
     */

    public SeckillExecution(long seckillId, SeckillStatEnum statEnum, SuccessKilled successKilled) {
        this.seckillId = seckillId;
        this.state = statEnum.getState();
        this.stateInfo = statEnum.getStateInfo();
        this.successKilled = successKilled;
    }

    /**
     * 秒杀失败构造函数
     * @param seckillId

     */

    public SeckillExecution(long seckillId, SeckillStatEnum statEnum) {
        this.seckillId = seckillId;
        this.state = statEnum.getState();
        this.stateInfo = statEnum.getStateInfo();
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public int getState() {
        return state;
    }



    public String getStateInfo() {
        return stateInfo;
    }


    public SuccessKilled getSuccessKilled() {
        return successKilled;
    }

    public void setSuccessKilled(SuccessKilled successKilled) {
        this.successKilled = successKilled;
    }
}
