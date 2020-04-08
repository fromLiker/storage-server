package io.seata.sample.controller;


import io.seata.sample.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author IT云清
 */
@RestController
@RequestMapping("storage")
public class StorageController {

    @Autowired
    private StorageService storageServiceImpl;

    /**
     * 扣减库存
     * @param productId 产品id
     * @param count 数量
     * @return
     */
    @RequestMapping("decrease")
    public String decrease(@RequestParam("productid") Integer productid,@RequestParam("countnum") Integer countnum){
        storageServiceImpl.decrease(productid, countnum);
        return "Decrease storage success";
    }
}
