package com.sid.spark.kafka;

/**
 * @author yanghaojie
 * @date 2020-06-28 16:19
 * 类解释：
 */
public enum TopicType {
    topic_rhino_weibo_all("消费微博的数据", KafkaMessagePool.VIDEO_USER_TEST_DATA),
    topic_rhino_asyncdata_all_bak001("消费采集的异步任务数据_bak", KafkaMessagePool.shortVideoTest),

    topic_rhino_news_bbs_all_v3_bak001("v3新闻论坛", KafkaMessagePool.NewFouPostPri1),

    topic_rhino_video_all_v1("B站用户数据",KafkaMessagePool.VIDEO_USER_TEST_DATA),
    topic_rhino_weibo_update("微博互动量更新",KafkaMessagePool.WeiboPostInteractionUpdate),
    topic_rhino_asyncdata_all("消费采集的异步任务数据", KafkaMessagePool.WeiboAdvUser),

    banyan_sdk_server_log_test("sdk-api查询接口日志数据",KafkaMessagePool.test003_sdk_begin_log);



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
