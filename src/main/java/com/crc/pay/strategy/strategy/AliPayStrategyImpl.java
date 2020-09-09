package com.crc.pay.strategy.strategy;

import com.crc.pay.strategy.enums.PayEnum;
import org.springframework.stereotype.Component;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-08 17:38
 * @descripton: 支付宝支付
 */
@Component("aliPayStrategy")
public class AliPayStrategyImpl implements PayStrategy{

    @Override
    public String pay(String type, String amount) {
        return String.format(MSG, PayEnum.ALI_PAY.getDescription(), amount);
    }
}
