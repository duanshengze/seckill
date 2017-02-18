--数据库初始化脚本
--创建数据库
CREATE DATABASE seckill;
--使用数据库
use seckill;

CREATE  TABLE  seckill(
    'seckill_id' bigint NOT  NULL AUTO_INCREMENT COMMENT '商品库存id',
    'name' varchar (120) NOT NULL  COMMENT '商品名称',
    'number' int NOT NULL  COMMENT '库存数量',
    'start_time' timestamp NOT NULL COMMENT '秒杀开启时间',
    'end_time' timestamp NOT NULL  COMMENT '秒杀结束时间',
    'create_time' timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间',

    PRIMARY KEY (seckill_id),
    KEY idx_start_time(start_time),
    KEY idx_end_time(end_time),
    KEY  idx_create_time(create_time)

)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT  CHARSET=utf8 COMMENT='秒杀库存表';
-- 初始化数据
INSERT  INTO seckill(name ,number,start_time,end_time)
VALUES
('1000秒杀iPhone6',100,'2015-11-01 00:00:00','2015-11-02 00:00:00'),
('500秒杀ipad2',200,'2015-11-01 00:00:00','2015-11-02 00:00:00'),
('300秒杀小米4',300,'2015-11-01 00:00:00','2015-11-02 00:00:00'),
('200秒杀红米',400,'2015-11-01 00:00:00','2015-11-02 00:00:00');
--秒杀成功明细表
--用户登录认证相关的信息
CREATE TABLE  success_killed(
    's'


)ENGINE=InnoDB  DEFAULT  CHARSET=utf8 COMMENT='秒杀库存表';