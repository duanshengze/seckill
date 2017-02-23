package org.seckill.exception;

/**
 * Created by dsz on 17/2/22.
 * 重复秒杀异常
 * spring捕捉运行异常
 */
public class RepeatKillException extends SeckillException{


    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
