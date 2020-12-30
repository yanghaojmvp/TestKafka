package com.sid.spark.kafka;

/**
 * @author yanghaojie
 * @date 2020-06-30 14:16
 * 类解释：
 */
public class KafkaMessagePool {


    public static String babyPostString = "{\"end_date\":\"20280626235959\",\"msgType\":\"1\",\"collection_num\":\"781\",\"primary_site_id\":\"1206301\"," +
            "\"baby_current_age\":\"\",\"primary_site_name\":\"柚宝宝app\",\"crawlerIdList\":\"111219\",\"review_count\":\"0\"," +
            "\"title\":\"预产期4月10日的有人吗\",\"content\":\"谁会看四维单子，麻烦帮我看看男孩女孩[开心]\\u003cimg src\\u003d\\\"https://sc.seeyouyima" +
            ".com/my_wm_4cdb9f7e0add22d26c36ef6edeac4c74_1080_1440.jpg\\\" desc\\u003d\\\"有会看四维单子的吗\\\" /\\u003e\"," +
            "\"image_url_list\":\"[\\\"https://sc.seeyouyima.com/my_wm_4cdb9f7e0add22d26c36ef6edeac4c74_1080_1440.jpg\\\"]\",\"uid\":\"73769048\"," +
            "\"page_id\":\"486133b9ee0ff06c12b01bbc88d6212f\",\"cat_id\":\"2\",\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[]\",\"lang\":\"\"," +
            "\"start_date\":\"20180625000000\",\"jobName\":\"alisen_test_20201218144113_534_73\",\"_CT_\":\"1608273685705\",\"like_count\":\"0\"," +
            "\"unique_id\":\"61261964\",\"full_url\":\"http://circle.seeyouyima" +
            ".com/v2/forum_topic_list?is_first\\u003d1\\u0026order\\u003dreviewed_date_desc\\u0026size\\u003d20\\u0026forum_id\\u003d5828\"," +
            "\"item_id\":\"3ertgtre5dd56c12b01bbc88d6212f\",\"other_data\":\"{\\\"avatar_url\\\":\\\"http://sc.seeyouyima" +
            ".com/forum/data/5d6f3542b5458_400_400.png\\\",\\\"level\\\":\\\"16\\\",\\\"baby_current_age\\\":\\\"\\\"," +
            "\\\"baby_previous_age\\\":\\\"备孕\\\",\\\"follow_num\\\":\\\"0\\\",\\\"fans_num\\\":\\\"0\\\"}\",\"author\":\"姚钱钱\uD83D\uDCB0啊\"," +
            "\"_kafka_data_type_\":\"post\",\"baby_previous_age\":\"备孕\",\"time_zone\":\"null\",\"updte_date\":\"20201218144125\"," +
            "\"url\":\"https://view.seeyouyima.com/circle/detail/61261964?_is_share\\u003d1\\u0026app_id\\u003d2\\u0026v\\u003d5.1" +
            ".9\\u0026platform\\u003dAndroid\\u0026reveal_num\\u003d3\\u0026title\\u003d%E9%A2%84%E4%BA%A7%E6%9C%9F4%E6%9C%8810%E6%97%A5%E7%9A%84" +
            "%E6%9C%89%E4%BA%BA%E5%90%97\",\"site\":\"柚宝宝app\",\"is_main_post\":\"1\",\"crawler\":\"24899\",\"sourceCrawlerId\":\"23990\"," +
            "\"plate_name\":\"20年5月同龄圈\",\"site_id\":\"1206301\",\"publish_date\":\"20201217214321\",\"view_count\":\"8\",\"taskId\":\"2343262\"," +
            "\"msgDepth\":\"2\"}\n";


