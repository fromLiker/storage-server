package io.seata.sample.service;

/**
 * @author Liker
 */
public interface StorageService {

    /**
     * 扣减库存
     * @param productId 产品id
     * @param count 数量
     * @return
     */
    void decrease(Integer productid, Integer countnum);
}
