package com.sid.spark.kafka;

/**
 * @author yanghaojie
 * @date 2020-06-28 13:49
 * 类解释：
 */
public class KafkaProperties {

    public static final String GROUP_ID = "banyan_data";


    //0.9.0.0版本的kafka
    public static final int KAFKA_VERSION_TYPE_0900 = 0;

    //1.1.0版本的kafka
    public static final int KAFKA_VERSION_TYPE_110 = 0;


    //BANYAN
    public static final String BANYAN_ZK = "devrhino1:2181,devrhino2:2181,devrhino3:2181";
    public static final String BANYAN_KAFKA = "devrhino1:6667,devrhino2:6667,devrhino3:6667";
    //ELK
    public static final String ELK_ZK = "172.18.5.202:12181";
    public static final String ELK_KAFKA = "172.18.5.202:9092";


    public static final String ZK = BANYAN_ZK;
    public static final String BROKER_LIST = BANYAN_KAFKA;


}