    public static String babyCommentString = "{\"end_date\":\"20280626235959\",\"msgType\":\"1\",\"collection_num\":\"781\",\"is_best\":\"1\",\"baby_current_age\":\"\"," +
            "\"crawlerIdList\":\"111219\",\"review_count\":\"0\",\"title\":\"两次b超女孩，出生后翻盘男孩。记录我的“意难平”生产\",\"content\":\"求比超不准，翻盘男宝给我，愿我儿女双全\"," +
            "\"uid\":\"204756003\",\"cat_id\":\"2\",\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[]\",\"lang\":\"\"," +
            "\"start_date\":\"20180625000000\",\"jobName\":\"alisen_test_20201217140539_485_73\",\"_CT_\":\"1608185180612\"," +
            "\"like_count\":\"0\",\"unique_id\":\"58763241\",\"full_url\":\"http://circle.seeyouyima" +
            ".com/v2/forum_topic_list?is_first\\u003d1\\u0026order\\u003dreviewed_date_desc\\u0026size\\u003d20\\u0026forum_id\\u003d5828\"," +
            "\"item_id\":\"eb244r6f76695bbf1eb34f0b923170c0\",\"other_data\":\"{\\\"level\\\":\\\"15\\\",\\\"is_best\\\":\\\"0\\\"," +
            "\\\"baby_current_age\\\":\\\"\\\",\\\"plate_name\\\":\\\"20年5月同龄圈\\\",\\\"follow_num\\\":\\\"1\\\",\\\"fans_num\\\":\\\"4\\\"}\"," +
            "\"author\":\"萱萱L8M\",\"_kafka_data_type_\":\"comment\",\"time_zone\":\"null\",\"comment_id\":\"1664096894\"," +
            "\"update_date\":\"20201217140620\",\"url\":\"https://view.seeyouyima" +
            ".com/circle/detail/58763241?_is_share\\u003d1\\u0026app_id\\u003d2\\u0026v\\u003d5.1" +
            ".9\\u0026platform\\u003dAndroid\\u0026reveal_num\\u003d3\\u0026title\\u003d%E4%B8%A4%E6%AC%A1b%E8%B6%85%E5%A5%B3%E5%AD%A9%EF%BC%8C" +
            "%E5%87%BA%E7%94%9F%E5%90%8E%E7%BF%BB%E7%9B%98%E7%94%B7%E5%AD%A9%E3%80%82\",\"site\":\"柚宝宝app\",\"is_main_post\":\"0\"," +
            "\"crawler\":\"24899\",\"sourceCrawlerId\":\"23990\",\"parent_item_id\":\"acab454527468576938223182d510964\"," +
            "\"parent_id\":\"acab454527468576938223182d510964\",\"plate_name\":\"20年5月同龄圈\",\"site_id\":\"1206301\"," +
            "\"publish_date\":\"20200720041730\",\"taskId\":\"2343262\",\"msgDepth\":\"20\"}";


    public static final String newsUser = "{\"end_date\":\"20201201000000\",\"primary_site_id\":\"15861\",\"primary_site_name\":\"妈妈帮\"," +
            "\"user_birthday\":\"1993-07-31\",\"register_date\":\"20201201000000\",\"area\":\"广州\",\"verified_agency\":\"\",\"msgType\":\"1\"," +
            "\"gender\":\"m\",\"user_name\":\"王者荣耀凡凡国服鲁班\",\"crawlerIdList\":\"24316,24317,24318,24319\",\"description\":\"小帅哥国服小短腿\"," +
            "\"user_gender\":\"1\",\"follow_num\":\"0\",\"publish_count\":\"106\",\"uid\":\"234543234567\",\"toutiao_followers_count\":\"4794\"," +
            "\"xigua_followers_count\":\"15861\",\"cat_id\":\"3\",\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[\\\"35\\\"]\"," +
            "\"keyword\":\"小帅哥-\",\"lang\":\"\",\"verified_content\":\"\",\"verified_desc\":\"\",\"start_date\":\"20190101000000\"," +
            "\"jobName\":\"chenni_test_qa_20200901141800_403_24\",\"verify_type\":\"\",\"_CT_\":\"1598941113602\",\"like_count\":\"223991\"," +
            "\"item_id\":\"3456yuhgfe5dfg567833334765fdd\",\"_kafka_data_type_\":\"user\",\"time_zone\":\"null\",\"followings_count\":\"0\"," +
            "\"fans_num\":\"1407822\",\"is_verified\":\"0\",\"other_data\":\"{\\\"pregnancy\\\":\\\"孕8周+0天\\\"," +
            "\\\"birthday\\\":\\\"1993-07-31\\\",\\\"baby_current_age\\\":\\\"4岁8个月\\\",\\\"hospital\\\":\\\"中山大学附属第一医院\\\"," +
            "\\\"baby_gender\\\":\\\"女\\\"}\",\"update_date\":\"20200901141833\",\"url\":\"https://www.toutiao.com/c/user/52797658916/\"," +
            "\"douyin_followers_count\":\"1372385\",\"site\":\"今日头条APP（同步线上ID）\",\"crawler\":\"1116573\",\"avatar_url\":\"http://p26-tt.byteimg" +
            ".com/img/mosaic-legacy/ffd80000ff46d0d822f4~202x450.jpeg\",\"sourceCrawlerId\":\"24315\",\"digg_count\":\"223991\"," +
            "\"user_id\":\"52797658916\",\"share_url\":\"https://profile.zjurl" +
            ".cn/rogue/ugc/profile/?version_code\\u003d110501\\u0026version_name\\u003d0\\u0026user_id\\u003d52797658916\\u0026media_id" +
            "\\u003d1622498968252424\\u0026request_source\\u003d1\\u0026active_tab\\u003ddongtai\\u0026device_id\\u003d65\\u0026app_name" +
            "\\u003dnews_article\",\"followers_count\":\"1407822\",\"name\":\"小帅哥\",\"site_id\":\"1001569\",\"post_count\":\"106\"," +
            "\"taskId\":\"1202722\",\"msgDepth\":\"3\",\"questionCount\":\"12\",\"articlesCount\":\"23\",\"zvideoCount\":\"45\"," +
            "\"favoriteCount\":\"122\",\"headline\":\"博士在读。前航天机构结构工程师。兴趣爱好庞杂。\",\"industry\":\"航天机构\",\"educations\":\"[\\\"中国人民大学--汉语言文学\\\"," +
            "\\\"中国人民大学--资源与环境经济学\\\",\\\"北京师范大学--人口资源及环境经济学\\\"]\",\"author_desc\":\"不会撩小姐姐的小帅哥,今晚有空耶，搞基吗，很刺鸡那种\",\"pregnancy-\":\"孕8周+0天\"," +
            "\"birthday\":\"2015-07-31\",\"baby_current_age-\":\"孕14周4天\",\"hospital\":\"中山大学附属第一医院\",\"baby_gender\":\"女\"}";


