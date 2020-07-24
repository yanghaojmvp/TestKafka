package com.sid.spark.kafka;

/**
 * @author yanghaojie
 * @date 2020-06-28 13:50
 * 类解释：
 */

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

import java.util.Properties;

/**
 * Created by jy02268879 on 2018/7/15.
 * <p>
 * Kafka生产者
 */
public class KafkaProducer extends Thread {//测试的时候用线程的方式测试

    private String topic;
    private String data;
    private Producer<Integer, String> producer;

    public KafkaProducer(String topic, String data) {
        this.topic = topic;
        this.data = data;
        Properties properties = new Properties();

        properties.put("metadata.broker.list", KafkaProperties.BROKER_LIST);
        properties.put("serializer.class", "kafka.serializer.StringEncoder");
        properties.put("request.required.acks", "1");

        this.producer = new Producer<Integer, String>(new ProducerConfig(properties));
    }

    @Override
    public void run() {

        producer.send(new KeyedMessage<Integer, String>(topic, data));
        System.out.print("Send:" + data);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}