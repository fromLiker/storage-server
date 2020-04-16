package io.seata.sample.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Liker
 */
@Repository
public interface StorageDao {

    /**
     * a扣减库存
     * @param productid 产品id
     * @param countnum 数量
     * @return
     */
    void decrease(@Param("productid") Integer productid, @Param("countnum") Integer countnum);
}
