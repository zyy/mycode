package com.yycoder.dp.factorymethod.normal;

/**
 * Created with IntelliJ IDEA.
 * User: yycoder
 * Date: 14-3-20
 * Time: 上午11:23
 * To change this template use File | Settings | File Templates.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is sms sender");
    }
}
