package com.crc.pay.strategy.strategy;

import com.crc.pay.strategy.enums.PayEnum;
import org.springframework.stereotype.Component;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-08 17:40
 * @descripton: 银联支付
 */
@Component("unionPayStrategy")
public class UnionPayStrategyImpl implements PayStrategy{
    @Override
    public String pay(String type, String amount) {
        return String.format(MSG, PayEnum.UNION_PAY.getDescription(), amount);
    }
}
