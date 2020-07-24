package com.sid.spark.kafka;

/**
 * @author yanghaojie
 * @date 2020-06-28 13:53
 * 类解释：
 */

import kafka.consumer.Consumer;
import kafka.consumer.ConsumerConfig;
import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by jy02268879 on 2018/7/16.
 * <p>
 * Kafka消费者
 */
public class KafkaConsumer extends Thread {
    private String topic;


    public KafkaConsumer(String topic) {
        this.topic = topic;
    }

    private ConsumerConnector createConnector() {
        Properties properties = new Properties();
        properties.put("zookeeper.connect", KafkaProperties.ZK);
        properties.put("group.id", KafkaProperties.GROUP_ID);
        return Consumer.createJavaConsumerConnector(new ConsumerConfig(properties));
    }

    @Override
    public void run() {
        ConsumerConnector consumer = createConnector();
        Map<String, Integer> topicCountMap = new HashMap<String, Integer>();
        topicCountMap.put(topic, 1);

        //String:topic
        //List<KafkaStream<byte[], byte[]>> 对应数据流
        Map<String, List<KafkaStream<byte[], byte[]>>> messageStreams = consumer.createMessageStreams(topicCountMap);
        KafkaStream<byte[], byte[]> stream = messageStreams.get(topic).get(0);//get(0)获取我们每次接收到的数据
        ConsumerIterator<byte[], byte[]> iterator = stream.iterator();
        while (iterator.hasNext()) {
            String message = new String(iterator.next().message());
            System.out.print("rec:" + message);
        }

    }
}
