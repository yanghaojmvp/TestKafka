package com.sid.spark.kafka;

/**
 * @author yanghaojie
 * @date 2020-06-28 13:51
 * 类解释：
 */
public class KafkaProducerClientApp {

    public static void main(String[] args) {
//        TopicType topicType = TopicType.topic_rhino_asyncdata_all_bak001;
        TopicType topicType = TopicType.topic_rhino_asyncdata_all_bak001;

//        TopicType topicType = TopicType.banyan_sdk_server_log_test;

        System.out.println("###################### 开始写入topic = " + topicType.name());
        new KafkaProducer(topicType.name(), topicType.getData()).start();
    }
}
