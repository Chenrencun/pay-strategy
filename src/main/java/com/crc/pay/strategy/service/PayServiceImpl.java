package com.crc.pay.strategy.service;

import com.crc.pay.strategy.enums.PayEnum;
import com.crc.pay.strategy.factory.PayStrategyFactory;
import com.crc.pay.strategy.strategy.PayStrategy;
import com.crc.pay.strategy.util.SpringContextUtil;
import org.springframework.stereotype.Service;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-08 16:03
 * @descripton:
 */
@Service
public class PayServiceImpl implements PayService{

    private static String MSG = "使用 %s ,消费了 %s 元";

    @Override
    public String pay(String type, String amount) {
/*        if (PayEnum.ALI_PAY.getType().equals(type)){
            // 支付宝支付
            return String.format(MSG, PayEnum.ALI_PAY.getDescription(), amount);
        } else if (PayEnum.WECHAT_PAY.getType().equals(type)) {
            // 微信支付
            return String.format(MSG, PayEnum.WECHAT_PAY.getDescription(), amount);
        } else if (PayEnum.UNION_PAY.getType().equals(type)) {
            // 银联支付
            return String.format(MSG, PayEnum.UNION_PAY.getDescription(), amount);
        }
        return "输入的支付类型错误！";*/

        PayStrategy payStrategy = PayStrategyFactory.getPayStrategy(type);
        if (payStrategy == null){
            return "输入的支付类型错误！";
        }
        return payStrategy.pay(type, amount);
    }
}
