package tech.aistar.day04.vo;

import tech.aistar.day04.entity.Items;
import tech.aistar.day04.entity.Orderdetail;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/5/14 0014
 */
public class OrdersDetailCustomVo extends Orderdetail{

    //一条明细对应一个商品
   private ItemCustomVo itemCustomVo;

    public void setItemCustomVo(ItemCustomVo itemCustomVo) {
        this.itemCustomVo = itemCustomVo;
    }

    public ItemCustomVo getItemCustomVo() {
        return itemCustomVo;
    }
}
