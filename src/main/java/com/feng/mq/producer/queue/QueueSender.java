package com.feng.mq.producer.queue;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * Desc:
 * Created by jinx on 2017/9/21.
 */
@Component
public class QueueSender {

    @Resource
    @Qualifier("jmsQueueTemplate")
    private JmsTemplate jmsTemplate;

    public void send(String queueName, final String message) {
        jmsTemplate.send(queueName, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(message);
            }
        });
    }
}
