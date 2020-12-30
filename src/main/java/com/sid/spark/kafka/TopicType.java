package com.sid.spark.kafka;

/**
 * @author yanghaojie
 * @date 2020-06-28 16:19
 * 类解释：
 */
public enum TopicType {
    topic_rhino_weibo_all_v3("消费微博的数据", KafkaMessagePool.babyPostString),

    //topic_rhino_weibo_all_bak001
    //topic_rhino_asyncdata_all_bak001;
    topic_rhino_asyncdata_all_bak002("消费采集的异步任务数据_bak", KafkaMessagePool.newsUser),
    topic_rhino_news_bbs_all_v3("消费采集的异步任务数据_bak", KafkaMessagePool.newsUser3),


    topic_rhino_car_all_v2("B站用户数据",KafkaMessagePool.newsUser),
    topic_rhino_weibo_update("微博互动量更新",KafkaMessagePool.babyPostString),

    banyan_sdk_server_log_test("sdk-api查询接口日志数据",KafkaMessagePool.babyPostString);



///usr/hdp/current/kafka-broker/bin/kafka-run-class.sh kafka.tools.ConsumerOffsetChecker --topic  topic_rhino_news_bbs_all_v3_bak001 --zookeeper devrhino1:2181,devrhino2:2181,devrhino3:2181
    private String name;
    private String data;


    public String getName() {
        return name;
    }

    public String getData() {
        return data;
    }

    TopicType(String name, String data) {
        this.name = name;
        this.data = data;
    }
}
