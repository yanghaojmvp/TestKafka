package com.sid.spark.kafka;

/**
 * @author yanghaojie
 * @date 2020-06-28 13:51
 * 类解释：
 */
public class KafkaConsumerClientApp {

    public static void main(String[] args) {
        new KafkaConsumer("topic_rhino_asyncdata_all_bak002").start();
    }
}
