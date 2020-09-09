package com.crc.pay.strategy.controller;

import com.crc.pay.strategy.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: crc
 * @version:1.0
 * @date: 2020-09-08 15:53
 * @descripton:
 */
@RestController
public class PayController {

    @Autowired
    private PayService payService;

    @RequestMapping("/pay")
    public String pay(String type, String amount){
        return payService.pay(type, amount);
    }
}
