package com.zwu.service;

import com.zwu.dto.Exposer;
import com.zwu.dto.SeckillExecution;
import com.zwu.entity.Seckill;
import com.zwu.exception.SecKillException;
import com.zwu.exception.RepeatKillException;
import com.zwu.exception.SeckillCloseException;


import java.util.List;


public interface SeckillService {
    /**
     * @Description: 查询全部的秒杀记录
     * @Param:
     * @return:
     */
    List<Seckill> getSeckillList();

    /**
     * @Description: 查询单个秒杀记录
     * @Parameter: 
     * @return: 
     */
    Seckill getById(long seckillId);

    /**
     * @Description: 在秒杀开启时输出秒杀接口的地址，否则输出系统时间和秒杀时间
     * @Parameter: 
     * @return: 
     */
    Exposer exportSeckillUrl(long seckillId);

    /**
     * @Description: 执行秒杀操作，有可能失败，有可能成功，所以要抛出我们允许的异常
     * @Parameter: 
     * @return: 
     */
    SeckillExecution executeSeckill(long seckillid, long userPhone, String md5) throws SecKillException, RepeatKillException, SeckillCloseException;

}
