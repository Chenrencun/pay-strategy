package com.crc.pay.strategy.factory;

import com.crc.pay.strategy.enums.PayEnum;
import com.crc.pay.strategy.strategy.PayStrategy;
import com.crc.pay.strategy.util.SpringContextUtil;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-09 9:16
 * @descripton: payStrategy实现类的工厂类
 */
public class PayStrategyFactory {

    /**
     * 根据type获取对应PayStrategy实现类
     * @param type
     * @return
     */
    public static PayStrategy getPayStrategy(String type){
        PayEnum payEnum = PayEnum.getByType(type);
        if (payEnum == null){
            return null;
        }
        return SpringContextUtil.getBean(payEnum.getBeanName(), PayStrategy.class);
    }
}
