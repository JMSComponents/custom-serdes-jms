package io.github.jmscomponents.custom.serdes.internal;

import javax.jms.JMSException;
import javax.jms.Topic;

import io.github.jmscomponents.custom.serdes.Serdes;


public class TopicSubscriber<T extends javax.jms.TopicSubscriber> extends MessageConsumer<T> implements javax.jms.TopicSubscriber {

    public TopicSubscriber(Serdes serdes, T topicSubscriber){
        super(serdes, topicSubscriber);
    }

    public Topic getTopic() throws JMSException {
        return delegate().getTopic();
    }

    public boolean getNoLocal() throws JMSException {
        return delegate().getNoLocal();
    }
}
