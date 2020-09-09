package com.crc.pay.strategy.strategy;

public interface PayStrategy {

    String MSG = "使用 %s ,消费了 %s 元";

    String pay(String type, String amount);
}
