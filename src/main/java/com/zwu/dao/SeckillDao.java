package com.zwu.dao;

import com.zwu.entity.Seckill;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface SeckillDao {
    /**
     * reduce stock
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /**
     * query by Id
     */
    Seckill queryById(long seckillId);

    /**
     * query goods list by offsite
     */
    List<Seckill> queryAll(@Param("offset") int off, @Param("limit") int limit);
}
