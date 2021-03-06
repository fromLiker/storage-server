package io.seata.sample.service;

import io.seata.sample.dao.StorageDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Liker
 */
@Service("storageServiceImpl")
public class StorageServiceImpl implements StorageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Autowired
    private StorageDao storageDao;

    /**
     * a扣减库存
     * @param productid 产品id
     * @param countnum 数量
     * @return
     */
    @Override
    public void decrease(Integer productid, Integer countnum) {
        LOGGER.info("------->扣减库存开始");
        storageDao.decrease(productid, countnum);
        LOGGER.info("------->扣减库存结束");
    }
}