    public static final String newsUser2 = "{\"end_date\":\"20280626235959\",\"msgType\":\"1\",\"primary_site_id\":\"1231919\",\"city\":\"成都\"," +
            "\"baby_current_age\":\"孕19周2天\",\"primary_site_name\":\"妈妈社区app\",\"follow_num\":\"1\",\"TOP_PAGE\":\"7\",\"title\":\"体重和末次月经\"," +
            "\"content\":\"我们差一天\",\"uid\":\"21005456\",\"page_id\":\"c03edd93a47fedd8f48d746548d97b12\",\"province\":\"四川\",\"cat_id\":\"2\"," +
            "\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[]\",\"keyword\":\"月经\",\"lang\":\"\",\"start_date\":\"20180625000000\"," +
            "\"jobName\":\"alisen_test_20201218201208_172_56\",\"_CT_\":\"1608293657289\",\"item_id\":\"8234544485728d837d444b5e856e\"," +
            "\"other_data\":\"{\\\"city\\\":\\\"成都\\\",\\\"plate_name\\\":\\\"十月怀胎\\\",\\\"baby_previous_age\\\":\\\"孕6周1天\\\"}\"," +
            "\"author\":\"琳尔~\",\"_kafka_data_type_\":\"user\",\"pregnancy\":\"孕19周2天\",\"time_zone\":\"null\",\"fans_num\":\"2\"," +
            "\"update_date\":\"20201218201417\",\"url\":\"http://www.qubaobei.com/ios/api/adr_view" +
            ".php?id\\u003d23618844\\u0026limit\\u003d20\\u0026order\\u003d1\\u0026version\\u003d890\",\"site\":\"妈妈社区app\",\"is_main_post\":\"0\"," +
            "\"crawler\":\"100769\",\"sourceCrawlerId\":\"111222\",\"parent_item_id\":\"3e126c8a022c1a619687159085a5406e\"," +
            "\"parent_id\":\"3e126c8a022c1a619687159085a5406e\",\"site_id\":\"1231919\",\"active_day\":\"4\",\"post_count\":\"3\"," +
            "\"publish_date\":\"20200917084149\",\"taskId\":\"2343262\",\"msgDepth\":\"9\"}";


    public static final String newsUser3 = "{\"msgType\":\"1\",\"primary_site_id\":\"137892\",\"baby_current_agex\":\"孕22周6天\",\"primary_site_name\":\"宝宝树论坛\"," +
            "\"crawlerIdList\":\"23784,111231\",\"uid\":\"21471400167\",\"cat_id\":\"2\",\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[]\"," +
            "\"lang\":\"\",\"hospital\":\"\",\"fix_publish_date\":\"1\",\"jobName\":\"increment_job_20201222161934_215_24\"," +
            "\"_CT_\":\"1608625569394\",\"full_url\":\"http://www.babytree.com/community/club20214/?orderby\\u003dcreate_ts\",\"level\":\"普通\"," +
            "\"item_id\":\"cddd236der333f34333d3ca29104x2\",\"author\":\"机敏的小团子7RBB\",\"pregnancy\":\"正在孕期\",\"_kafka_data_type_\":\"user\"," +
            "\"time_zone\":\"PRC\",\"update_date\":\"20201222162609\",\"site\":\"宝宝树论坛\",\"sourceCrawlerId\":\"193\",\"site_id\":\"137892\"," +
            "\"publish_date\":\"20201222162609\",\"taskId\":\"2359922\",\"msgDepth\":\"2\"}";

}
