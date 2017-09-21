package com.feng.mq.consumer.queue;

import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Desc:
 * Created by jinx on 2017/9/21.
 */
@Component
public class QueueReceiver1 implements MessageListener {
    public void onMessage(Message message) {
        try {
            System.out.println("QueueReceiver1接收到的消息：" + ((TextMessage) message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
