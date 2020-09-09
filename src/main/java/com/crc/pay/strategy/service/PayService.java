package com.crc.pay.strategy.service;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-08 16:02
 * @descripton:
 */
public interface PayService {

    /**
     * 支付接口
     * @param type 支付类型
     * @param amount 支付金额
     * @return
     */
    String pay(String type, String amount);
}
