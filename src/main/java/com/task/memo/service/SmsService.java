package com.task.memo.service;

import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import com.task.memo.entity.SmsPojo;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Component
public class SmsService {
    
    private final String ACCOUNT_SID ="AC5a9fb0b2295e32e5412074b5c1d50d3c";

    private final String AUTH_TOKEN = "c1c9313b1b697e258d54745bd377814f";

    private final String FROM_NUMBER = "+13465215407";

    public void send(SmsPojo sms) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber(sms.getTo()), new PhoneNumber(FROM_NUMBER), sms.getMessage())
                .create();
        System.out.println("here is my id:"+message.getSid());// Unique resource ID created to manage this transaction

    }

    public void receive(MultiValueMap<String, String> smscallback) {
    }
}
