package io.seata.sample.entity;

import lombok.Data;

/**
 * @author Liker
 */
@Data
public class Storage {

    private Integer id;

    /**a产品id*/
    private Integer productid;

    /**a总库存*/
    private Integer total;

    /**a已用库存*/
    private Integer used;

    /**a剩余库存*/
    private Integer residue;
}
