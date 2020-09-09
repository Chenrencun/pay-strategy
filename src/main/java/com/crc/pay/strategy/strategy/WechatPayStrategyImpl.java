package com.crc.pay.strategy.strategy;

import com.crc.pay.strategy.enums.PayEnum;
import org.springframework.stereotype.Component;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-08 17:39
 * @descripton: 微信支付
 */
@Component("wechatPayStrategy")
public class WechatPayStrategyImpl implements PayStrategy{
    @Override
    public String pay(String type, String amount) {
        return String.format(MSG, PayEnum.WECHAT_PAY.getDescription(), amount);
    }
}
