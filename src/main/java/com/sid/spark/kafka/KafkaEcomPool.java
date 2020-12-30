package com.sid.spark.kafka;

/**
 * @author yanghaojie
 * @date 2020-12-24 16:25
 * 类解释：
 */
public class KafkaEcomPool {


    public static final String ecomComment ="{\"good_count\":\"254\",\"vendor_code\":\"0070857172\",\"item_type\":\"general\"," +
            "\"promo_price\":\"1555.00\",\"primary_site_name\":\"苏宁\",\"poor_count\":\"0\",\"crawlerIdList\":\"27,253,2987,26\"," +
            "\"review_count\":\"254\",\"vendorCode\":\"0070857172\",\"sku_market_price\":\"1555.00\",\"score\":\"100\",\"_track_count_\":\"true\"," +
            "\"price\":\"1555.00\",\"product_id\":\"11360123099\",\"curPartNumber\":\"000000011360123099\",\"_html_\":\"避免过长，省略...\"," +
            "\"interfaceIdList\":\"[]\",\"item_title\":\" 小米(MI) Redmi 红米note8 pro 全网通 8GB+128GB 冰翡翠 6400万四摄拍照 液冷游戏芯 移动联通电信4G手机 红米note8pro\"," +
            "\"jobName\":\"huawei_china_newsforum_20201224001006_787_80\",\"is_sku\":\"1\",\"_kafka_data_type_\":\"sku_item\"," +
            "\"sku_id\":\"000000000945084107\",\"shop_name\":\"达旭升旗舰店\",\"update_date\":\"20201224162353\",\"crawler\":\"100662\"," +
            "\"sourceCrawlerId\":\"100662\",\"sku_price\":\"1555.00\",\"site_id\":\"7\",\"msgDepth\":\"1\",\"end_date\":\"20201224001003\"," +
            "\"is_sell_out\":\"no\",\"msgType\":\"1\",\"shop\":\"达旭升旗舰店\",\"primary_site_id\":\"7\",\"sku_promo_price\":\"1555.00\"," +
            "\"clusterId\":\"34410056\",\"title\":\" 小米(MI) Redmi 红米note8 pro 全网通 8GB+128GB 冰翡翠 6400万四摄拍照 液冷游戏芯 移动联通电信4G手机 红米note8pro\"," +
            "\"image_url_list\":\"[\\\"https://imgservice.suning.cn/uimg1/b2c/atmosphere/By92xgln_vv2whHclwmK3A.jpg_800w_800h_4e\\\"," +
            "\\\"https://imgservice.suning.cn/uimg1/b2c/image/Bq_hbgdTx61pM3n_zj9gHQ.jpg_800w_800h_4e\\\",\\\"https://imgservice.suning" +
            ".cn/uimg1/b2c/image/Zv4z5BpjrJrcWADQd5DfNQ.jpg_800w_800h_4e\\\",\\\"https://imgservice.suning" +
            ".cn/uimg1/b2c/image/9RIVpqQ5N5p0kk9vNOiFKg.jpg_800w_800h_4e\\\",\\\"https://imgservice.suning" +
            ".cn/uimg1/b2c/image/bHaBDWcw2tvzC-hH4swUJw.jpg_800w_800h_4e\\\",\\\"https://imgservice.suning" +
            ".cn/uimg1/b2c/image/qr242CDAJHCp8HMV1S41Cw.jpg_800w_800h_4e\\\"]\",\"sell_city\":\"0200101\",\"cat_id\":\"1\",\"lang\":\"\"," +
            "\"platform_score\":\"100\",\"start_date\":\"20201223181003\",\"_CT_\":\"1608798233678\",\"full_url\":\"https://product.suning" +
            ".com/0070857172/11360123099.html\",\"item_image_url\":\"https://imgservice.suning.cn/uimg1/b2c/atmosphere/By92xgln_vv2whHclwmK3A" +
            ".jpg_800w_800h_4e\",\"item_id\":\"007085717211360123099\",\"other_data\":\"{\\\"开票单位\\\":\\\"台\\\"," +
            "\\\"后摄像头\\\":\\\"6400+800+200+200万像素\\\",\\\"运营商标识\\\":\\\"无\\\",\\\"传感器类型\\\":\\\"其他\\\",\\\"SIM卡尺寸\\\":\\\"Nano SIM卡\\\"," +
            "\\\"副SIM卡4G网络制式\\\":\\\"联通4G,电信4G,移动4G\\\",\\\"运行内存\\\":\\\"8GB\\\",\\\"前摄光圈大小\\\":\\\"f/2.0光圈\\\",\\\"屏幕尺寸\\\":\\\"6.53英寸\\\"," +
            "\\\"入网许可证号\\\":\\\"02-B324-191424\\\",\\\"GPS\\\":\\\"支持\\\",\\\"GPU\\\":\\\"以官网信息为准\\\",\\\"副SIM卡3G网络制式\\\":\\\"联通3G,移动3G,电信3G\\\"," +
            "\\\"生产者（制造商）名称\\\":\\\"小米通讯技术有限公司\\\",\\\"上市时间\\\":\\\"2019年8月\\\",\\\"系统版本\\\":\\\"MIUI\\\",\\\"电池更换\\\":\\\"不支持\\\"," +
            "\\\"电池类型\\\":\\\"其他\\\",\\\"手机操作系统\\\":\\\"Android\\\",\\\"闪光灯类型\\\":\\\"支持\\\",\\\"无线充电\\\":\\\"不支持\\\",\\\"包装清单\\\":\\\"手机x1、USB " +
            "Type-C数据线x1、电源适配器x1、插针x1、三包凭证x1、入门指南x1、高透软胶保护套x1、安全信息声明x1\\\",\\\"off_line\\\":\\\"true\\\",\\\"蓝牙版本\\\":\\\"蓝牙5.0\\\"," +
            "\\\"品牌\\\":\\\"小米(mi)\\\",\\\"CPU核数\\\":\\\"八核\\\",\\\"双卡机类型\\\":\\\"双卡双待\\\",\\\"上市年份\\\":\\\"2019年\\\",\\\"5G网络制式\\\":\\\"不支持\\\"," +
            "\\\"选购热点\\\":\\\"大屏手机,女性手机,双卡双待,指纹识别,Type-C ,大容量电池,拍照手机,游戏手机,国产手机\\\",\\\"电池容量\\\":\\\"4500mAh\\\",\\\"距离传感器\\\":\\\"支持\\\"," +
            "\\\"快充功能\\\":\\\"支持\\\",\\\"重量\\\":\\\"200克\\\",\\\"最大支持SIM卡数量\\\":\\\"2个\\\",\\\"触摸工艺\\\":\\\"其他\\\",\\\"机身厚度\\\":\\\"8.79毫米\\\"," +
            "\\\"CPU型号\\\":\\\"Helio G90T\\\",\\\"光线传感器\\\":\\\"以官网信息为准\\\",\\\"最大存储扩展\\\":\\\"256GB\\\",\\\"拍照特点\\\":\\\"自动对焦,防抖,美颜,场景模式,连拍," +
            "HDR\\\",\\\"CCC认证编号\\\":\\\"2019011606219192\\\",\\\"摄像头类型\\\":\\\"其他\\\",\\\"颜色\\\":\\\"绿色系\\\",\\\"型号\\\":\\\"Redmi Note8 Pro\\\"," +
            "\\\"指纹识别\\\":\\\"支持\\\",\\\"上市月份\\\":\\\"8月\\\",\\\"屏幕分辨率\\\":\\\"2340*1080\\\",\\\"3G网络制式\\\":\\\"联通3G,电信3G,移动3G\\\"," +
            "\\\"网络频率\\\":\\\"以官网信息为准\\\",\\\"CPU品牌\\\":\\\"联发科（MTK）\\\",\\\"耳机接口\\\":\\\"3.5mm\\\",\\\"数据传输接口\\\":\\\"WIFI,蓝牙\\\"," +
            "\\\"机身材质\\\":\\\"其它\\\",\\\"2G网络制式\\\":\\\"移动2G,电信2G,联通2G\\\",\\\"充电接口类型\\\":\\\"Type-C\\\",\\\"待机模式\\\":\\\"双卡双待\\\"," +
            "\\\"是否支持同时使用联通卡\\\":\\\"以官网信息为准\\\",\\\"屏幕像素密度（ppi）\\\":\\\"以官网信息为准\\\",\\\"存储卡类型\\\":\\\"支持\\\",\\\"整机质保年限\\\":\\\"1年\\\"," +
            "\\\"红外遥控\\\":\\\"支持\\\",\\\"机身内存\\\":\\\"128GB\\\",\\\"副SIM卡尺寸\\\":\\\"Nano SIM卡\\\",\\\"机身长度\\\":\\\"161.35毫米\\\"," +
            "\\\"电子罗盘\\\":\\\"支持\\\",\\\"后摄光圈大小\\\":\\\"f/1.8光圈\\\",\\\"陀螺仪\\\":\\\"支持\\\",\\\"机身宽度\\\":\\\"76.4毫米\\\",\\\"CPU频率\\\":\\\"2" +
            ".0GHz\\\",\\\"前摄像头\\\":\\\"2000万像素\\\",\\\"4G网络制式\\\":\\\"电信4G,全网通,联通4G,移动4G\\\",\\\"NFC（近场通讯）\\\":\\\"以官网信息为准\\\"," +
            "\\\"副SIM卡2G网络制式\\\":\\\"移动2G/联通2G,电信2G\\\"}\",\"comment_url\":\"http://product.suning.com/11360123099.html\",\"time_zone\":\"null\"," +
            "\"sku_url\":\"http://product.suning.com/0070857172/000000000945084107.html\",\"url\":\"https://product.suning" +
            ".com/0070857172/11360123099.html\",\"site\":\"苏宁\",\"sku_title\":\" 红米note8 pro 碎屏险一年套餐，碎屏无忧\",\"taskId\":\"1334515\"}";
}
