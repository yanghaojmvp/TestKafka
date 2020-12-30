package com.sid.spark.kafka;

/**
 * @author yanghaojie
 * @date 2020-06-30 14:16
 * 类解释：
 */
public class KafkaMessagePool2 {


    public static final String test001_sdk_begin_log = "2020-05-09_19:21:31 [http-nio-28956-exec-6] INFO util.LogUtil:76: NormalLog " +
            "group=banyan<!>type=sdk_begin<!>sdkVersion=0.0.6.14-SNAPSHOT<!>indexAlias=WEIBO_CONTENT<!>interfaceType=search<!>appkey=ban" +
            "<!>searchType=ScrollType<!>isShowDetailUser=false<!>isShowFriends=false<!>query={  \"query\" : {    \"bool\" : {      \"filter\" : [  " +
            "      {          \"range\" : {            \"publish_time\" : {              \"from\" : 1582992000,              \"to\" : 1583424000,  " +
            "            \"include_lower\" : true,              \"include_upper\" : true,              \"boost\" : 1.0            }          }     " +
            "   }      ],      \"disable_coord\" : false,      \"adjust_pure_negative\" : true,      \"boost\" : 1.0    }  " +
            "}}<!>logId=a8e8dcb298e52aa9b8c9a8e4abc3dbb0\n" +
            "2020-05-09_20:20:40 [http-nio-28956-exec-6] INFO util.LogUtil:265: NormalLog group=banyan<!>type=sdk_normal_error<!>query={  \"query\"" +
            " : {    \"bool\" : {      \"filter\" : [        {          \"range\" : {            \"publish_time\" : {              \"from\" : " +
            "1582992000,              \"to\" : 1583424000,              \"include_lower\" : true,              \"include_upper\" : true,           " +
            "   \"boost\" : 1.0            }          }        }      ],      \"disable_coord\" : false,      \"adjust_pure_negative\" : true,     " +
            " \"boost\" : 1.0    }  }}<!>realTotal=500<!>total=52496879<!>isEnd=false<!>scrollId" +
            "=DnF1ZXJ5VGhlbkZldGNoFAAAAAACMAccFkotdEx2MVJnVGh5LXVwT0FXRnE0SlEAAAAAAavVmhZYZmFoeDllM1JOaVlqRnhyc0xmbzR3AAAAAAJhPJwWZDlWWV9paDFUTDIxdnVFOTlrTUNCUQAAAAACSr-VFm1oQlEzaGRnVEVTZHo0c01QaE1rUlEAAAAAAoXo7hY2LXQ3MjRHelJLcXRlVXhaZ25PTDBnAAAAAAKIhD8WekxMdlFNLVZUaG1nOTNXc19xT1ItQQAAAAAB1BNUFkVodll6WTlkVHFHLTBmOHA4SUs1eVEAAAAAAZEsohZxNkdwRnNuQ1NPT2ZMb0xsNzJNVkFnAAAAAAF1I3sWaWI2enBMOTRSS20ydDE4SmZvTlZlQQAAAAACpOe8Fk00MXNtdERRUjVXZS1OcUF1ajFLZWcAAAAAAkLgRRY0SDd0ZWhDV1FGbUcxRVMzQVJUdEFRAAAAAAHMRV8WZDdITHdyNWRRUU85MVBsSHItYnU5ZwAAAAACKpIfFk4wQXNUNE5NUTRtOTJwdm94Y2Z0WlEAAAAAAf53gRZ5cjU5eV9OaVFzR3BJVTZuWF9OYUFBAAAAAAGzOZ8WNVp3SF9xLVFUeW1RV1UtNnFfVFhfZwAAAAABoEcNFmZ1dExQQTRQUlc2Ulloa0QwQWtFX2cAAAAAAZ_HGhY3bXJhMFJlNVFieU0xNkZZb0xVWlB3AAAAAAGg-OYWUGM2Q2tRd25UeUtvM0pmSlpEVVRpZwAAAAAB8XOgFkp1OHZKOEFmUUxXNlJnMDBxbmV4RHcAAAAAAkMogRY5dkFoWDhKU1M4eVljWWRoS0hhazJR<!>routeTime=0.000<!>esTime=0.155<!>hbaseTime=3549.165<!>totalTime=3549.320<!>errMsg=com.datatub.banyan.exception.hbase.HBaseException: {\"message\":\"Failed 111 actions: IOException: 111 times, \"}<!>code=1<!>sdkVersion=0.0.6.14-SNAPSHOT<!>indexAlias=WEIBO_CONTENT<!>interfaceType=search<!>appkey=ban<!>searchType=ScrollType<!>isShowDetailUser=false<!>isShowFriends=false<!>logId=a8e8dcb298e52aa9b8c9a8e4abc3dbb0\n";


    public static final String test001_sdk_normal_error_log = "2020-05-09_20:20:40 [http-nio-28956-exec-6] INFO util.LogUtil:265: NormalLog " +
            "group=banyan<!>type=sdk_normal_error<!>query={  \"query\" : {    \"bool\" : {      \"filter\" : [        {          \"range\" : {     " +
            "       \"publish_time\" : {              \"from\" : 1582992000,              \"to\" : 1583424000,              \"include_lower\" : " +
            "true,              \"include_upper\" : true,              \"boost\" : 1.0            }          }        }      ],      " +
            "\"disable_coord\" : false,      \"adjust_pure_negative\" : true,      \"boost\" : 1.0    }  " +
            "}}<!>realTotal=500<!>total=52496879<!>isEnd=false<!>scrollId" +
            "=DnF1ZXJ5VGhlbkZldGNoFAAAAAACMAccFkotdEx2MVJnVGh5LXVwT0FXRnE0SlEAAAAAAavVmhZYZmFoeDllM1JOaVlqRnhyc0xmbzR3AAAAAAJhPJwWZDlWWV9paDFUTDIxdnVFOTlrTUNCUQAAAAACSr-VFm1oQlEzaGRnVEVTZHo0c01QaE1rUlEAAAAAAoXo7hY2LXQ3MjRHelJLcXRlVXhaZ25PTDBnAAAAAAKIhD8WekxMdlFNLVZUaG1nOTNXc19xT1ItQQAAAAAB1BNUFkVodll6WTlkVHFHLTBmOHA4SUs1eVEAAAAAAZEsohZxNkdwRnNuQ1NPT2ZMb0xsNzJNVkFnAAAAAAF1I3sWaWI2enBMOTRSS20ydDE4SmZvTlZlQQAAAAACpOe8Fk00MXNtdERRUjVXZS1OcUF1ajFLZWcAAAAAAkLgRRY0SDd0ZWhDV1FGbUcxRVMzQVJUdEFRAAAAAAHMRV8WZDdITHdyNWRRUU85MVBsSHItYnU5ZwAAAAACKpIfFk4wQXNUNE5NUTRtOTJwdm94Y2Z0WlEAAAAAAf53gRZ5cjU5eV9OaVFzR3BJVTZuWF9OYUFBAAAAAAGzOZ8WNVp3SF9xLVFUeW1RV1UtNnFfVFhfZwAAAAABoEcNFmZ1dExQQTRQUlc2Ulloa0QwQWtFX2cAAAAAAZ_HGhY3bXJhMFJlNVFieU0xNkZZb0xVWlB3AAAAAAGg-OYWUGM2Q2tRd25UeUtvM0pmSlpEVVRpZwAAAAAB8XOgFkp1OHZKOEFmUUxXNlJnMDBxbmV4RHcAAAAAAkMogRY5dkFoWDhKU1M4eVljWWRoS0hhazJR<!>routeTime=0.000<!>esTime=0.155<!>hbaseTime=3549.165<!>totalTime=3549.320<!>errMsg=com.datatub.banyan.exception.hbase.HBaseException: {\"message\":\"Failed 111 actions: IOException: 111 times, \"}<!>code=1<!>sdkVersion=0.0.6.14-SNAPSHOT<!>indexAlias=WEIBO_CONTENT<!>interfaceType=search<!>appkey=ban<!>searchType=ScrollType<!>isShowDetailUser=false<!>isShowFriends=false<!>logId=a8e8dcb298e52aa9b8c9a8e4abc3dbb0";


    public static final String test002_sdk_begin_log = "2020-06-28_21:01:01 [http-nio-28956-exec-6] INFO util.LogUtil:76: NormalLog " +
            "group=banyan<!>type=sdk_begin<!>sdkVersion=0.0.8.0<!>indexAlias=WEIBO_CONTENT<!>interfaceType=combinaSearch<!>appkey=yili<!>searchType" +
            "=ScrollType<!>isShowDetailUser=true<!>isShowFriends=false<!>query={  \"query\" : {    \"bool\" : {      \"must\" : [        {         " +
            " \"bool\" : {            \"filter\" : [              {                \"bool\" : {                  \"should\" : [                    " +
            "{                      \"bool\" : {                        \"filter\" : [                          {                            " +
            "\"match_phrase\" : {                              \"content\" : {                                \"query\" : \"紫苏籽\",                 " +
            "               \"slop\" : 0,                                \"boost\" : 1.0                              }                            " +
            "}                          }                        ],                        \"disable_coord\" : false,                        " +
            "\"adjust_pure_negative\" : true,                        \"boost\" : 1.0                      }                    }                  " +
            "],                  \"disable_coord\" : false,                  \"adjust_pure_negative\" : true,                  " +
            "\"minimum_should_match\" : \"1\",                  \"boost\" : 1.0                }              },              {                " +
            "\"range\" : {                  \"publish_time\" : {                    \"from\" : 1593187200,                    \"to\" : 1593273600, " +
            "                   \"include_lower\" : true,                    \"include_upper\" : true,                    \"boost\" : 1.0          " +
            "        }                }              }            ],            \"must_not\" : [              {                \"bool\" : {        " +
            "          \"should\" : [                    {                      \"bool\" : {                        \"filter\" : [                 " +
            "         {                            \"match_phrase\" : {                              \"content\" : {                               " +
            " \"query\" : \"紫苏子长县\",                                \"slop\" : 0,                                \"boost\" : 1.0                   " +
            "           }                            }                          }                        ],                        " +
            "\"disable_coord\" : false,                        \"adjust_pure_negative\" : true,                        \"boost\" : 1.0             " +
            "         }                    }                  ],                  \"disable_coord\" : false,                  " +
            "\"adjust_pure_negative\" : true,                  \"minimum_should_match\" : \"1\",                  \"boost\" : 1.0                } " +
            "             }            ],            \"disable_coord\" : false,            \"adjust_pure_negative\" : true,            \"boost\" : " +
            "1.0          }        }      ],      \"disable_coord\" : false,      \"adjust_pure_negative\" : true,      \"boost\" : 1.0    }  " +
            "}}<!>logId=8f24bc09948338ef884982f367990d7a";

    public static final String test002_sdk_normal_log = "2020-06-28_21:01:01 [http-nio-28956-exec-2] INFO util.LogUtil:203: NormalLog " +
            "group=banyan<!>type=sdk_normal<!>query={  \"query\" : {    \"bool\" : {      \"must\" : [        {          \"bool\" : {            " +
            "\"filter\" : [              {                \"bool\" : {                  \"should\" : [                    {                      " +
            "\"bool\" : {                        \"filter\" : [                          {                            \"match_phrase\" : {         " +
            "                     \"content\" : {                                \"query\" : \"凤祥食品\",                                \"slop\" : 0," +
            "                                \"boost\" : 1.0                              }                            }                          }" +
            "                        ],                        \"disable_coord\" : false,                        \"adjust_pure_negative\" : true,  " +
            "                      \"boost\" : 1.0                      }                    }                  ],                  " +
            "\"disable_coord\" : false,                  \"adjust_pure_negative\" : true,                  \"minimum_should_match\" : \"1\",       " +
            "           \"boost\" : 1.0                }              },              {                \"range\" : {                  " +
            "\"publish_time\" : {                    \"from\" : 1593187200,                    \"to\" : 1593273600,                    " +
            "\"include_lower\" : true,                    \"include_upper\" : true,                    \"boost\" : 1.0                  }          " +
            "      }              }            ],            \"must_not\" : [              {                \"bool\" : {                  " +
            "\"should\" : [                    {                      \"bool\" : {                        \"filter\" : [                          {" +
            "                            \"match_phrase\" : {                              \"content\" : {                                \"query\"" +
            " : \"临沂凤祥\",                                \"slop\" : 0,                                \"boost\" : 1.0                              " +
            "}                            }                          }                        ],                        \"disable_coord\" : false, " +
            "                       \"adjust_pure_negative\" : true,                        \"boost\" : 1.0                      }                 " +
            "   }                  ],                  \"disable_coord\" : false,                  \"adjust_pure_negative\" : true,                " +
            "  \"minimum_should_match\" : \"1\",                  \"boost\" : 1.0                }              }            ],            " +
            "\"disable_coord\" : false,            \"adjust_pure_negative\" : true,            \"boost\" : 1.0          }        }      ],      " +
            "\"disable_coord\" : false,      \"adjust_pure_negative\" : true,      \"boost\" : 1.0    }  " +
            "}}<!>realTotal=7<!>total=7<!>isEnd=false<!>scrollId" +
            "=DnF1ZXJ5VGhlbkZldGNoFAAAAAABzQwjFjl2QWhYOEpTUzh5WWNZZGhLSGFrMlEAAAAAAcpujRZtYS03TXlyc1FXdVdTV2dCSm1nWWF3AAAAAAGpEhEWOEZ0d19WVHNRRE9oZW56N0xSelY0QQAAAAABt9d0FnhXZWk1alZPUjdXYkdidEJZcTIzT3cAAAAAAaobjhZPSHg4UXA0UFJtdXowdUYtS3ZaTnBRAAAAAAHQwJUWY0I1WFlpLWVTajZOTVRDZl9fZHB1dwAAAAAAFBeQFnVEUjZXZjJLUkVxclVGaUNERkxkY2cAAAAAAd3__BZ5cjU5eV9OaVFzR3BJVTZuWF9OYUFBAAAAAADfHUgWUENEcktmTGRRMUdZZlJxc0VsNEQ1ZwAAAAABzJBeFklKT1pQUzBLUnRhZGNrX0oxLVhobEEAAAAAAemlzhZmcHVsX3pIalM4R0lMaVlyVlhpeWNnAAAAAAEJ7K8WaWI2enBMOTRSS20ydDE4SmZvTlZlQQAAAAAB1WYKFndndVhhY0xzUV9PaGwycVVMVzkxQmcAAAAAAfa5XhZNNDFzbXREUVI1V2UtTnFBdWoxS2VnAAAAAAAAD-QWTDlkNmsybmVUdUNGQWd0VkhvV210ZwAAAAAB9PgtFkotVHVBZWNPUjlXNWVzbFBuX09vb2cAAAAAAM-UChZYaHRMZEVkYlM2V1JISXlCcExyd3dBAAAAAAH1sWYWSk9INzQ2U0JUQnVIa1pXUWxqUk1KZwAAAAAB5r9uFmF1ekxoNmZOU3dha3JWd3VFZHRWVlEAAAAAAQBlghZUODlILU0taVFWMnFsTThvNThleHZB<!>routeTime=0.585<!>esTime=0.311<!>hbaseTime=8.831<!>totalTime=9.727<!>code=0<!>sdkVersion=0.0.8.0<!>indexAlias=WEIBO_CONTENT<!>interfaceType=combinaSearch<!>appkey=yili<!>searchType=ScrollType<!>isShowDetailUser=true<!>isShowFriends=false<!>logId=8f24bc09948338ef884982f367990d7a";


    public static final String test003_sdk_begin_log = "2020-06-28_21:01:01 [http-nio-28956-exec-6] INFO util.LogUtil:76: NormalLog " +
            "group=banyan<!>type=sdk_begin<!>sdkVersion=0.0.8.0<!>indexAlias=WEIBO_CONTENT<!>interfaceType=combinaSearch<!>appkey=yili<!>searchType" +
            "=ScrollType<!>isShowDetailUser=true<!>isShowFriends=false<!>query={  \"query\" : {    \"bool\" : {      \"must\" : [        {         " +
            " \"bool\" : {            \"filter\" : [              {                \"bool\" : {                  \"should\" : [                    " +
            "{                      \"bool\" : {                        \"filter\" : [                          {                            " +
            "\"match_phrase\" : {                              \"content\" : {                                \"query\" : \"紫苏籽\",                 " +
            "               \"slop\" : 0,                                \"boost\" : 1.0                              }                            " +
            "}                          }                        ],                        \"disable_coord\" : false,                        " +
            "\"adjust_pure_negative\" : true,                        \"boost\" : 1.0                      }                    }                  " +
            "],                  \"disable_coord\" : false,                  \"adjust_pure_negative\" : true,                  " +
            "\"minimum_should_match\" : \"1\",                  \"boost\" : 1.0                }              },              {                " +
            "\"range\" : {                  \"publish_time\" : {                    \"from\" : 1593187200,                    \"to\" : 1593273600, " +
            "                   \"include_lower\" : true,                    \"include_upper\" : true,                    \"boost\" : 1.0          " +
            "        }                }              }            ],            \"must_not\" : [              {                \"bool\" : {        " +
            "          \"should\" : [                    {                      \"bool\" : {                        \"filter\" : [                 " +
            "         {                            \"match_phrase\" : {                              \"content\" : {                               " +
            " \"query\" : \"紫苏子长县\",                                \"slop\" : 0,                                \"boost\" : 1.0                   " +
            "           }                            }                          }                        ],                        " +
            "\"disable_coord\" : false,                        \"adjust_pure_negative\" : true,                        \"boost\" : 1.0             " +
            "         }                    }                  ],                  \"disable_coord\" : false,                  " +
            "\"adjust_pure_negative\" : true,                  \"minimum_should_match\" : \"1\",                  \"boost\" : 1.0                } " +
            "             }            ],            \"disable_coord\" : false,            \"adjust_pure_negative\" : true,            \"boost\" : " +
            "1.0          }        }      ],      \"disable_coord\" : false,      \"adjust_pure_negative\" : true,      \"boost\" : 1.0    }  " +
            "}}<!>logId=8f24bc09948338ef884982f367990d7a";

    public static final String test003_sdk_normal_log = "2020-06-28_21:10:01 [http-nio-28956-exec-2] INFO util.LogUtil:203: NormalLog " +
            "group=banyan<!>type=sdk_normal<!>query={  \"query\" : {    \"bool\" : {      \"must\" : [        {          \"bool\" : {            " +
            "\"filter\" : [              {                \"bool\" : {                  \"should\" : [                    {                      " +
            "\"bool\" : {                        \"filter\" : [                          {                            \"match_phrase\" : {         " +
            "                     \"content\" : {                                \"query\" : \"凤祥食品\",                                \"slop\" : 0," +
            "                                \"boost\" : 1.0                              }                            }                          }" +
            "                        ],                        \"disable_coord\" : false,                        \"adjust_pure_negative\" : true,  " +
            "                      \"boost\" : 1.0                      }                    }                  ],                  " +
            "\"disable_coord\" : false,                  \"adjust_pure_negative\" : true,                  \"minimum_should_match\" : \"1\",       " +
            "           \"boost\" : 1.0                }              },              {                \"range\" : {                  " +
            "\"publish_time\" : {                    \"from\" : 1593187200,                    \"to\" : 1593273600,                    " +
            "\"include_lower\" : true,                    \"include_upper\" : true,                    \"boost\" : 1.0                  }          " +
            "      }              }            ],            \"must_not\" : [              {                \"bool\" : {                  " +
            "\"should\" : [                    {                      \"bool\" : {                        \"filter\" : [                          {" +
            "                            \"match_phrase\" : {                              \"content\" : {                                \"query\"" +
            " : \"临沂凤祥\",                                \"slop\" : 0,                                \"boost\" : 1.0                              " +
            "}                            }                          }                        ],                        \"disable_coord\" : false, " +
            "                       \"adjust_pure_negative\" : true,                        \"boost\" : 1.0                      }                 " +
            "   }                  ],                  \"disable_coord\" : false,                  \"adjust_pure_negative\" : true,                " +
            "  \"minimum_should_match\" : \"1\",                  \"boost\" : 1.0                }              }            ],            " +
            "\"disable_coord\" : false,            \"adjust_pure_negative\" : true,            \"boost\" : 1.0          }        }      ],      " +
            "\"disable_coord\" : false,      \"adjust_pure_negative\" : true,      \"boost\" : 1.0    }  " +
            "}}<!>realTotal=7<!>total=7<!>isEnd=false<!>scrollId" +
            "=DnF1ZXJ5VGhlbkZldGNoFAAAAAABzQwjFjl2QWhYOEpTUzh5WWNZZGhLSGFrMlEAAAAAAcpujRZtYS03TXlyc1FXdVdTV2dCSm1nWWF3AAAAAAGpEhEWOEZ0d19WVHNRRE9oZW56N0xSelY0QQAAAAABt9d0FnhXZWk1alZPUjdXYkdidEJZcTIzT3cAAAAAAaobjhZPSHg4UXA0UFJtdXowdUYtS3ZaTnBRAAAAAAHQwJUWY0I1WFlpLWVTajZOTVRDZl9fZHB1dwAAAAAAFBeQFnVEUjZXZjJLUkVxclVGaUNERkxkY2cAAAAAAd3__BZ5cjU5eV9OaVFzR3BJVTZuWF9OYUFBAAAAAADfHUgWUENEcktmTGRRMUdZZlJxc0VsNEQ1ZwAAAAABzJBeFklKT1pQUzBLUnRhZGNrX0oxLVhobEEAAAAAAemlzhZmcHVsX3pIalM4R0lMaVlyVlhpeWNnAAAAAAEJ7K8WaWI2enBMOTRSS20ydDE4SmZvTlZlQQAAAAAB1WYKFndndVhhY0xzUV9PaGwycVVMVzkxQmcAAAAAAfa5XhZNNDFzbXREUVI1V2UtTnFBdWoxS2VnAAAAAAAAD-QWTDlkNmsybmVUdUNGQWd0VkhvV210ZwAAAAAB9PgtFkotVHVBZWNPUjlXNWVzbFBuX09vb2cAAAAAAM-UChZYaHRMZEVkYlM2V1JISXlCcExyd3dBAAAAAAH1sWYWSk9INzQ2U0JUQnVIa1pXUWxqUk1KZwAAAAAB5r9uFmF1ekxoNmZOU3dha3JWd3VFZHRWVlEAAAAAAQBlghZUODlILU0taVFWMnFsTThvNThleHZB<!>routeTime=0.585<!>esTime=0.311<!>hbaseTime=8.831<!>totalTime=9.727<!>code=0<!>sdkVersion=0.0.8.0<!>indexAlias=WEIBO_CONTENT<!>interfaceType=combinaSearch<!>appkey=yili<!>searchType=ScrollType<!>isShowDetailUser=true<!>isShowFriends=false<!>logId=8f24bc09948338ef884982f367990d7a";



    public static final String WeiboPostInteractionUpdate = "{\"jobName\":\"storage_test_20201110150716_348_59\",\"end_date\":\"20191219000000\"," +
            "\"msgType\":\"1\",\"_CT_\":\"1604992044514\",\"item_id\":\"2324565433377749\",\"_kafka_data_type_\":\"interaction_update\"," +
            "\"mid\":\"2324565433377749\",\"time_zone\":\"null\",\"update_date\":\"20201110150724\",\"site\":\"新浪微博\",\"crawler\":\"100667\"," +
            "\"sourceCrawlerId\":\"100667\",\"mids\":\"2324565433377749\",\"cat_id\":\"9\",\"site_id\":\"101993\"," +
            "\"json\":\"{\\\"id\\\":\\\"2324565433377749\\\",\\\"idstr\\\":2324565433377749,\\\"repostsCount\\\":2347,\\\"commentsCount\\\":78691," +
            "\\\"attitudesCount\\\":1171}\",\"_html_\":\"避免过长，省略...\",\"CONTROL_AMOUNT\":\"1\",\"interfaceIdList\":\"[]\",\"lang\":\"\"," +
            "\"taskId\":\"2343033\",\"msgDepth\":\"1\",\"start_date\":\"20101211000000\"}\n";


    public static final String WeiboCommentZpz = "{\"jobName\":\"storage_test_20200909150131_492_24\",\"end_date\":\"20200820000000\"," +
            "\"msgType\":\"1\",\"_CT_\":\"1599634896858\",\"_kafka_data_type_\":\"comment\",\"mid\":\"4506597218976778\",\"time_zone\":\"null\"," +
            "\"update_date\":\"20200909150136\",\"uid\":\"5620597491\",\"site\":\"新浪微博\",\"crawler\":\"111275\",\"sourceCrawlerId\":\"111275\"," +
            "\"parent_id\":\"4506597051632966\",\"is_comment\":\"1\",\"cat_id\":\"9\",\"site_id\":\"101993\",\"json\":\"{\\\"createdAt\\\":\\\"May " +
            "20, " +
            "2020 9:59:28 AM\\\",\\\"id\\\":4506597218976778,\\\"mid\\\":\\\"4506597218976778\\\",\\\"idstr\\\":\\\"4506597218976778\\\"," +
            "\\\"text\\\":\\\"昨天还有送一吨洋葱的。\\\",\\\"source\\\":\\\"\\\\u003ca href\\\\u003d\\\\\\\"https://vipclub.weibo" +
            ".com/zt/commenttail?vuid\\\\u003d2739134804\\\\\\\" rel\\\\u003d\\\\\\\"nofollow\\\\\\\"\\\\u003eV+会员\\\\u003c/a\\\\u003e\\\"," +
            "\\\"status\\\":{\\\"user\\\":{\\\"id\\\":\\\"2739134804\\\",\\\"screenName\\\":\\\"\\\",\\\"name\\\":\\\"陈曦骏\\\",\\\"province\\\":31," +
            "\\\"city\\\":1000,\\\"location\\\":\\\"上海\\\",\\\"description\\\":\\\"中国诗词大会七夕专场冠军 上海诗词学会会员 一站到底名人堂\\\",\\\"url\\\":\\\"\\\"," +
            "\\\"profileImageUrl\\\":\\\"\\\",\\\"userDomain\\\":\\\"\\\",\\\"gender\\\":\\\"m\\\",\\\"followersCount\\\":0," +
            "\\\"friendsCount\\\":0,\\\"statusesCount\\\":0,\\\"favouritesCount\\\":0,\\\"following\\\":false,\\\"verified\\\":true," +
            "\\\"verifiedType\\\":0,\\\"allowAllActMsg\\\":false,\\\"allowAllComment\\\":false,\\\"followMe\\\":false," +
            "\\\"avatarLarge\\\":\\\"\\\",\\\"onlineStatus\\\":0,\\\"biFollowersCount\\\":0,\\\"lang\\\":\\\"zh-cn\\\"," +
            "\\\"verifiedReason\\\":\\\"\\\",\\\"weihao\\\":\\\"\\\",\\\"statusId\\\":\\\"\\\",\\\"verifiedTypeExt\\\":0}," +
            "\\\"id\\\":\\\"4506597051632966\\\",\\\"mid\\\":\\\"4506597051632966\\\",\\\"idstr\\\":4506597051632966," +
            "\\\"text\\\":\\\"【诗说#520# 礼物】520送502:如胶似漆\\\\n   " +
            "为什么在520会提到送502" +
            "呢，这可能是个段子，但这个段子在诗中却颇有来历。在东汉五言诗《古诗十九首》“客从远方来”中有句：“著以长相思，缘以结不解。以胶投漆中，谁能别离此。”意思是想要如合欢被子一样永远的相思，让我们姻缘不会散去。不如你和我互为胶漆，彼此相融，固结让我们永远在一起。这就是成语如胶似漆的出处之一。\\\\n  #国学新青年# 们还不快去用502去表白虽然#古代情诗都是骗人的# 能帮你到这里了。@微博国学 @微博节日\\\",\\\"source\\\":{\\\"url\\\":\\\"name\\\",\\\"relationShip\\\":\\\"iPhone 11 Pro(暗夜绿)\\\",\\\"name\\\":\\\",\\\\\\\"relationShip\\\\\\\":\\\\\\\"nofollow\\\\\\\",\\\\\\\"url\\\\\\\":\\\\\\\"https://new.vip.weibo.cn/tail/introduction\\\\\\\"}\\\"},\\\"favorited\\\":false,\\\"truncated\\\":false,\\\"inReplyToStatusId\\\":-1,\\\"inReplyToUserId\\\":-1,\\\"inReplyToScreenName\\\":\\\"\\\",\\\"thumbnailPic\\\":\\\"\\\",\\\"bmiddlePic\\\":\\\"\\\",\\\"originalPic\\\":\\\"\\\",\\\"geo\\\":\\\"null\\\",\\\"latitude\\\":-1.0,\\\"longitude\\\":-1.0,\\\"repostsCount\\\":0,\\\"commentsCount\\\":0,\\\"attitudesCount\\\":0,\\\"annotations\\\":\\\"[{\\\\\\\"client_mblogid\\\\\\\":\\\\\\\"iPhone-F9D647B5-35A8-418E-8D54-F452BA1AE9D5\\\\\\\"},{\\\\\\\"mapi_request\\\\\\\":true}]\\\",\\\"mlevel\\\":0,\\\"feature\\\":0,\\\"visible\\\":{\\\"type\\\":0,\\\"list_id\\\":0}},\\\"targetUid\\\":\\\"2739134804\\\",\\\"rootCommentId\\\":\\\"4506597218976778\\\",\\\"isFromLoyalFans\\\":true,\\\"attitudesCount\\\":44,\\\"commentsCount\\\":28,\\\"user\\\":{\\\"id\\\":\\\"5620597491\\\",\\\"screenName\\\":\\\"青松月云归心\\\",\\\"name\\\":\\\"青松月云归心\\\",\\\"province\\\":23,\\\"city\\\":1,\\\"location\\\":\\\"黑龙江 哈尔滨\\\",\\\"description\\\":\\\"三十功名尘与土。八千里路云和月。\\\",\\\"url\\\":\\\"\\\",\\\"profileImageUrl\\\":\\\"https://tvax1.sinaimg.cn/crop.0.0.996.996.50/0068nsafly8g5ns26zkboj30ro0ron0t.jpg?KID\\\\u003dimgbed,tva\\\\u0026Expires\\\\u003d1599645696\\\\u0026ssig\\\\u003d0zMIX9Nuwh\\\",\\\"userDomain\\\":\\\"\\\",\\\"gender\\\":\\\"m\\\",\\\"followersCount\\\":4238,\\\"friendsCount\\\":369,\\\"statusesCount\\\":9183,\\\"favouritesCount\\\":965,\\\"createdAt\\\":\\\"May 29, 2015 3:33:09 PM\\\",\\\"following\\\":false,\\\"verified\\\":true,\\\"verifiedType\\\":0,\\\"allowAllActMsg\\\":false,\\\"allowAllComment\\\":true,\\\"followMe\\\":false,\\\"avatarLarge\\\":\\\"https://tvax1.sinaimg.cn/crop.0.0.996.996.180/0068nsafly8g5ns26zkboj30ro0ron0t.jpg?KID\\\\u003dimgbed,tva\\\\u0026Expires\\\\u003d1599645696\\\\u0026ssig\\\\u003dloxCr5%2FyNp\\\",\\\"onlineStatus\\\":0,\\\"biFollowersCount\\\":149,\\\"lang\\\":\\\"zh-cn\\\",\\\"verifiedReason\\\":\\\"国学博主\\\",\\\"weihao\\\":\\\"\\\",\\\"statusId\\\":\\\"\\\",\\\"verifiedTypeExt\\\":0}}\",\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[\\\"10\\\"]\",\"lang\":\"\",\"publish_date\":\"20200520095928\",\"taskId\":\"2343033\",\"msgDepth\":\"1\",\"start_date\":\"20200101000000\"}\n";


    public static final String WeiboComment = "{\"end_date\":\"20191219000000\",\"msgType\":\"1\",\"mid\":\"452904233441678\"," +
            "\"uid\":\"1848981204\",\"_track_count_\":\"true\",\"is_comment\":\"1\",\"cat_id\":\"9\",\"json\":\"{\\\"createdAt\\\":\\\"Jul 1, 2020 " +
            "9:54:15 AM\\\",\\\"id\\\":452904233441678,\\\"mid\\\":\\\"452904233441678\\\",\\\"idstr\\\":\\\"452904233441678\\\"," +
            "\\\"text\\\":\\\"这种无边的平底锅，是印度的啦\\\",\\\"source\\\":\\\"\\\",\\\"status\\\":{\\\"user\\\":{\\\"id\\\":\\\"1490372962\\\"," +
            "\\\"screenName\\\":\\\"他回精神病院了\\\",\\\"name\\\":\\\"他回精神病院了\\\",\\\"province\\\":63,\\\"city\\\":26,\\\"location\\\":\\\"青海 果洛\\\"," +
            "\\\"description\\\":\\\"疯了疯了疯了。。。\\\",\\\"url\\\":\\\"http://blog.sina.com.cn/jianghuajianghu\\\"," +
            "\\\"profileImageUrl\\\":\\\"https://tvax2.sinaimg.cn/crop.0.0.812.812.50/58d54962ly8fw0w1e9hpgj20mk0mkq5p.jpg?KID\\\\u003dimgbed," +
            "tva\\\\u0026Expires\\\\u003d1593579712\\\\u0026ssig\\\\u003dy6yjI2wgQ3\\\",\\\"userDomain\\\":\\\"jianghuajianghu\\\"," +
            "\\\"gender\\\":\\\"m\\\",\\\"followersCount\\\":9633375,\\\"friendsCount\\\":995,\\\"statusesCount\\\":21257," +
            "\\\"favouritesCount\\\":201,\\\"createdAt\\\":\\\"Aug 28, 2009 4:14:19 PM\\\",\\\"following\\\":false,\\\"verified\\\":true," +
            "\\\"verifiedType\\\":0,\\\"allowAllActMsg\\\":false,\\\"allowAllComment\\\":false,\\\"followMe\\\":false," +
            "\\\"avatarLarge\\\":\\\"https://tvax2.sinaimg.cn/crop.0.0.812.812.180/58d54962ly8fw0w1e9hpgj20mk0mkq5p.jpg?KID\\\\u003dimgbed," +
            "tva\\\\u0026Expires\\\\u003d1593579712\\\\u0026ssig\\\\u003dBgZ9E8Pv83\\\",\\\"onlineStatus\\\":0,\\\"biFollowersCount\\\":944," +
            "\\\"lang\\\":\\\"zh-cn\\\",\\\"verifiedReason\\\":\\\"导演高群书，代表作《东京审判》、《征服》、《风声》\\\",\\\"weihao\\\":\\\"\\\",\\\"statusId\\\":\\\"\\\"," +
            "\\\"verifiedTypeExt\\\":1},\\\"createdAt\\\":\\\"Jul 1, 2020 9:20:59 AM\\\",\\\"id\\\":\\\"4521807825348776\\\"," +
            "\\\"mid\\\":\\\"4521807825348776\\\",\\\"idstr\\\":4521807825348776,\\\"text\\\":\\\"这个锅我吃过好几回。\\\"," +
            "\\\"source\\\":{\\\"url\\\":\\\"http://app.weibo.com/t/feed/3Jp3Q4\\\",\\\"relationShip\\\":\\\"nofollow\\\",\\\"name\\\":\\\"HUAWEI " +
            "Mate 20 X\\\"},\\\"favorited\\\":false,\\\"truncated\\\":false,\\\"inReplyToStatusId\\\":-1,\\\"inReplyToUserId\\\":-1," +
            "\\\"inReplyToScreenName\\\":\\\"\\\",\\\"thumbnailPic\\\":\\\"\\\",\\\"bmiddlePic\\\":\\\"\\\",\\\"originalPic\\\":\\\"\\\"," +
            "\\\"retweetedStatus\\\":{\\\"user\\\":{\\\"id\\\":\\\"1218966851\\\",\\\"screenName\\\":\\\"张颂文\\\",\\\"name\\\":\\\"张颂文\\\"," +
            "\\\"province\\\":11,\\\"city\\\":1000,\\\"location\\\":\\\"北京\\\",\\\"description\\\":\\\"工作联系：雷先生15110017280\\\"," +
            "\\\"url\\\":\\\"http://blog.sina.com.cn/zhangsongwen\\\",\\\"profileImageUrl\\\":\\\"https://tvax1.sinaimg.cn/crop.0.0.664.664" +
            ".50/48a7f543ly8gceo7v3y6vj20ig0iht9e.jpg?KID\\\\u003dimgbed," +
            "tva\\\\u0026Expires\\\\u003d1593579712\\\\u0026ssig\\\\u003ds1QlipqL%2BR\\\",\\\"userDomain\\\":\\\"zhangsongwen\\\"," +
            "\\\"gender\\\":\\\"m\\\",\\\"followersCount\\\":1481234,\\\"friendsCount\\\":703,\\\"statusesCount\\\":1318," +
            "\\\"favouritesCount\\\":3422,\\\"createdAt\\\":\\\"Aug 28, 2009 4:14:15 PM\\\",\\\"following\\\":false,\\\"verified\\\":true," +
            "\\\"verifiedType\\\":0,\\\"allowAllActMsg\\\":true,\\\"allowAllComment\\\":true,\\\"followMe\\\":false," +
            "\\\"avatarLarge\\\":\\\"https://tvax1.sinaimg.cn/crop.0.0.664.664.180/48a7f543ly8gceo7v3y6vj20ig0iht9e.jpg?KID\\\\u003dimgbed," +
            "tva\\\\u0026Expires\\\\u003d1593579712\\\\u0026ssig\\\\u003dR6XLIUoF5g\\\",\\\"onlineStatus\\\":0,\\\"biFollowersCount\\\":692," +
            "\\\"lang\\\":\\\"zh-cn\\\",\\\"verifiedReason\\\":\\\"表演指导，演员\\\",\\\"weihao\\\":\\\"\\\",\\\"statusId\\\":\\\"\\\"," +
            "\\\"verifiedTypeExt\\\":1},\\\"createdAt\\\":\\\"Jan 14, 2020 3:57:34 PM\\\",\\\"id\\\":\\\"4460664078390920\\\"," +
            "\\\"mid\\\":\\\"4460664078390920\\\",\\\"idstr\\\":4460664078390920,\\\"text\\\":\\\"西北特色:羊拨拉 http://t.cn/R2Wxe09 http://t.cn/A6vyrnVe" +
            " \u200B\\\",\\\"source\\\":{\\\"url\\\":\\\"http://app.weibo.com/t/feed/2F3i7o\\\",\\\"relationShip\\\":\\\"nofollow\\\"," +
            "\\\"name\\\":\\\"HUAWEI P20 Pro\\\"},\\\"favorited\\\":false,\\\"truncated\\\":false,\\\"inReplyToStatusId\\\":-1," +
            "\\\"inReplyToUserId\\\":-1,\\\"inReplyToScreenName\\\":\\\"\\\",\\\"thumbnailPic\\\":\\\"\\\",\\\"bmiddlePic\\\":\\\"\\\"," +
            "\\\"originalPic\\\":\\\"\\\",\\\"geo\\\":\\\"{\\\\\\\"coordinates\\\\\\\":[39.804572,97.556007]," +
            "\\\\\\\"type\\\\\\\":\\\\\\\"Point\\\\\\\"}\\\",\\\"latitude\\\":97.556007,\\\"longitude\\\":39.804572,\\\"repostsCount\\\":153," +
            "\\\"commentsCount\\\":213,\\\"attitudesCount\\\":432," +
            "\\\"annotations\\\":\\\"[{\\\\\\\"place\\\\\\\":{\\\\\\\"poiid\\\\\\\":\\\\\\\"8008662098100000000\\\\\\\"," +
            "\\\\\\\"title\\\\\\\":\\\\\\\"玉门市\\\\\\\",\\\\\\\"type\\\\\\\":\\\\\\\"checkin\\\\\\\"}," +
            "\\\\\\\"client_mblogid\\\\\\\":\\\\\\\"dade2aad-53a2-4898-98df-084b8ec16649\\\\\\\"},{\\\\\\\"mapi_request\\\\\\\":true}]\\\"," +
            "\\\"mlevel\\\":0,\\\"feature\\\":0,\\\"visible\\\":{\\\"type\\\":0,\\\"list_id\\\":0}},\\\"geo\\\":\\\"null\\\",\\\"latitude\\\":-1.0," +
            "\\\"longitude\\\":-1.0,\\\"repostsCount\\\":6,\\\"commentsCount\\\":16,\\\"attitudesCount\\\":22," +
            "\\\"annotations\\\":\\\"[{\\\\\\\"client_mblogid\\\\\\\":\\\\\\\"be903776-6c88-4109-ad9a-68037c18dcc6\\\\\\\"}," +
            "{\\\\\\\"mapi_request\\\\\\\":true}]\\\",\\\"mlevel\\\":0,\\\"feature\\\":0,\\\"visible\\\":{\\\"type\\\":0,\\\"list_id\\\":0}}," +
            "\\\"targetUid\\\":\\\"1490372962\\\",\\\"rootCommentId\\\":\\\"452904233441678\\\",\\\"isFromLoyalFans\\\":false," +
            "\\\"user\\\":{\\\"id\\\":\\\"1848981204\\\",\\\"screenName\\\":\\\"-中中中间-\\\",\\\"name\\\":\\\"-中中中间-\\\",\\\"province\\\":44," +
            "\\\"city\\\":1000,\\\"location\\\":\\\"广东\\\",\\\"description\\\":\\\"\\\",\\\"url\\\":\\\"http://blog.sina.com.cn/shelly066\\\"," +
            "\\\"profileImageUrl\\\":\\\"https://tvax4.sinaimg.cn/crop.0.0.996.996.50/6e3536d4ly8fi0v1ssrwej20ro0romzk.jpg?KID\\\\u003dimgbed," +
            "tva\\\\u0026Expires\\\\u003d1593579712\\\\u0026ssig\\\\u003d2BJ5Ck0NHI\\\",\\\"userDomain\\\":\\\"chenshaohong2015\\\"," +
            "\\\"gender\\\":\\\"f\\\",\\\"followersCount\\\":1171,\\\"friendsCount\\\":517,\\\"statusesCount\\\":2404,\\\"favouritesCount\\\":234," +
            "\\\"createdAt\\\":\\\"Oct 11, 2010 10:58:02 AM\\\",\\\"following\\\":false,\\\"verified\\\":true,\\\"verifiedType\\\":0," +
            "\\\"allowAllActMsg\\\":false,\\\"allowAllComment\\\":true,\\\"followMe\\\":false,\\\"avatarLarge\\\":\\\"https://tvax4.sinaimg.cn/crop" +
            ".0.0.996.996.180/6e3536d4ly8fi0v1ssrwej20ro0romzk.jpg?KID\\\\u003dimgbed," +
            "tva\\\\u0026Expires\\\\u003d1593579712\\\\u0026ssig\\\\u003dB1wfD3Pyx3\\\",\\\"onlineStatus\\\":0,\\\"biFollowersCount\\\":42," +
            "\\\"lang\\\":\\\"zh-cn\\\",\\\"verifiedReason\\\":\\\"前 深圳市大一太阳能科技有限公司总经理\\\",\\\"weihao\\\":\\\"\\\",\\\"statusId\\\":\\\"\\\"," +
            "\\\"verifiedTypeExt\\\":0}}\",\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[\\\"5555\\\"]\",\"lang\":\"\"," +
            "\"start_date\":\"20101211000000\",\"jobName\":\"CP4358_20200701100130_658_45\",\"_CT_\":\"1593568912616\"," +
            "\"_kafka_data_type_\":\"comment\",\"time_zone\":\"PRC\",\"url\":\"https://weibo.com/1490372962/J99jUmrsA?type\\u003dcomment\"," +
            "\"update_date\":\"20200701100152\",\"site\":\"新浪微博\",\"crawler\":\"972\",\"sourceCrawlerId\":\"972\"," +
            "\"parent_id\":\"4521807825348776\",\"site_id\":\"101993\",\"CONTROL_AMOUNT\":\"1\",\"publish_date\":\"20200701095415\"," +
            "\"taskId\":\"666090\",\"msgDepth\":\"1\"}\n";


    public static final String WeiboPostRepost = "{\"end_date\":\"20191219000000\",\"msgType\":\"1\",\"mid\":\"4438441154787321\"," +
            "\"uid\":\"3563446137\",\"_track_count_\":\"true\",\"cat_id\":\"9\",\"json\":\"{\\\"user\\\":{\\\"id\\\":\\\"3563446137\\\"," +
            "\\\"screenName\\\":\\\"KIKI酱_橘柒柒\\\",\\\"name\\\":\\\"KIKI酱_橘柒柒\\\",\\\"province\\\":33,\\\"city\\\":1,\\\"location\\\":\\\"浙江 杭州\\\"," +
            "\\\"description\\\":\\\"キキちゃんの開放区\\\",\\\"url\\\":\\\"\\\",\\\"profileImageUrl\\\":\\\"https://tvax2.sinaimg.cn/crop.0.0.750.750" +
            ".50/d465df79ly8fvswlp0eylj20ku0kuta8.jpg?KID\\\\u003dimgbed," +
            "tva\\\\u0026Expires\\\\u003d1593531968\\\\u0026ssig\\\\u003dKystOj2Rj1\\\"," +
            "\\\"userDomain\\\":\\\"\\\",\\\"gender\\\":\\\"f\\\",\\\"followersCount\\\":304,\\\"friendsCount\\\":201,\\\"statusesCount\\\":8346," +
            "\\\"favouritesCount\\\":824,\\\"createdAt\\\":\\\"Jun 28, 2013 4:13:29 PM\\\",\\\"following\\\":false,\\\"verified\\\":true," +
            "\\\"verifiedType\\\":0,\\\"allowAllActMsg\\\":false,\\\"allowAllComment\\\":true,\\\"followMe\\\":false," +
            "\\\"avatarLarge\\\":\\\"https://tvax2.sinaimg.cn/crop.0.0.750.750.180/d465df79ly8fvswlp0eylj20ku0kuta8.jpg?KID\\\\u003dimgbed," +
            "tva\\\\u0026Expires\\\\u003d1593531968\\\\u0026ssig\\\\u003d5mdxRrE21k\\\",\\\"onlineStatus\\\":0,\\\"biFollowersCount\\\":38," +
            "\\\"lang\\\":\\\"zh-cn\\\",\\\"verifiedReason\\\":\\\"朱一龙超话粉丝大咖\\\",\\\"weihao\\\":\\\"\\\",\\\"statusId\\\":\\\"\\\"," +
            "\\\"verifiedTypeExt\\\":0},\\\"createdAt\\\":\\\"Nov 14, 2019 8:11:25 AM\\\",\\\"id\\\":\\\"4438441154787321\\\"," +
            "\\\"mid\\\":\\\"4438441154787321\\\",\\\"idstr\\\":4438441154787321,\\\"text\\\":\\\"今日も一緒に頑張れ\uD83D\uDC4D\\\"," +
            "\\\"source\\\":{\\\"url\\\":\\\"http://weibo.com/\\\",\\\"relationShip\\\":\\\"nofollow\\\"," +
            "\\\"name\\\":\\\"等待小\uD83D\uDC5F朱一龙的小笼包\\\"},\\\"favorited\\\":false,\\\"truncated\\\":false,\\\"inReplyToStatusId\\\":-1," +
            "\\\"inReplyToUserId\\\":-1,\\\"inReplyToScreenName\\\":\\\"\\\",\\\"thumbnailPic\\\":\\\"\\\",\\\"bmiddlePic\\\":\\\"\\\"," +
            "\\\"originalPic\\\":\\\"\\\",\\\"retweetedStatus\\\":{\\\"user\\\":{\\\"id\\\":\\\"6883966016\\\"," +
            "\\\"screenName\\\":\\\"木村拓哉\\\",\\\"name\\\":\\\"木村拓哉\\\",\\\"province\\\":400,\\\"city\\\":1000,\\\"location\\\":\\\"海外\\\"," +
            "\\\"description\\\":\\\"\\\",\\\"url\\\":\\\"\\\",\\\"profileImageUrl\\\":\\\"https://tvax2.sinaimg.cn/crop.59.0.807.807" +
            ".50/007vSq1Wly8fydd73l33kj30rs112adp.jpg?KID\\\\u003dimgbed," +
            "tva\\\\u0026Expires\\\\u003d1593531968\\\\u0026ssig\\\\u003dFWWRowCwm4\\\",\\\"userDomain\\\":\\\"\\\"," +
            "\\\"gender\\\":\\\"m\\\",\\\"followersCount\\\":2494333,\\\"friendsCount\\\":7,\\\"statusesCount\\\":682," +
            "\\\"favouritesCount\\\":0,\\\"createdAt\\\":\\\"Dec 13, 2018 3:17:20 PM\\\",\\\"following\\\":false," +
            "\\\"verified\\\":true,\\\"verifiedType\\\":0,\\\"allowAllActMsg\\\":false,\\\"allowAllComment\\\":true," +
            "\\\"followMe\\\":false,\\\"avatarLarge\\\":\\\"https://tvax2.sinaimg.cn/crop.59.0.807.807" +
            ".180/007vSq1Wly8fydd73l33kj30rs112adp.jpg?KID\\\\u003dimgbed," +
            "tva\\\\u0026Expires\\\\u003d1593531968\\\\u0026ssig\\\\u003dVShGhdO8Gn\\\",\\\"onlineStatus\\\":0," +
            "\\\"biFollowersCount\\\":6,\\\"lang\\\":\\\"zh-cn\\\",\\\"verifiedReason\\\":\\\"日本知名歌手・演员\\\"," +
            "\\\"weihao\\\":\\\"\\\",\\\"statusId\\\":\\\"\\\",\\\"verifiedTypeExt\\\":1},\\\"createdAt\\\":\\\"Nov 14, 2019 " +
            "8:10:07 AM\\\",\\\"id\\\":\\\"4438440781247633\\\",\\\"mid\\\":\\\"4438440781247633\\\"," +
            "\\\"idstr\\\":4438440781247633,\\\"text\\\":\\\"早上好❣️\\\\n去グラメ拍摄的途中发现了更新的RYOMA\uD83D\uDE05今天也一起全力以赴吧‼️\uD83D" +
            "\uDC4A⭐️⭐️⭐️ 拓哉 \u200B\\\",\\\"favorited\\\":false,\\\"truncated\\\":false,\\\"inReplyToStatusId\\\":-1," +
            "\\\"inReplyToUserId\\\":-1,\\\"inReplyToScreenName\\\":\\\"\\\",\\\"thumbnailPic\\\":\\\"http://wx2.sinaimg" +
            ".cn/thumbnail/007vSq1Wgy1g8x8y9sijdj30us152dky.jpg\\\",\\\"bmiddlePic\\\":\\\"http://wx2.sinaimg" +
            ".cn/bmiddle/007vSq1Wgy1g8x8y9sijdj30us152dky.jpg\\\",\\\"originalPic\\\":\\\"http://wx2.sinaimg" +
            ".cn/large/007vSq1Wgy1g8x8y9sijdj30us152dky.jpg\\\",\\\"geo\\\":\\\"null\\\",\\\"latitude\\\":-1.0," +
            "\\\"longitude\\\":-1.0,\\\"repostsCount\\\":612,\\\"commentsCount\\\":1738,\\\"attitudesCount\\\":28929," +
            "\\\"annotations\\\":\\\"[{\\\\\\\"client_mblogid\\\\\\\":\\\\\\\"iPhone-2E015FD3-CE9A-4FB5-86AA" +
            "-A886FCE3A690\\\\\\\"},{\\\\\\\"mapi_request\\\\\\\":true}]\\\",\\\"mlevel\\\":0,\\\"feature\\\":0," +
            "\\\"picUrls\\\":[\\\"http://wx2.sinaimg.cn/thumbnail/007vSq1Wgy1g8x8y9sijdj30us152dky.jpg\\\"]," +
            "\\\"visible\\\":{\\\"type\\\":0,\\\"list_id\\\":0}},\\\"geo\\\":\\\"null\\\",\\\"latitude\\\":-1.0," +
            "\\\"longitude\\\":-1.0,\\\"repostsCount\\\":0,\\\"commentsCount\\\":0,\\\"attitudesCount\\\":0," +
            "\\\"annotations\\\":\\\"[{\\\\\\\"mapi_request\\\\\\\":true}]\\\",\\\"mlevel\\\":0," +
            "\\\"feature\\\":0,\\\"visible\\\":{\\\"type\\\":0,\\\"list_id\\\":0}}\",\"_html_\":\"避免过长，省略...\"," +
            "\"interfaceIdList\":\"[\\\"1\\\"]\",\"lang\":\"\",\"start_date\":\"20101211000000\"," +
            "\"jobName\":\"CP4358_20200630204551_374_89\",\"_CT_\":\"1593521168741\"," +
            "\"_kafka_data_type_\":\"post\",\"time_zone\":\"PRC\",\"url\":\"https://weibo" +
            ".com/6883966016/Ig81g5ez7\",\"update_date\":\"20200630204608\",\"site\":\"新浪微博\"," +
            "\"crawler\":\"973\",\"sourceCrawlerId\":\"973\",\"parent_id\":\"4438440781247633\"," +
            "\"site_id\":\"101993\",\"CONTROL_AMOUNT\":\"451\",\"publish_date\":\"20191114081125\"," +
            "\"taskId\":\"1336150\",\"msgDepth\":\"1\"}\n";


    public static final String WeiboPost = "{\"end_date\":\"20191219000000\",\"msgType\":\"1\",\"crawlerIdList\":\"23477,99991,972\"," +
            "\"mid\":\"452904233441678\",\"source\":\"微博 weibo.com\",\"uid\":\"5915106342\",\"_track_count_\":\"true\",\"cat_id\":\"9\"," +
            "\"json\":\"{\\\"user\\\":{\\\"id\\\":\\\"5915106342\\\",\\\"screenName\\\":\\\"黄蓉的梦想\\\",\\\"name\\\":\\\"黄蓉的梦想是唱个锤子\\\"," +
            "\\\"province\\\":44,\\\"city\\\":1,\\\"location\\\":\\\"广东 广州\\\",\\\"description\\\":\\\"You have to believe that the harder you " +
            "work, the luckier you are.\\\",\\\"url\\\":\\\"\\\",\\\"profileImageUrl\\\":\\\"https://tvax4.sinaimg.cn/crop.303.4.758.758" +
            ".50/006sjbn0ly8gfds3hpmxej311y0lctd0.jpg?KID\\\\u003dimgbed," +
            "tva\\\\u0026Expires\\\\u003d1593530895\\\\u0026ssig\\\\u003deejG%2BiUMV1\\\",\\\"userDomain\\\":\\\"\\\",\\\"gender\\\":\\\"m\\\"," +
            "\\\"followersCount\\\":67,\\\"friendsCount\\\":197,\\\"statusesCount\\\":92,\\\"favouritesCount\\\":0,\\\"createdAt\\\":\\\"May 2, " +
            "2016 10:33:46 PM\\\",\\\"following\\\":false,\\\"verified\\\":false,\\\"verifiedType\\\":-1,\\\"allowAllActMsg\\\":false," +
            "\\\"allowAllComment\\\":true,\\\"followMe\\\":false,\\\"avatarLarge\\\":\\\"https://tvax4.sinaimg.cn/crop.303.4.758.758" +
            ".180/006sjbn0ly8gfds3hpmxej311y0lctd0.jpg?KID\\\\u003dimgbed," +
            "tva\\\\u0026Expires\\\\u003d1593530895\\\\u0026ssig\\\\u003dSl34RKeLZQ\\\",\\\"onlineStatus\\\":0,\\\"biFollowersCount\\\":5," +
            "\\\"lang\\\":\\\"zh-cn\\\",\\\"verifiedReason\\\":\\\"\\\",\\\"weihao\\\":\\\"\\\",\\\"statusId\\\":\\\"\\\"," +
            "\\\"verifiedTypeExt\\\":0},\\\"createdAt\\\":\\\"Jun 30, 2020 8:26:45 PM\\\",\\\"id\\\":\\\"452904233441678\\\"," +
            "\\\"mid\\\":\\\"452904233441678\\\",\\\"idstr\\\":452904233441678," +
            "\\\"text\\\":\\\"广东广州的，广州好像有几家，联想、华为、小米、我爱华为领域。\"," +
            "\\\"source\\\":{\\\"url\\\":\\\"http://app.weibo.com/t/feed/6vtZb0\\\",\\\"relationShip\\\":\\\"nofollow\\\",\\\"name\\\":\\\"微博 weibo" +
            ".com\\\"},\\\"favorited\\\":false,\\\"truncated\\\":false,\\\"inReplyToStatusId\\\":-1,\\\"inReplyToUserId\\\":-1," +
            "\\\"inReplyToScreenName\\\":\\\"\\\",\\\"thumbnailPic\\\":\\\"\\\",\\\"bmiddlePic\\\":\\\"\\\",\\\"originalPic\\\":\\\"\\\"," +
            "\\\"geo\\\":\\\"null\\\",\\\"latitude\\\":-1.0,\\\"longitude\\\":-1.0,\\\"repostsCount\\\":0,\\\"commentsCount\\\":1," +
            "\\\"attitudesCount\\\":1,\\\"annotations\\\":\\\"\\\",\\\"mlevel\\\":0,\\\"feature\\\":1,\\\"visible\\\":{\\\"type\\\":0," +
            "\\\"list_id\\\":0}}\",\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[\\\"45\\\"]\",\"lang\":\"\",\"start_date\":\"20101211000000\"," +
            "\"jobName\":\"CP4358_20200630202802_270_11\",\"from_type\":\"null\",\"_CT_\":\"1593520096035\",\"salt\":\"null\"," +
            "\"site\":\"新浪微博\",\"crawler\":\"2990\",\"sourceCrawlerId\":\"2990\",\"site_id\":\"101993\",\"topic\":\"null\"," +
            "\"CONTROL_AMOUNT\":\"1\",\"retweet_id\":\"\",\"publish_date\":\"20200630202645\",\"taskId\":\"90777\",\"msgDepth\":\"1\"}\n";


    public static final String WeiboUser = "{\"jobName\":\"CP4358_20200630201625_485_48\",\"end_date\":\"20200612180000\",\"msgType\":\"1\"," +
            "\"_CT_\":\"1593519393716\",\"_kafka_data_type_\":\"user\",\"time_zone\":\"PRC\",\"update_date\":\"20200630201633\"," +
            "\"uid\":\"59151063420013411\",\"site\":\"新浪微博\",\"_track_count_\":\"true\",\"crawler\":\"23626\",\"sourceCrawlerId\":\"23626\"," +
            "\"uids\":\"59151063420013411\",\"cat_id\":\"9\",\"site_id\":\"101993\",\"json\":\"{\\\"user\\\":{\\\"id\\\":\\\"59151063420013411\\\"," +
            "\\\"screenName\\\":\\\"蜗牛有一把锤子\\\",\\\"name\\\":\\\"蜗牛有一把锤子\\\",\\\"province\\\":44,\\\"city\\\":1,\\\"location\\\":\\\"广东 广州\\\"," +
            "\\\"description\\\":\\\"You have to believe that the harder you work, the luckier you are.\\\",\\\"url\\\":\\\"\\\"," +
            "\\\"profileImageUrl\\\":\\\"https://tvax4.sinaimg.cn/crop.303.4.758.758.50/006sjbn0ly8gfds3hpmxej311y0lctd0.jpg?KID\\\\u003dimgbed," +
            "tva\\\\u0026Expires\\\\u003d1593530193\\\\u0026ssig\\\\u003dRMveELtjkC\\\",\\\"userDomain\\\":\\\"\\\",\\\"gender\\\":\\\"m\\\"," +
            "\\\"followersCount\\\":67,\\\"friendsCount\\\":197,\\\"statusesCount\\\":91,\\\"favouritesCount\\\":0,\\\"createdAt\\\":\\\"May 2, " +
            "2016 10:33:46 PM\\\",\\\"following\\\":false,\\\"verified\\\":false,\\\"verifiedType\\\":-1,\\\"allowAllActMsg\\\":false," +
            "\\\"allowAllComment\\\":true,\\\"followMe\\\":false,\\\"avatarLarge\\\":\\\"https://tvax4.sinaimg.cn/crop.303.4.758.758" +
            ".180/006sjbn0ly8gfds3hpmxej311y0lctd0.jpg?KID\\\\u003dimgbed," +
            "tva\\\\u0026Expires\\\\u003d1593530193\\\\u0026ssig\\\\u003dEp%2BKp0nJZN\\\",\\\"onlineStatus\\\":0,\\\"biFollowersCount\\\":5," +
            "\\\"lang\\\":\\\"zh-cn\\\",\\\"verifiedReason\\\":\\\"\\\",\\\"weihao\\\":\\\"\\\",\\\"statusId\\\":\\\"\\\"," +
            "\\\"verifiedTypeExt\\\":0},\\\"createdAt\\\":\\\"Dec 21, 2017 11:22:57 PM\\\",\\\"id\\\":\\\"4187535716970759\\\"," +
            "\\\"mid\\\":\\\"4187535716970759\\\",\\\"idstr\\\":4187535716970759,\\\"text\\\":\\\"励志哥，还有什么借口不努力\\\"," +
            "\\\"source\\\":{\\\"url\\\":\\\"http://app.weibo.com/t/feed/4BnLqb\\\",\\\"relationShip\\\":\\\"nofollow\\\",\\\"name\\\":\\\"小米5s " +
            "拍照黑科技\\\"},\\\"favorited\\\":false,\\\"truncated\\\":false,\\\"inReplyToStatusId\\\":-1,\\\"inReplyToUserId\\\":-1," +
            "\\\"inReplyToScreenName\\\":\\\"\\\",\\\"thumbnailPic\\\":\\\"\\\",\\\"bmiddlePic\\\":\\\"\\\",\\\"originalPic\\\":\\\"\\\"," +
            "\\\"geo\\\":\\\"null\\\",\\\"latitude\\\":-1.0,\\\"longitude\\\":-1.0,\\\"repostsCount\\\":0,\\\"commentsCount\\\":0," +
            "\\\"attitudesCount\\\":0,\\\"annotations\\\":\\\"[{\\\\\\\"client_mblogid\\\\\\\":\\\\\\\"eb48119d-4cca-4a1d-8106-39bf1ba03f97" +
            "\\\\\\\"},{\\\\\\\"mapi_request\\\\\\\":true}]\\\",\\\"mlevel\\\":0,\\\"feature\\\":0,\\\"visible\\\":{\\\"type\\\":0," +
            "\\\"list_id\\\":0}}\",\"_html_\":\"避免过长，省略...\",\"CONTROL_AMOUNT\":\"1\",\"interfaceIdList\":\"[]\",\"lang\":\"\"," +
            "\"weibo_msg_type\":\"user\",\"taskId\":\"1336150\",\"msgDepth\":\"1\",\"start_date\":\"20200604180000\"}\n";

    //微博高级用户
    public static final String WeiboAdvUser = "{\"jobName\":\"CP4358_20200630195400_212_6\",\"end_date\":\"20191219000000\",\"msgType\":\"1\"," +
            "\"_CT_\":\"1593518054553\",\"_kafka_data_type_\":\"bilateral_follow\",\"time_zone\":\"PRC\",\"type\":\"bilateral_follow\"," +
            "\"update_date\":\"20200630195414\",\"uid\":\"591510634200134\",\"site\":\"新浪微博\",\"_track_count_\":\"true\",\"crawler\":\"2050\"," +
            "\"sourceCrawlerId\":\"2050\",\"follow_count\":\"192\",\"cat_id\":\"9\",\"site_id\":\"101993\",\"json\":\"{\\\"bilateral\\\":[]," +
            "\\\"follow\\\":[\\\"11112222333\\\",\\\"88889990000\\\",\\\"5556666555444\\\",\\\"5996184614\\\",\\\"2590804724\\\"," +
            "\\\"2208456931\\\"," +
            "\\\"6024419333\\\",\\\"5573718544\\\",\\\"1923237421\\\",\\\"6685357186\\\",\\\"2432009827\\\",\\\"2671903611\\\",\\\"2082430927\\\"," +
            "\\\"2730402964\\\",\\\"2658147363\\\",\\\"5220735347\\\",\\\"6278580139\\\",\\\"6142908135\\\",\\\"2289258211\\\",\\\"6534084408\\\"," +
            "\\\"5943595658\\\",\\\"3315951631\\\",\\\"1992613670\\\",\\\"3800478724\\\",\\\"7011030877\\\",\\\"5938109808\\\",\\\"1937645903\\\"," +
            "\\\"6031854220\\\",\\\"3264072325\\\",\\\"7153958422\\\",\\\"7059865197\\\",\\\"3042214195\\\",\\\"1585080461\\\",\\\"5901225965\\\"," +
            "\\\"6399620365\\\",\\\"2985022152\\\",\\\"5984526573\\\",\\\"5616622747\\\",\\\"3972442779\\\",\\\"1676079234\\\",\\\"6439737520\\\"," +
            "\\\"2418516302\\\",\\\"1799605655\\\",\\\"1275795921\\\",\\\"5572764403\\\",\\\"1700486331\\\",\\\"2714182190\\\",\\\"5502627600\\\"," +
            "\\\"1912744175\\\",\\\"6874084168\\\",\\\"3858832626\\\",\\\"5893301169\\\",\\\"6535497840\\\",\\\"3881380517\\\",\\\"3067934241\\\"," +
            "\\\"2549177871\\\",\\\"6302216877\\\",\\\"6355649753\\\",\\\"1403611582\\\",\\\"6643921177\\\",\\\"1455428062\\\",\\\"1676643274\\\"," +
            "\\\"5953655291\\\",\\\"1281928792\\\",\\\"5809362297\\\",\\\"1682662153\\\",\\\"2636237417\\\",\\\"1803310643\\\",\\\"1313709087\\\"," +
            "\\\"1788330180\\\",\\\"1314608344\\\",\\\"6880251807\\\",\\\"1880647562\\\",\\\"2060888642\\\",\\\"6774875975\\\",\\\"5370547595\\\"," +
            "\\\"2119365067\\\",\\\"3130307851\\\",\\\"6668950307\\\",\\\"1638988052\\\",\\\"5702496577\\\",\\\"3788429925\\\",\\\"6406924109\\\"," +
            "\\\"3173515672\\\",\\\"1798684292\\\",\\\"2814345740\\\",\\\"6860855365\\\",\\\"1490372962\\\",\\\"1732621822\\\",\\\"1802686415\\\"," +
            "\\\"1847912164\\\",\\\"1044881282\\\",\\\"1635853901\\\",\\\"2925413267\\\",\\\"1939178055\\\",\\\"2205169727\\\",\\\"5868069966\\\"," +
            "\\\"5174400490\\\",\\\"3587960280\\\",\\\"1738434147\\\",\\\"1241148864\\\",\\\"2561994321\\\",\\\"5634946150\\\",\\\"2302617634\\\"," +
            "\\\"5786288576\\\",\\\"2054300185\\\",\\\"1235572171\\\",\\\"1097201945\\\",\\\"5146909253\\\",\\\"1638781994\\\",\\\"2053374713\\\"," +
            "\\\"2993049293\\\",\\\"3490279655\\\",\\\"2610020434\\\",\\\"5780240684\\\",\\\"2022171303\\\",\\\"5375169576\\\",\\\"5974448740\\\"," +
            "\\\"6493997172\\\",\\\"3730833803\\\",\\\"5306156534\\\",\\\"5916982203\\\",\\\"5753544169\\\",\\\"3897495382\\\",\\\"1371558617\\\"," +
            "\\\"3572887791\\\",\\\"1731986465\\\",\\\"3644441127\\\",\\\"6090644516\\\",\\\"5027300482\\\",\\\"3901429666\\\",\\\"5460985514\\\"," +
            "\\\"1041508671\\\",\\\"1196235387\\\",\\\"5077484440\\\",\\\"6042105187\\\",\\\"1290404267\\\",\\\"6042105184\\\",\\\"2193255395\\\"," +
            "\\\"1700625374\\\",\\\"6098525958\\\",\\\"2215881863\\\",\\\"1271958597\\\",\\\"2750621294\\\",\\\"6172978260\\\",\\\"3313038814\\\"," +
            "\\\"1687316021\\\",\\\"5848041511\\\",\\\"1464041460\\\",\\\"5498972025\\\",\\\"5732352881\\\",\\\"1158180841\\\",\\\"1036663592\\\"," +
            "\\\"2677591423\\\",\\\"6068085572\\\",\\\"2619723465\\\",\\\"2540193157\\\",\\\"6037568818\\\",\\\"2422806680\\\",\\\"2145291155\\\"," +
            "\\\"1749127163\\\",\\\"6069804549\\\",\\\"3919535307\\\",\\\"6166217083\\\",\\\"5793213789\\\",\\\"6006335024\\\",\\\"6065255972\\\"," +
            "\\\"1774662372\\\",\\\"3180788643\\\",\\\"5497993620\\\",\\\"1864135524\\\",\\\"2413523023\\\",\\\"5331542240\\\",\\\"2953031917\\\"," +
            "\\\"5743923782\\\",\\\"2715025067\\\",\\\"2850809427\\\",\\\"6085757603\\\",\\\"5922888533\\\",\\\"3487640507\\\",\\\"1713926427\\\"," +
            "\\\"2735327001\\\",\\\"1852220282\\\",\\\"1900072573\\\",\\\"2820236807\\\",\\\"5157038370\\\",\\\"3083672942\\\",\\\"1259110474\\\"," +
            "\\\"3961523491\\\",\\\"1821944837\\\",\\\"2442163043\\\",\\\"1971861621\\\"]}\",\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[\\\"1" +
            "\\\"]\"," +
            "\"lang\":\"\",\"taskId\":\"1336150\",\"msgDepth\":\"1\",\"start_date\":\"20101211000000\"}\n";


    public static final String Weibo_career = "{\"jobName\":\"CP4358_20200630195244_731_65\",\"end_date\":\"20191219000000\",\"msgType\":\"1\"," +
            "\"_CT_\":\"1593517983878\",\"_kafka_data_type_\":\"career\",\"time_zone\":\"PRC\",\"type\":\"career\"," +
            "\"update_date\":\"20200630195303\",\"uid\":\"591510634200134\",\"site\":\"新浪微博\",\"_track_count_\":\"true\",\"crawler\":\"2041\"," +
            "\"sourceCrawlerId\":\"2041\",\"uids\":\"591510634200134\",\"cat_id\":\"9\",\"site_id\":\"101993\"," +
            "\"json\":\"[{\\\"company\\\":\\\"腾讯\\\"," +
            "\\\"department\\\":\\\"总裁管理部\\\",\\\"id\\\":\\\"116151018\\\",\\\"start\\\":0,\\\"end\\\":0,\\\"city\\\":1,\\\"province\\\":11," +
            "\\\"visible\\\":2}]\",\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[]\",\"lang\":\"\",\"taskId\":\"1336150\",\"msgDepth\":\"1\"," +
            "\"start_date\":\"20101211000000\"}\n";

    public static final String Weibo_education = "{\"jobName\":\"CP4358_20200630195353_875_94\",\"end_date\":\"20191219000000\",\"msgType\":\"1\"," +
            "\"_CT_\":\"1593518042345\",\"_kafka_data_type_\":\"education\",\"time_zone\":\"PRC\",\"type\":\"education\"," +
            "\"update_date\":\"20200630195402\",\"uid\":\"591510634200134\",\"site\":\"新浪微博\",\"_track_count_\":\"true\",\"crawler\":\"2043\"," +
            "\"sourceCrawlerId\":\"2043\",\"uids\":\"591510634200134\",\"cat_id\":\"9\",\"site_id\":\"101993\"," +
            "\"json\":\"[{\\\"school\\\":\\\"西安交通大学\\\",\\\"department\\\":\\\" \\\",\\\"id\\\":\\\"288877588\\\",\\\"type\\\":1,\\\"visible\\\":2," +
            "\\\"year\\\":2017,\\\"province\\\":61,\\\"city\\\":0}]\",\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[]\",\"lang\":\"\"," +
            "\"taskId\":\"1336150\",\"msgDepth\":\"1\",\"start_date\":\"20101211000000\"}\n";

    public static final String Weibo_tags = "{\"jobName\":\"CP4358_20200630204304_076_42\",\"end_date\":\"20191219000000\",\"msgType\":\"1\"," +
            "\"_CT_\":\"1593520996507\",\"_kafka_data_type_\":\"tags\",\"time_zone\":\"PRC\",\"type\":\"tags\",\"update_date\":\"20200630204316\"," +
            "\"uid\":\"591510634200134\",\"site\":\"新浪微博\",\"_track_count_\":\"true\",\"crawler\":\"2045\",\"sourceCrawlerId\":\"2045\"," +
            "\"uids\":\"591510634200134\",\"cat_id\":\"9\",\"site_id\":\"101993\",\"json\":\"[{\\\"id\\\":\\\"510308\\\"," +
            "\\\"value\\\":\\\"我叫不正经\\\"," +
            "\\\"weight\\\":\\\"14\\\"}]\",\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[]\",\"lang\":\"\",\"taskId\":\"1336150\"," +
            "\"msgDepth\":\"1\",\"start_date\":\"20101211000000\"}\n";

    public static final String Weibo_birthday = "{\"jobName\":\"CP4358_20200630195347_955_82\",\"end_date\":\"20191219000000\",\"msgType\":\"1\"," +
            "\"_CT_\":\"1593518042794\",\"_kafka_data_type_\":\"birthday\",\"time_zone\":\"PRC\",\"type\":\"birthday\"," +
            "\"update_date\":\"20200630195402\",\"uid\":\"591510634200134\",\"site\":\"新浪微博\",\"_track_count_\":\"true\",\"crawler\":\"2042\"," +
            "\"sourceCrawlerId\":\"2042\",\"cat_id\":\"9\",\"site_id\":\"101993\",\"json\":\"{\\\"id\\\":\\\"591510634200134\\\"," +
            "\\\"name\\\":\\\"蜗牛有一把锤子\\\",\\\"screenName\\\":\\\"蜗牛有一把锤子\\\",\\\"city\\\":1,\\\"province\\\":44,\\\"location\\\":\\\"广东 广州\\\"," +
            "\\\"createdAt\\\":\\\"May 3, 2016 6:33:46 AM\\\",\\\"description\\\":\\\"You have to believe that the harder you work, the luckier you" +
            " are.\\\",\\\"userDomain\\\":\\\"\\\",\\\"gender\\\":\\\"m\\\",\\\"credentialsNum\\\":0,\\\"credentialsType\\\":0," +
            "\\\"lang\\\":\\\"zh-cn\\\",\\\"profileImageUrl\\\":\\\"\\\",\\\"birthday\\\":\\\"1993-07-31\\\",\\\"birthdayVisible\\\":3," +
            "\\\"email\\\":\\\"\\\",\\\"emailVisible\\\":1,\\\"msn\\\":\\\"\\\",\\\"msnVisible\\\":1,\\\"qq\\\":\\\"\\\",\\\"qqVisible\\\":1," +
            "\\\"realName\\\":\\\"大猫\\\",\\\"realNameVisible\\\":2,\\\"url\\\":\\\"\\\",\\\"urlVisible\\\":2}\",\"_html_\":\"避免过长，省略...\"," +
            "\"interfaceIdList\":\"[]\",\"lang\":\"\",\"taskId\":\"1336150\",\"msgDepth\":\"1\",\"start_date\":\"20101211000000\"}\n";

    public static final String videoUser = "{\"sign\":\"《最强法海》使用音频二创标明来源即可。赌怪3预计7月份更新。\",\"vip_label_label_theme\":\"annual_vip\"," +
            "\"pendant_pid\":\"1849\",\"pendant_image\":\"http://i2.hdslb.com/bfs/garb/item/749b7a5457dea56f74f52242a5270f081ae82f14.png\"," +
            "\"moral\":\"0\",\"pendant_name\":\"黄绿合战5th\",\"video_types\":\"[{\\\"tid\\\":1,\\\"count\\\":1,\\\"name\\\":\\\"动画\\\"}," +
            "{\\\"tid\\\":119," +
            "\\\"count\\\":111,\\\"name\\\":\\\"鬼畜\\\"},{\\\"tid\\\":160,\\\"count\\\":3,\\\"name\\\":\\\"生活\\\"},{\\\"tid\\\":3,\\\"count\\\":1," +
            "\\\"name\\\":\\\"音乐\\\"},{\\\"tid\\\":4,\\\"count\\\":2,\\\"name\\\":\\\"游戏\\\"}]\",\"_track_count_\":\"true\"," +
            "\"official_title\":\"bilibili 知名UP主、高能联盟成员\",\"rank\":\"10000\",\"_html_\":\"避免过长，省略...\",\"nameplate_image\":\"http://i2.hdslb" +
            ".com/bfs/face/15fdd49761bc831cbecf8cf1368d0734bb24e1b3.png\",\"interfaceIdList\":\"[]\",\"silence\":\"0\",\"month_elec_count\":\"9\"," +
            "\"nameplate_image_small\":\"http://i2.hdslb.com/bfs/face/72240fadd968360a235d7ae62169188e3a216d5d.png\",\"total_elec_count\":\"714\"," +
            "\"vip_theme_type\":\"0\",\"top_photo\":\"http://i0.hdslb.com/bfs/space/cd52d4ac1d336c940cc4958120170f7928d9e606.png\"," +
            "\"jobName\":\"CP4247_20200709163447_718_82\",\"unique_id\":\"234567ygfdsruio9876\",\"level\":\"6\"," +
            "\"_kafka_data_type_\":\"user\",\"play_count\":\"87813336\",\"update_date\":\"20200709163503\",\"official_type\":\"0\"," +
            "\"crawler\":\"111437\",\"sourceCrawlerId\":\"111437\",\"pendant_image_enhance\":\"http://i2.hdslb" +
            ".com/bfs/garb/item/749b7a5457dea56f74f52242a5270f081ae82f14.png\",\"following_count\":\"253\",\"followings\":\"[\\\"71225757\\\"," +
            "\\\"403483652\\\",\\\"19493608\\\",\\\"213368964\\\",\\\"517327498\\\",\\\"13118294\\\",\\\"10266242\\\",\\\"548444574\\\"," +
            "\\\"33253839\\\",\\\"430949464\\\",\\\"3404595\\\",\\\"514019783\\\",\\\"97395295\\\",\\\"26993968\\\",\\\"15269822\\\"," +
            "\\\"8794106\\\"," +
            "\\\"65590158\\\",\\\"591856754\\\",\\\"4590243\\\",\\\"5599514\\\",\\\"99570469\\\",\\\"421193482\\\",\\\"8544715\\\",\\\"1320231\\\"," +
            "\\\"306895558\\\",\\\"356527061\\\",\\\"281149281\\\",\\\"13218673\\\",\\\"41332500\\\",\\\"808171\\\",\\\"53542\\\",\\\"21387623\\\"," +
            "\\\"7508296\\\",\\\"10330740\\\",\\\"12279618\\\",\\\"9131680\\\",\\\"230501949\\\",\\\"495726120\\\",\\\"507289030\\\"," +
            "\\\"31953347\\\"," +
            "\\\"10977842\\\",\\\"13205124\\\",\\\"110939266\\\",\\\"38347595\\\",\\\"3743849\\\",\\\"32683557\\\",\\\"1706344\\\"," +
            "\\\"235555226\\\"," +
            "\\\"402937511\\\",\\\"8679425\\\",\\\"97240074\\\",\\\"411869738\\\",\\\"6023354\\\",\\\"24440090\\\",\\\"3353026\\\",\\\"2047074\\\"," +
            "\\\"21951780\\\",\\\"1424972\\\",\\\"37090048\\\",\\\"515993\\\",\\\"37663924\\\",\\\"21778075\\\",\\\"305642157\\\"," +
            "\\\"292006329\\\"," +
            "\\\"28605\\\",\\\"299732210\\\",\\\"486287787\\\",\\\"419058522\\\",\\\"10229318\\\",\\\"454324230\\\",\\\"481431545\\\"," +
            "\\\"34510865\\\"," +
            "\\\"40214206\\\",\\\"5806516\\\",\\\"23827386\\\",\\\"107076540\\\",\\\"24806609\\\",\\\"54992199\\\",\\\"31654362\\\"," +
            "\\\"408672114\\\"," +
            "\\\"472747194\\\",\\\"6125496\\\",\\\"267855807\\\",\\\"104934805\\\",\\\"69743276\\\",\\\"21897453\\\",\\\"46733369\\\"," +
            "\\\"4036546\\\"," +
            "\\\"22770727\\\",\\\"57676402\\\",\\\"321173469\\\",\\\"7873222\\\",\\\"434716461\\\",\\\"8034163\\\",\\\"441897078\\\"," +
            "\\\"946974\\\"," +
            "\\\"19582984\\\",\\\"10465620\\\",\\\"4779837\\\",\\\"129232684\\\",\\\"327974408\\\",\\\"28284160\\\",\\\"450084\\\"," +
            "\\\"29170726\\\"," +
            "\\\"185546\\\",\\\"402574397\\\",\\\"159122\\\",\\\"312772023\\\",\\\"5260378\\\",\\\"28824825\\\",\\\"33683045\\\",\\\"2621902\\\"," +
            "\\\"3295\\\",\\\"384582247\\\",\\\"3460558\\\",\\\"2797845\\\",\\\"335076959\\\",\\\"250648682\\\",\\\"8981370\\\",\\\"17929569\\\"," +
            "\\\"2283296\\\",\\\"15844764\\\",\\\"5610435\\\",\\\"434734521\\\",\\\"802991\\\",\\\"25911961\\\",\\\"25333161\\\",\\\"375375\\\"," +
            "\\\"22553659\\\",\\\"251598698\\\",\\\"24911972\\\",\\\"258150656\\\",\\\"97177641\\\",\\\"9458053\\\",\\\"410970841\\\"," +
            "\\\"617285\\\"," +
            "\\\"18706318\\\",\\\"3066511\\\",\\\"43582057\\\",\\\"213845897\\\",\\\"7206526\\\",\\\"6312652\\\",\\\"6249909\\\",\\\"18346679\\\"," +
            "\\\"194046502\\\",\\\"3687500\\\",\\\"2498733\\\",\\\"692233\\\",\\\"398510\\\",\\\"1398826\\\",\\\"2280133\\\",\\\"51766\\\"," +
            "\\\"631821\\\",\\\"379882296\\\",\\\"26817572\\\",\\\"17819768\\\",\\\"5818410\\\",\\\"77107566\\\",\\\"10451557\\\",\\\"28348490\\\"," +
            "\\\"22471888\\\",\\\"50844167\\\",\\\"48648770\\\",\\\"266458066\\\",\\\"17638509\\\",\\\"255709\\\",\\\"916330\\\",\\\"8993755\\\"," +
            "\\\"1584050\\\",\\\"447071\\\",\\\"387822938\\\",\\\"6672592\\\",\\\"124580901\\\",\\\"35640494\\\",\\\"8934654\\\",\\\"20615621\\\"," +
            "\\\"19380926\\\",\\\"2192108\\\",\\\"286627656\\\",\\\"26003646\\\",\\\"39642124\\\",\\\"21566853\\\",\\\"13578768\\\"," +
            "\\\"7792521\\\"," +
            "\\\"38640369\\\",\\\"1398957\\\",\\\"8435245\\\",\\\"763712\\\",\\\"4128618\\\",\\\"27340452\\\",\\\"131111\\\",\\\"22661257\\\"," +
            "\\\"11997177\\\",\\\"2884629\\\",\\\"34189415\\\",\\\"2989565\\\",\\\"283538\\\",\\\"38887677\\\",\\\"222303619\\\",\\\"101376123\\\"," +
            "\\\"356798697\\\",\\\"4320540\\\",\\\"10119428\\\",\\\"79061224\\\",\\\"295711424\\\",\\\"15324420\\\",\\\"3539610\\\"," +
            "\\\"38591353\\\"," +
            "\\\"12360828\\\",\\\"16794231\\\",\\\"16973851\\\",\\\"24797036\\\",\\\"34858100\\\",\\\"122879\\\",\\\"14781644\\\",\\\"14916750\\\"," +
            "\\\"287003199\\\",\\\"335590164\\\",\\\"19071708\\\",\\\"52806762\\\",\\\"1599822\\\",\\\"59905809\\\",\\\"32708506\\\"," +
            "\\\"17510830\\\"," +
            "\\\"23262293\\\",\\\"5374954\\\",\\\"8047632\\\",\\\"20165629\\\",\\\"2827946\\\",\\\"44473221\\\",\\\"111228058\\\",\\\"15460461\\\"," +
            "\\\"3025606\\\",\\\"89395036\\\",\\\"27405747\\\",\\\"105232248\\\",\\\"3380239\\\",\\\"20846810\\\",\\\"9090390\\\",\\\"33597326\\\"," +
            "\\\"326115\\\",\\\"2735222\\\",\\\"881546\\\",\\\"26312775\\\",\\\"37607556\\\",\\\"24314825\\\",\\\"10055690\\\",\\\"20503549\\\"," +
            "\\\"30222764\\\",\\\"111161461\\\"]\",\"vip_avatar_subscript\":\"1\",\"site_id\":\"44\",\"msgDepth\":\"1\"," +
            "\"end_date\":\"20191219000000\",\"birthday\":\"\",\"msgType\":\"1\",\"gender\":\"保密\",\"vip_label_text\":\"年度大会员\"," +
            "\"vip_nickname_color\":\"#FB7299\",\"user_name\":\"推背兔の\",\"mid\":\"96070394\",\"follower_count\":\"633887\",\"vip_label_path\":\"\"," +
            "\"uid\":\"96070394\",\"vip_type\":\"2\",\"cat_id\":\"4\",\"lang\":\"\",\"coins_count\":\"0\",\"start_date\":\"20101211000000\"," +
            "\"notice\":\"二次创作音频标明来源可以直接使用\",\"_CT_\":\"1594283703042\",\"pendant_expire\":\"0\",\"nameplate_name\":\"黄绿合战EX\"," +
            "\"nameplate_nid\":\"87\",\"item_id\":\"96070394\",\"official_role\":\"1\",\"fans_badge\":\"false\",\"time_zone\":\"null\"," +
            "\"likes_count\":\"6857282\",\"nameplate_condition\":\"入选黄绿合战并获得优秀作品奖\",\"site\":\"哔哩哔哩\",\"avatar_url\":\"http://i0.hdslb" +
            ".com/bfs/face/db356930131b40a4c457b29e393a1b1999fee477.jpg\",\"nameplate_level\":\"稀有勋章\",\"jointime\":\"0\",\"vip_status\":\"1\"," +
            "\"taskId\":\"1336202\",\"official_desc\":\"\"}";


    public static final String weiboComment1 = "{\"jobName\":\"storage_test_20200821135025_375_54\",\"end_date\":\"20200820000000\"," +
            "\"msgType\":\"1\",\"_CT_\":\"1597989043863\",\"_kafka_data_type_\":\"comment\",\"mid\":\"4506597189507819\",\"time_zone\":\"null\"," +
            "\"update_date\":\"20200821135043\",\"uid\":\"5861228754\",\"site\":\"新浪微博\",\"crawler\":\"111275\",\"sourceCrawlerId\":\"111275\"," +
            "\"parent_id\":\"4506597051632966\",\"is_comment\":\"1\",\"cat_id\":\"9\",\"site_id\":\"101993\",\"json\":\"{\\\"createdAt\\\":\\\"May " +
            "20, 2020 9:59:21 AM\\\",\\\"id\\\":4506597189507819,\\\"mid\\\":\\\"4506597189507819\\\",\\\"idstr\\\":\\\"4506597189507819\\\"," +
            "\\\"text\\\":\\\"咳502\\\",\\\"source\\\":\\\"\\\",\\\"status\\\":{\\\"user\\\":{\\\"id\\\":\\\"2739134804\\\"," +
            "\\\"screenName\\\":\\\"\\\",\\\"name\\\":\\\"陈曦骏\\\",\\\"province\\\":31,\\\"city\\\":1000,\\\"location\\\":\\\"上海\\\"," +
            "\\\"description\\\":\\\"中国诗词大会七夕专场冠军 上海诗词学会会员 一站到底名人堂\\\",\\\"url\\\":\\\"\\\",\\\"profileImageUrl\\\":\\\"\\\"," +
            "\\\"userDomain\\\":\\\"\\\",\\\"gender\\\":\\\"m\\\",\\\"followersCount\\\":0,\\\"friendsCount\\\":0,\\\"statusesCount\\\":0," +
            "\\\"favouritesCount\\\":0,\\\"following\\\":false,\\\"verified\\\":true,\\\"verifiedType\\\":0,\\\"allowAllActMsg\\\":false," +
            "\\\"allowAllComment\\\":false,\\\"followMe\\\":false,\\\"avatarLarge\\\":\\\"\\\",\\\"onlineStatus\\\":0,\\\"biFollowersCount\\\":0," +
            "\\\"lang\\\":\\\"zh-cn\\\",\\\"verifiedReason\\\":\\\"\\\",\\\"weihao\\\":\\\"\\\",\\\"statusId\\\":\\\"\\\"," +
            "\\\"verifiedTypeExt\\\":0},\\\"id\\\":\\\"4506597051632966\\\",\\\"mid\\\":\\\"4506597051632966\\\",\\\"idstr\\\":4506597051632966," +
            "\\\"text\\\":\\\"【诗说#520# 礼物】520送502:如胶似漆\\\\n   " +
            "为什么在520会提到送502" +
            "呢，这可能是个段子，但这个段子在诗中却颇有来历。在东汉五言诗《古诗十九首》“客从远方来”中有句：“著以长相思，缘以结不解。以胶投漆中，谁能别离此。”意思是想要如合欢被子一样永远的相思，让我们姻缘不会散去。不如你和我互为胶漆，彼此相融，固结让我们永远在一起。这就是成语如胶似漆的出处之一。\\\\n  #国学新青年# 们还不快去用502去表白虽然#古代情诗都是骗人的# 能帮你到这里了。@微博国学 @微博节日\\\",\\\"source\\\":{\\\"url\\\":\\\"name\\\",\\\"relationShip\\\":\\\"iPhone 11 Pro(暗夜绿)\\\",\\\"name\\\":\\\",\\\\\\\"relationShip\\\\\\\":\\\\\\\"nofollow\\\\\\\",\\\\\\\"url\\\\\\\":\\\\\\\"https://new.vip.weibo.cn/tail/introduction\\\\\\\"}\\\"},\\\"favorited\\\":false,\\\"truncated\\\":false,\\\"inReplyToStatusId\\\":-1,\\\"inReplyToUserId\\\":-1,\\\"inReplyToScreenName\\\":\\\"\\\",\\\"thumbnailPic\\\":\\\"\\\",\\\"bmiddlePic\\\":\\\"\\\",\\\"originalPic\\\":\\\"\\\",\\\"geo\\\":\\\"null\\\",\\\"latitude\\\":-1.0,\\\"longitude\\\":-1.0,\\\"repostsCount\\\":0,\\\"commentsCount\\\":32,\\\"attitudesCount\\\":65,\\\"annotations\\\":\\\"[{\\\\\\\"client_mblogid\\\\\\\":\\\\\\\"iPhone-F9D647B5-35A8-418E-8D54-F452BA1AE9D5\\\\\\\"},{\\\\\\\"mapi_request\\\\\\\":true}]\\\",\\\"mlevel\\\":0,\\\"feature\\\":0,\\\"visible\\\":{\\\"type\\\":0,\\\"list_id\\\":0}},\\\"targetUid\\\":\\\"2739134804\\\",\\\"rootCommentId\\\":\\\"4506597189507819\\\",\\\"isFromLoyalFans\\\":true,\\\"attitudesCount\\\":666,\\\"commentsCount\\\":455,\\\"user\\\":{\\\"id\\\":\\\"5861228754\\\",\\\"screenName\\\":\\\"吾爱筱白\\\",\\\"name\\\":\\\"吾爱筱白\\\",\\\"province\\\":37,\\\"city\\\":1000,\\\"location\\\":\\\"山东\\\",\\\"description\\\":\\\"第14届中国中学生作文大赛二等奖。荣获市级“诗文朗诵小名士”“感恩小明星”等称号\\\",\\\"url\\\":\\\"\\\",\\\"profileImageUrl\\\":\\\"https://tvax4.sinaimg.cn/crop.0.0.996.996.50/006oF7lEly8gdikg1zl3wj30ro0rogo5.jpg?KID\\\\u003dimgbed,tva\\\\u0026Expires\\\\u003d1597999843\\\\u0026ssig\\\\u003dsci9nGG7zJ\\\",\\\"userDomain\\\":\\\"\\\",\\\"gender\\\":\\\"f\\\",\\\"followersCount\\\":146,\\\"friendsCount\\\":263,\\\"statusesCount\\\":316,\\\"favouritesCount\\\":32,\\\"createdAt\\\":\\\"Feb 17, 2016 5:26:27 PM\\\",\\\"following\\\":false,\\\"verified\\\":false,\\\"verifiedType\\\":-1,\\\"allowAllActMsg\\\":false,\\\"allowAllComment\\\":true,\\\"followMe\\\":false,\\\"avatarLarge\\\":\\\"https://tvax4.sinaimg.cn/crop.0.0.996.996.180/006oF7lEly8gdikg1zl3wj30ro0rogo5.jpg?KID\\\\u003dimgbed,tva\\\\u0026Expires\\\\u003d1597999843\\\\u0026ssig\\\\u003dbPujXgQnOk\\\",\\\"onlineStatus\\\":0,\\\"biFollowersCount\\\":46,\\\"lang\\\":\\\"zh-cn\\\",\\\"verifiedReason\\\":\\\"\\\",\\\"weihao\\\":\\\"\\\",\\\"statusId\\\":\\\"\\\",\\\"verifiedTypeExt\\\":0}}\",\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[\\\"10\\\"]\",\"lang\":\"\",\"publish_date\":\"20200520095921\",\"taskId\":\"2343033\",\"msgDepth\":\"1\",\"start_date\":\"20200101000000\"}\n";


    public static final String VIDEO_USER_TEST_DATA2 = "{\"_CT_\":\"1594697849622\",\"_html_\":\"避免过长，省略...\",\"_kafka_data_type_\":\"user\"," +
            "\"avatar_url\":\"http://i0.hdslb.com/bfs/face/77c893d62f17a3a12df40262d25c24ddebc29157.jpg\",\"birthday\":\"10-14\",\"cat_id\":\"4\"," +
            "\"coins_count\":\"0\",\"end_date\":\"20200714024819\",\"fans_badge\":\"false\",\"follower_count\":\"166\",\"following_count\":\"249\"," +
            "\"followings\":\"[\\\"366644820\\\",\\\"442824382\\\",\\\"352835293\\\",\\\"478310597\\\",\\\"95080790\\\",\\\"293697666\\\"," +
            "\\\"485821637\\\",\\\"383009679\\\",\\\"17125638\\\",\\\"245627923\\\",\\\"355304803\\\",\\\"8021435\\\",\\\"18744023\\\"," +
            "\\\"212407011\\\",\\\"470156882\\\",\\\"348656633\\\",\\\"513279363\\\",\\\"423311333\\\",\\\"7926622\\\",\\\"24801003\\\"," +
            "\\\"501964398\\\",\\\"95657639\\\",\\\"393678541\\\",\\\"528816146\\\",\\\"13234137\\\",\\\"6179633\\\",\\\"13733433\\\"," +
            "\\\"7851933\\\",\\\"512574759\\\",\\\"31681477\\\",\\\"37663924\\\",\\\"89944567\\\",\\\"421207274\\\",\\\"34853276\\\"," +
            "\\\"6529759\\\",\\\"365234696\\\",\\\"437316738\\\",\\\"345936607\\\",\\\"315523348\\\",\\\"21474226\\\",\\\"287051252\\\"," +
            "\\\"315877262\\\",\\\"340223423\\\",\\\"97177641\\\",\\\"430510309\\\",\\\"106105660\\\",\\\"313530204\\\",\\\"408029191\\\"," +
            "\\\"408487386\\\",\\\"485571419\\\",\\\"477745885\\\",\\\"514628545\\\",\\\"32758016\\\",\\\"20695818\\\",\\\"92568184\\\"," +
            "\\\"27880221\\\",\\\"481393564\\\",\\\"499495201\\\",\\\"456606920\\\",\\\"178033649\\\",\\\"398487417\\\",\\\"391774002\\\"," +
            "\\\"313551414\\\",\\\"517327498\\\",\\\"101344045\\\",\\\"402421598\\\",\\\"485671471\\\",\\\"50233288\\\",\\\"31654362\\\"," +
            "\\\"410964\\\",\\\"9077268\\\",\\\"31605260\\\",\\\"85364566\\\",\\\"328531988\\\",\\\"439248351\\\",\\\"3066511\\\",\\\"11870568\\\"," +
            "\\\"291415305\\\",\\\"88461692\\\",\\\"350622305\\\",\\\"416128940\\\",\\\"25422790\\\",\\\"59476849\\\",\\\"265059948\\\"," +
            "\\\"397804033\\\",\\\"359169428\\\",\\\"500417536\\\",\\\"449825072\\\",\\\"113791\\\",\\\"21778636\\\",\\\"19577966\\\"," +
            "\\\"384816003\\\",\\\"95934386\\\",\\\"25706078\\\",\\\"361399508\\\",\\\"31208553\\\",\\\"472582860\\\",\\\"374775452\\\"," +
            "\\\"440304364\\\",\\\"38695356\\\",\\\"67109379\\\",\\\"653736\\\",\\\"11372248\\\",\\\"484306201\\\",\\\"444339642\\\"," +
            "\\\"37090048\\\",\\\"335320968\\\",\\\"281678215\\\",\\\"330383888\\\",\\\"243659434\\\",\\\"32820037\\\",\\\"347667464\\\"," +
            "\\\"14254182\\\",\\\"193170725\\\",\\\"67141499\\\",\\\"39627524\\\",\\\"11684621\\\",\\\"1858682\\\",\\\"254463269\\\"," +
            "\\\"213845897\\\",\\\"277257\\\",\\\"36081646\\\",\\\"297242063\\\",\\\"258150656\\\",\\\"3242597\\\",\\\"451320374\\\"," +
            "\\\"12963617\\\",\\\"86566982\\\",\\\"32449565\\\",\\\"223146252\\\",\\\"14047839\\\",\\\"272712050\\\",\\\"390371228\\\"," +
            "\\\"9458053\\\",\\\"50212909\\\",\\\"8990248\\\",\\\"383003\\\",\\\"219880889\\\",\\\"375375\\\",\\\"546195\\\",\\\"59552525\\\"," +
            "\\\"45478017\\\",\\\"316424496\\\",\\\"11621626\\\",\\\"13127303\\\",\\\"294081438\\\",\\\"440487366\\\",\\\"318355178\\\"," +
            "\\\"34362799\\\",\\\"392991395\\\",\\\"326427334\\\",\\\"218610189\\\",\\\"19286458\\\",\\\"450771942\\\",\\\"405017558\\\"," +
            "\\\"37408712\\\",\\\"31786665\\\",\\\"28767705\\\",\\\"286443806\\\",\\\"31880257\\\",\\\"29381416\\\",\\\"86439234\\\"," +
            "\\\"13351110\\\",\\\"18902951\\\",\\\"312030557\\\",\\\"232472043\\\",\\\"39847479\\\",\\\"407045223\\\",\\\"1913389\\\"," +
            "\\\"339233162\\\",\\\"397012344\\\",\\\"37291782\\\",\\\"393677428\\\",\\\"333148888\\\",\\\"17138783\\\",\\\"290515513\\\"," +
            "\\\"325272035\\\",\\\"358422\\\",\\\"33677845\\\",\\\"25876945\\\",\\\"9247173\\\",\\\"205795482\\\",\\\"246196818\\\"," +
            "\\\"24738601\\\",\\\"865267\\\",\\\"29959830\\\",\\\"20165629\\\",\\\"13003999\\\",\\\"383695360\\\",\\\"31081305\\\"," +
            "\\\"319945196\\\",\\\"327616715\\\",\\\"319172384\\\",\\\"20503549\\\",\\\"12633655\\\",\\\"205141630\\\",\\\"1963756\\\"," +
            "\\\"30673144\\\",\\\"129259501\\\",\\\"347441270\\\",\\\"177613639\\\",\\\"4345670\\\",\\\"6443472\\\",\\\"345925885\\\"," +
            "\\\"32786875\\\",\\\"8041017\\\",\\\"28152409\\\",\\\"100825369\\\",\\\"35457892\\\",\\\"163637592\\\",\\\"129802844\\\"," +
            "\\\"86350275\\\",\\\"334890551\\\",\\\"287795639\\\",\\\"25910292\\\",\\\"794267\\\",\\\"157593375\\\",\\\"8372353\\\"," +
            "\\\"5621746\\\",\\\"8047632\\\",\\\"96145884\\\",\\\"266615979\\\",\\\"95515699\\\",\\\"124506289\\\",\\\"9321359\\\"," +
            "\\\"174014554\\\",\\\"7458285\\\",\\\"232004204\\\",\\\"176037767\\\",\\\"35415067\\\",\\\"883968\\\",\\\"110683415\\\"," +
            "\\\"8969156\\\",\\\"31256816\\\",\\\"7388950\\\",\\\"40277880\\\",\\\"3766866\\\",\\\"476185\\\",\\\"110974\\\",\\\"946974\\\"," +
            "\\\"23920239\\\",\\\"96194615\\\",\\\"1532165\\\",\\\"10710994\\\",\\\"8482768\\\",\\\"11722013\\\",\\\"24510324\\\",\\\"52239319\\\"," +
            "\\\"11336264\\\"]\",\"gender\":\"保密\",\"interfaceIdList\":\"[]\",\"jobName\":\"bilibili_user_20200714024819_478_42\"," +
            "\"jointime\":\"0\",\"lang\":\"\",\"level\":\"5\",\"likes_count\":\"452\",\"mid\":\"147530525\",\"month_elec_count\":\"0\"," +
            "\"moral\":\"0\",\"msgDepth\":\"1\",\"msgType\":\"1\",\"nameplate_condition\":\"转载视频投稿通过总数>=10\",\"nameplate_image\":\"http://i2.hdslb" +
            ".com/bfs/face/8478fb7c54026cd47f09daa493a1b1683113a90d.png\",\"nameplate_image_small\":\"http://i1.hdslb" +
            ".com/bfs/face/50eef47c3a30a75659d3cc298cfb09031d1a2ce5.png\",\"nameplate_level\":\"普通勋章\",\"nameplate_name\":\"见习搬运工\"," +
            "\"nameplate_nid\":\"7\",\"notice\":\"\",\"official_desc\":\"\",\"official_role\":\"0\",\"official_title\":\"\"," +
            "\"official_type\":\"-1\",\"pendant_expire\":\"0\",\"pendant_image\":\"\",\"pendant_image_enhance\":\"\",\"pendant_name\":\"\"," +
            "\"pendant_pid\":\"0\",\"play_count\":\"55950\",\"rank\":\"10000\",\"sign\":\"划水摸鱼～（一个不正经的Up）\",\"silence\":\"0\",\"site\":\"哔哩哔哩\"," +
            "\"site_id\":\"44\",\"sourceCrawlerId\":\"111437\",\"start_date\":\"20200708032456\",\"taskId\":\"2341969\",\"time_zone\":\"null\"," +
            "\"top_photo\":\"http://i2.hdslb.com/bfs/space/c919a9818172a8297f8b0597722f96504a1e1d88.png\",\"total_elec_count\":\"0\"," +
            "\"uid\":\"147530525\",\"update_date\":\"20200714113729\",\"user_name\":\"行星HOA\",\"video_types\":\"[{\\\"tid\\\":160,\\\"count\\\":4," +
            "\\\"name\\\":\\\"生活\\\"},{\\\"tid\\\":177,\\\"count\\\":1,\\\"name\\\":\\\"纪录片\\\"},{\\\"tid\\\":181,\\\"count\\\":14," +
            "\\\"name\\\":\\\"影视\\\"},{\\\"tid\\\":3,\\\"count\\\":2,\\\"name\\\":\\\"音乐\\\"}]\",\"vip_avatar_subscript\":\"0\"," +
            "\"vip_label_label_theme\":\"\",\"vip_label_path\":\"\",\"vip_label_text\":\"\",\"vip_nickname_color\":\"\",\"vip_status\":\"0\"," +
            "\"vip_theme_type\":\"0\",\"vip_type\":\"1\"}";

    public static final String VIDEO_USER_TEST_DATA = "{\"sign\":\"手残渣渣拖延症晚期。喜欢我的作品就点下关注收藏吧。群号365292979（限群内邀请） 商务合作Q228966319\"," +
            "\"vip_label_label_theme\":\"annual_vip\",\"pendant_pid\":\"1887\",\"pendant_image\":\"http://i0.hdslb" +
            ".com/bfs/garb/item/0688b6bcc9e5e96a19a2b91594774e71b0cf9d2a.png\",\"moral\":\"0\",\"pendant_name\":\"公主连结佩可莉姆\"," +
            "\"video_types\":\"[{\\\"tid\\\":1,\\\"count\\\":3,\\\"name\\\":\\\"动画\\\"},{\\\"tid\\\":13,\\\"count\\\":61,\\\"name\\\":\\\"番剧\\\"}," +
            "{\\\"tid\\\":160,\\\"count\\\":8,\\\"name\\\":\\\"生活\\\"},{\\\"tid\\\":181,\\\"count\\\":4,\\\"name\\\":\\\"影视\\\"},{\\\"tid\\\":3," +
            "\\\"count\\\":24,\\\"name\\\":\\\"音乐\\\"},{\\\"tid\\\":36,\\\"count\\\":1,\\\"name\\\":\\\"知识\\\"},{\\\"tid\\\":4,\\\"count\\\":118," +
            "\\\"name\\\":\\\"游戏\\\"},{\\\"tid\\\":5,\\\"count\\\":8,\\\"name\\\":\\\"娱乐\\\"}]\",\"official_title\":\"\",\"rank\":\"10000\"," +
            "\"_html_\":\"避免过长，省略...\",\"nameplate_image\":\"http://i2.hdslb.com/bfs/face/3f2d64f048b39fb6c26f3db39df47e6080ec0f9c.png\"," +
            "\"interfaceIdList\":\"[]\",\"silence\":\"0\",\"month_elec_count\":\"0\",\"nameplate_image_small\":\"http://i1.hdslb" +
            ".com/bfs/face/90c35d41d8a19b19474d6bac672394c17b444ce8.png\",\"total_elec_count\":\"13\",\"vip_theme_type\":\"0\"," +
            "\"top_photo\":\"http://i1.hdslb.com/bfs/space/a03bab135e9a9b8147c6a8cbf0537739d605ecbb.png\"," +
            "\"jobName\":\"bilibili_tmp_20200708161437_747_81\",\"unique_id\":\"4306167623452345678987654d8\",\"level\":\"6\"," +
            "\"_kafka_data_type_\":\"user\",\"play_count\":\"1388158\",\"update_date\":\"20200708161454\",\"official_type\":\"-1\"," +
            "\"crawler\":\"111437\",\"sourceCrawlerId\":\"111437\",\"pendant_image_enhance\":\"http://i0.hdslb" +
            ".com/bfs/garb/item/0688b6bcc9e5e96a19a2b91594774e71b0cf9d2a.png\",\"following_count\":\"93\",\"followings\":\"[\\\"471792754\\\"," +
            "\\\"326499679\\\",\\\"253443757\\\",\\\"1111111111111\\\",\\\"436373616\\\",\\\"174501086\\\",\\\"401742377\\\",\\\"22017969\\\"," +
            "\\\"420763129\\\"," +
            "\\\"12057926\\\",\\\"372302905\\\",\\\"7879750\\\",\\\"394606820\\\",\\\"454719565\\\",\\\"393166851\\\",\\\"106685726\\\"," +
            "\\\"888177\\\",\\\"7303483\\\",\\\"11264229\\\",\\\"3353026\\\",\\\"436175352\\\",\\\"434391603\\\",\\\"177827162\\\"," +
            "\\\"480661762\\\",\\\"482522195\\\",\\\"44688866\\\",\\\"28346875\\\",\\\"220116239\\\",\\\"278761367\\\",\\\"29063942\\\"," +
            "\\\"318223\\\",\\\"383444910\\\",\\\"397076059\\\",\\\"12444306\\\",\\\"1871001\\\",\\\"25144918\\\",\\\"11131476\\\"," +
            "\\\"37090749\\\",\\\"2108856\\\",\\\"23791643\\\",\\\"174070934\\\",\\\"57863910\\\",\\\"441833336\\\",\\\"903988\\\",\\\"4059920\\\"," +
            "\\\"103073257\\\",\\\"320818292\\\",\\\"31700507\\\",\\\"161394913\\\",\\\"29554413\\\",\\\"33991736\\\",\\\"29329085\\\"," +
            "\\\"1756453\\\",\\\"30008155\\\",\\\"428213198\\\",\\\"5178080\\\",\\\"18440268\\\",\\\"197943373\\\",\\\"442869956\\\"," +
            "\\\"389327650\\\",\\\"16819263\\\",\\\"325132097\\\",\\\"52139814\\\",\\\"897486\\\",\\\"172860575\\\",\\\"6574487\\\"," +
            "\\\"14781644\\\",\\\"32333493\\\",\\\"251598698\\\",\\\"11357018\\\",\\\"5551\\\",\\\"14608463\\\",\\\"325129256\\\",\\\"11115509\\\"," +
            "\\\"69221252\\\",\\\"9429290\\\",\\\"43536\\\",\\\"2776060\\\",\\\"1110357\\\",\\\"255468\\\",\\\"40389553\\\",\\\"19942518\\\"," +
            "\\\"35643203\\\",\\\"684169\\\",\\\"374377\\\",\\\"10794280\\\",\\\"1442000\\\",\\\"7391373\\\",\\\"13979384\\\",\\\"643744\\\"," +
            "\\\"21453565\\\",\\\"1492\\\",\\\"2976992\\\",\\\"4162287\\\"]\",\"vip_avatar_subscript\":\"1\",\"site_id\":\"44\",\"msgDepth\":\"1\"," +
            "\"end_date\":\"20201220000000\",\"birthday\":\"01-08\",\"msgType\":\"1\",\"gender\":\"男\",\"vip_label_text\":\"年度大会员\"," +
            "\"vip_nickname_color\":\"#FB7299\",\"user_name\":\"黑犬nina\",\"mid\":\"6028392\",\"follower_count\":\"9064\",\"vip_label_path\":\"\"," +
            "\"uid\":\"6028392\",\"vip_type\":\"2\",\"cat_id\":\"4\",\"lang\":\"\",\"coins_count\":\"0\",\"start_date\":\"20191201000000\"," +
            "\"notice\":\"主攻乙女向，蔷薇向游戏，抓马偶尔安利，偶尔直播，正在努力不做动态流。喜欢玩什么发什么很随意，不喜勿喷，平时脾气还好，嘴巴很坏很损，so不招我基本是个好接触的类型。有问题欢迎私敲留言，拒绝一切BP要资源，不换特典不换音源，请自觉绕行。\"," +
            "\"_CT_\":\"1594196094272\",\"pendant_expire\":\"0\",\"nameplate_name\":\"出道偶像\",\"nameplate_nid\":\"9\",\"item_id\":\"6028392\"," +
            "\"official_role\":\"0\",\"fans_badge\":\"true\",\"time_zone\":\"null\",\"url\":\"https://space.bilibili.com/6028392\"," +
            "\"likes_count\":\"59681\",\"nameplate_condition\":\"所有自制视频总播放数\\u003e\\u003d50万\",\"site\":\"哔哩哔哩\",\"avatar_url\":\"http://i0.hdslb" +
            ".com/bfs/face/f65030bca49055819127bd1bbc7906333d13b167.jpg\",\"nameplate_level\":\"高级勋章\",\"jointime\":\"0\",\"vip_status\":\"1\"," +
            "\"taskId\":\"6673033\",\"official_desc\":\"\"}";


    public static final String NewFouPost0 = "{\"msgType\":\"1\",\"title\":\"sd from home, 我發覺我寧願番公司\"," +
            "\"content\":\"免費冷氣，免費上網，免費充電，免費食水，免費廁紙，免費文具，重有個免費工人清潔。\",\"image_url_list\":\"[\\\"https://www.discuss.com" +
            ".hk/images/smilies/default/lol.gif\\\"]\",\"page_id\":\"3d1280b63ec019b52f35758231198f95\",\"cat_id\":\"2\",\"_html_\":\"避免过长，省略...\"," +
            "\"interfaceIdList\":\"[]\",\"jobName\":\"increment_job_20200721115354_506_43\",\"_CT_\":\"1595303802697\",\"full_url\":\"https://www" +
            ".discuss.com.hk/forumdisplay.php?fid\\u003d408\\u0026filter\\u003d0\\u0026orderby\\u003ddateline\\u0026ascdesc\\u003dDESC\"," +
            "\"item_id\":\"23456YUHGFRW345672332d2\",\"author22\":\"星星同學會22\",\"_kafka_data_type_\":\"post\"," +
            "\"time_zone\":\"Asia/Shanghai\",\"update_date\":\"20200721115642\",\"url\":\"https://www.discuss.com.hk/viewthread" +
            ".php?tid\\u003d29235816\",\"site\":\"澳门讨论区\",\"is_main_post\":\"0\",\"sourceCrawlerId\":\"24827\"," +
            "\"parent_item_id\":\"3d1280b63ec019b52f35758231198f95\",\"site_id\":\"3433\",\"publish_date\":\"20200720062400\"," +
            "\"taskId\":\"1228232\",\"msgDepth\":\"2\"}";


    public static final String NewFouPostPri1 = "{\"msgType\":\"1\",\"title\":\"公司話Work from home, 我發覺我寧願番公司\"," +
            "\"content\":\"免費冷氣，免費上網，免費充電，免費食水，免費廁紙，免費文具，重有個免費工人清潔。\",\"image_url_list\":\"[\\\"https://www.discuss.com" +
            ".hk/images/smilies/default/lol.gif\\\"]\",\"page_id\":\"3d1280b63ec019b52f35758231198f95\",\"cat_id\":\"2\",\"_html_\":\"避免过长，省略...\"," +
            "\"interfaceIdList\":\"[]\",\"jobName\":\"increment_job_20200721115354_506_43\",\"_CT_\":\"1595303802697\",\"full_url\":\"https://www" +
            ".discuss.com.hk/forumdisplay.php?fid\\u003d408\\u0026filter\\u003d0\\u0026orderby\\u003ddateline\\u0026ascdesc\\u003dDESC\"," +
            "\"item_id\":\"1174d1adc8e3ed5ce61712f96eedfad6\",\"author\":\"星星同學會\",\"_kafka_data_type_\":\"comment\"," +
            "\"time_zone\":\"Asia/Shanghai\",\"update_date22\":\"20200721115642\",\"url\":\"https://www.discuss.com.hk/viewthread" +
            ".php?tid\\u003d29235816\",\"site\":\"香港讨论区\",\"is_main_post\":\"0\",\"sourceCrawlerId\":\"24827\"," +
            "\"parent_item_id\":\"3d1280b63ec019b52f35758231198f95\",\"site_id\":\"1228164\",\"publish_date\":\"20200720062400\"," +
            "\"taskId\":\"1228232\",\"msgDepth\":\"2\"}";

    public static final String NewFouPostPri0 = "{\"msgType\":\"1\",\"title\":\"22222222公司話Work from home, 我發覺我寧願番公司\"," +
            "\"content\":\"免費冷氣，免費上網，免費充電，免費食水，免費廁紙，免費文具，重有個免費工人清潔。\",\"image_url_list\":\"[\\\"https://www.discuss.com" +
            ".hk/images/smilies/default/lol.gif\\\"]\",\"page_id\":\"3d1280b63ec019b52f35758231198f95\",\"cat_id\":\"2\",\"_html_\":\"避免过长，省略...\"," +
            "\"interfaceIdList\":\"[]\",\"jobName\":\"increment_job_20200721115354_506_43\",\"_CT_\":\"1595303802697\",\"full_url\":\"https://www" +
            ".discuss.com.hk/forumdisplay.php?fid\\u003d408\\u0026filter\\u003d0\\u0026orderby\\u003ddateline\\u0026ascdesc\\u003dDESC\"," +
            "\"item_id\":\"23456YUHGFRW345672332d2\",\"author22\":\"星星同學會22\",\"_kafka_data_type_\":\"comment\"," +
            "\"time_zone\":\"Asia/Shanghai\",\"update_date\":\"20200721115642\",\"url\":\"https://www.discuss.com.hk/viewthread" +
            ".php?tid\\u003d29235816\",\"site\":\"香港讨论区\",\"is_main_post\":\"0\",\"sourceCrawlerId\":\"24827\"," +
            "\"parent_item_id\":\"3d1280b63ec019b52f35758231198f95\",\"site_id\":\"1228164\",\"publish_date\":\"20200720062400\"," +
            "\"taskId\":\"1228232\",\"msgDepth\":\"2\"}";

    public static final String NewFouPostPri2 = "{\"msgType\":\"1\",\"title\":\"公司話Work from home, 我發覺我寧願番公司\"," +
            "\"content\":\"免費冷氣，免費上網，免費充電，免費食水，免費廁紙，免費文具，重有個免費工人清潔。\",\"image_url_list\":\"[\\\"https://www.discuss.com" +
            ".hk/images/smilies/default/lol.gif\\\"]\",\"page_id\":\"3d1280b63ec019b52f35758231198f95\",\"cat_id\":\"2\",\"_html_\":\"避免过长，省略...\"," +
            "\"interfaceIdList\":\"[]\",\"jobName\":\"increment_job_20200721115354_506_43\",\"_CT_\":\"1595303802697\",\"full_url\":\"https://www" +
            ".discuss.com.hk/forumdisplay.php?fid\\u003d408\\u0026filter\\u003d0\\u0026orderby\\u003ddateline\\u0026ascdesc\\u003dDESC\"," +
            "\"item_id\":\"1174d1adc8e3ed5ce61712f96eedfad6\",\"author\":\"星星同學會\",\"_kafka_data_type_\":\"comment\"," +
            "\"time_zone\":\"Asia/Shanghai\",\"update_date\":\"20200721115642\",\"url\":\"https://www.discuss.com.hk/viewthread" +
            ".php?tid\\u003d29235816\",\"site\":\"香港讨论区\",\"is_main_post\":\"0\",\"sourceCrawlerId\":\"24827\"," +
            "\"parent_item_id\":\"3d1280b63ec019b52f35758231198f95\",\"site_id\":\"1228161\",\"publish_date\":\"20200720062400\"," +
            "\"taskId\":\"1228232\",\"msgDepth\":\"2\"}";


    public static final String NewFouPostType = "{\"end_date\":\"2020-06-24 09:56:00.0\",\"msgType\":\"1\",\"review_count\":\"576\"," +
            "\"ext_review_count\":\"578\",\"title\":\"mysql_is_very_nice_biu\",\"content\":\"mysql_is_very_nice_biu\"," +
            "\"image_url_list\":\"[\\\"http://tiebapic.baidu" +
            ".com/forum/w%3D580/sign\\\\u003d80029d1b15087bf47dec57e1c2d2575e/190e4eed2e738bd42e8b1061b68b87d6267ff977.jpg\\\",\\\"http://tiebapic" +
            ".baidu.com/forum/w%3D580/sign\\\\u003df121e85e7009c93d07f20effaf3cf8bb/0f056881800a19d88408265524fa828ba71e4695.jpg\\\"," +
            "\\\"http://tiebapic.baidu.com/forum/w%3D580/sign\\\\u003df121e85e7009c93d07f20effaf3cf8bb/0f056881800a19d88408265524fa828ba71e4695" +
            ".jpg\\\",\\\"http://tiebapic.baidu.com/forum/w%3D580/sign\\\\u003d980510f4b3c27d1ea5263bcc2bd4adaf" +
            "/a4b3cd3d70cf3bc7d3076fbcc600baa1cc112a91.jpg\\\"]\",\"page_id\":\"d33796f3cc39d4dec424751c68ced5a6\",\"cat_id\":\"2\"," +
            "\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[]\",\"lang\":\"\",\"start_date\":\"2020-06-24 09:46:00.0\"," +
            "\"jobName\":\"we_media_20200624095615_828_45\",\"_CT_\":\"1592963835704\",\"like_count\":\"0\",\"full_url\":\"https://tieba.baidu" +
            ".com/f?ie\\u003dutf-8\\u0026kw\\u003d%e8%8b%b1%e9%9b%84%e8%81%94%e7%9b%9f\\u0026fr\\u003dsearch\"," +
            "\"item_id\":\"d33796f3cc39d4dec424751c68ced5a6\",\"other_data\":\"{\\\"forum_name\\\":\\\"英雄联盟吧\\\",\\\"floor\\\":\\\"1\\\"}\"," +
            "\"author\":\"QRci246\",\"_kafka_data_type_\":\"post\",\"time_zone\":\"PRC\",\"update_date\":\"20200624095715\",\"url\":\"http://tieba" +
            ".baidu.com/p/6768046389?pn\\u003d1\",\"is_top\":\"1090\",\"share_count\":\"0\",\"site\":\"百度贴吧\",\"is_main_post\":\"1\"," +
            "\"sourceCrawlerId\":\"788\",\"forum_name\":\"一切都开心吧\",\"site_id\":\"101537\",\"comment_pages\":\"1\",\"is_digest\":\"0\"," +
            "\"publish_date\":\"20200624094600\",\"device\":\"Android客户端\",\"taskId\":\"1202790\",\"msgDepth\":\"2\",\"post_type\":\"lives\"}";


    public static final String NewFouTet1 = "{\"msgType\":\"1\",\"review_count\":\"7\",\"user_gender\":\"m\",\"title\":\"求教各位车友，车子打不着\"," +
            "\"content\":\"求教各位车友，车子在路边停着，打了半个小时双闪后，重新发动汽车，半天打不着火，请问这是电瓶没电了吗？\",\"uid\":\"60875826\"," +
            "\"page_id\":\"d64766808fa04dba4fe6f551bd2d623f\",\"cat_id\":\"2\",\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[]\"," +
            "\"topic_id\":\"88147011\",\"user_is_vip\":\"0\",\"lang\":\"\",\"jobName\":\"increment_auto_job_20200709142043_179_11\"," +
            "\"_CT_\":\"1594279992783\",\"full_url\":\"http://club.autohome.com.cn/bbs/thread/ed2bbc4a80aee3b5/88147011-1.html\"," +
            "\"other_data\":\"{\\\"navigation\\\":\\\"逸致论坛\\\",\\\"address\\\":\\\"陕西 西安\\\",\\\"forum_name\\\":\\\"逸致论坛\\\"," +
            "\\\"car\\\":\\\"[]\\\"}\",\"item_id\":\"d64766808fa04dba4fe6f551bd2d623f\",\"author\":\"in_the_world\",\"_kafka_data_type_\":\"post\"," +
            "\"time_zone\":\"Asia/Shanghai\",\"update_date\":\"20200709153312\",\"url\":\"http://club.autohome.com" +
            ".cn/bbs/thread/ed2bbc4a80aee3b5/88147011-1.html\",\"site\":\"汽车之家论坛\",\"is_main_post\":\"1\",\"sourceCrawlerId\":\"1994\"," +
            "\"site_id\":\"102095\",\"user_level\":\"0\",\"page\":\"-1\",\"comment_pages\":\"1\",\"user_register_date\":\"20171031103500\"," +
            "\"is_digest\":\"0\",\"publish_date\":\"20200615161800\",\"taskId\":\"1338513\",\"view_count\":\"249\",\"msgDepth\":\"2\"}\n";


    public static final String NewFouTetComment = "{\"end_date\":\"20200928000000\",\"msgType\":\"1\",\"crawlerIdList\":\"1116621,24593\"," +
            "\"user_gender\":\"m\",\"title\":\"h6 max的行车记录仪怎么接线？\",\"content\":\"行车记录仪方面，根据你的车型实际情况去考虑，可以直接接线到点烟器的位置，相对来说更加安全可靠。\",\"forum_id\":\"2123\"," +
            "\"uid\":\"10549042\",\"page_id\":\"14b2c99e7a69a82f349d1b8310907529\",\"_track_count_\":\"true\",\"cat_id\":\"2\",\"_html_\":\"避免过长，省略...\"," +
            "\"interfaceIdList\":\"[]\",\"topic_id\":\"90996018\",\"user_is_vip\":\"0\",\"lang\":\"\",\"start_date\":\"20200908100000\"," +
            "\"jobName\":\"storage_test_20201104110711_973_87\",\"_CT_\":\"1604459317347\",\"full_url\":\"http://club.autohome.com" +
            ".cn/bbs/threadqa-c-2123-90996018-1.html\",\"other_data\":\"{\\\"navigation\\\":\\\"哈弗H6论坛\\\",\\\"address\\\":\\\"广东 江门\\\"," +
            "\\\"forum_name\\\":\\\"哈弗H6论坛\\\",\\\"car\\\":\\\"[]\\\",\\\"forum_id\\\":\\\"2123\\\"}\"," +
            "\"item_id\":\"83db6c3c3e862948f6e23fe9d6a392de\",\"author\":\"A7SS\",\"_kafka_data_type_\":\"comment\",\"time_zone\":\"PRC\"," +
            "\"update_date\":\"20201104110837\",\"url\":\"http://club.autohome.com.cn/bbs/threadqa-c-2123-90996018-1.html\",\"site\":\"汽车之家论坛\"," +
            "\"is_main_post\":\"0\",\"crawler\":\"1994\",\"sourceCrawlerId\":\"1994\",\"forum_name\":\"哈弗H6论坛\"," +
            "\"parent_item_id\":\"14b2c99e7a69a82f349d1b8310907529\",\"parent_id\":\"f4efb6ac58f452b1a642e3bc695a0c1d\",\"site_id\":\"102095\"," +
            "\"user_level\":\"0\",\"page\":\"-1\",\"user_register_date\":\"20140513171700\",\"publish_date\":\"20201024190300\"," +
            "\"taskId\":\"1336202\",\"msgDepth\":\"1\"}";

    public static final String NewFouTet2 = "{\"end_date\":\"20200928000000\",\"msgType\":\"1\",\"crawlerIdList\":\"1116621,24593\"," +
            "\"review_count\":\"5\",\"user_gender\":\"m\",\"title\":\"h6 max的行车记录仪怎么接线？\",\"content\":\"哪位老哥知道，要接到哪里？\",\"forum_id\":\"2123\"," +
            "\"uid\":\"202476921\",\"page_id\":\"14b2c99e7a69a82f349d1b8310907529\",\"_track_count_\":\"true\",\"cat_id\":\"2\",\"_html_\":\"避免过长，省略.." +
            ".\",\"interfaceIdList\":\"[]\",\"topic_id\":\"90996018\",\"user_is_vip\":\"0\",\"score\":\"14.24\",\"lang\":\"\"," +
            "\"start_date\":\"20200908100000\",\"jobName\":\"storage_test_20201104110711_973_87\",\"_CT_\":\"1604459317346\",\"full_url\":\"http://club" +
            ".autohome.com.cn/bbs/threadqa-c-2123-90996018-1.html\",\"other_data\":\"{\\\"navigation\\\":\\\"哈弗H6论坛\\\",\\\"address\\\":\\\"北京\\\"," +
            "\\\"forum_name\\\":\\\"华为论坛\\\",\\\"car\\\":\\\"[]\\\",\\\"forum_id\\\":\\\"2123\\\"}\"," +
            "\"item_id\":\"ff99c99e7a0098kx9d1b8310907529\",\"author\":\"北京车友m2rht4\",\"_kafka_data_type_\":\"post\",\"time_zone\":\"PRC\"," +
            "\"update_date\":\"20201104110837\",\"url\":\"http://club.autohome.com.cn/bbs/threadqa-c-2123-90996018-1.html\",\"site\":\"花粉测试\"," +
            "\"is_main_post\":\"1\",\"crawler\":\"1994\",\"sourceCrawlerId\":\"1994\",\"forum_name\":\"华为论坛-花粉测试\",\"site_id\":\"100757\"," +
            "\"user_level\":\"0\",\"page\":\"-1\",\"comment_pages\":\"1\",\"user_register_date\":\"20201012164346\",\"is_digest\":\"0\"," +
            "\"publish_date\":\"20201024185800\",\"view_count\":\"224\",\"taskId\":\"1336202\",\"msgDepth\":\"1\"}";

    public static final String xiaoHongShuNote = "{\"image_stickers\":\"[]\",\"crawlerIdList\":\"23620,100757\",\"review_count\":\"3\"," +
            "\"noteid\":\"523434000045te6ygfe45\",\"note_ats\":\"[]\",\"_track_count_\":\"true\",\"_html_\":\"避免过长，省略...\"," +
            "\"interfaceIdList\":\"[]\"," +
            "\"note_stickers\":\"[]\",\"item_title\":\"韩系写真～ \",\"jobName\":\"monitor_xhs_note_20201016082820_328_94\",\"like_count\":\"7\"," +
            "\"unique_id\":\"6yh093456bggg6234xrty28b\",\"image_url\":\"http://sns-img-qc.xhscdn" +
            ".com/dbb8fe53-adb1-3485-b462-99a6afb42be5?imageView2/2/w/1080/format/webp,http://sns-img-qc.xhscdn" +
            ".com/6fa257af-2425-3b3d-a417-ccd2a00f8caa?imageView2/2/w/1080/format/webp,http://sns-img-qc.xhscdn" +
            ".com/23a60b0d-8da4-3c30-b146-326f881683ed?imageView2/2/w/1080/format/webp,http://sns-img-qc.xhscdn" +
            ".com/201590ce-1ec8-3693-8659-d591c4891fdb?imageView2/2/w/1080/format/webp,http://sns-img-qc.xhscdn" +
            ".com/9c962567-112a-3fad-a2c2-3d375d740765?imageView2/2/w/1080/format/webp\",\"author\":\"piepiepig\",\"_kafka_data_type_\":\"post\"," +
            "\"update_date\":\"20201017005010\",\"sourceCrawlerId\":\"23619\",\"site_id\":\"146510\",\"goods_id_list\":\"[]\"," +
            "\"publish_date\":\"20201005093210\",\"msgDepth\":\"2\",\"end_date\":\"2922690551203004704\",\"note_type\":\"normal\"," +
            "\"repost_count\":\"2\",\"msgType\":\"1\",\"title\":\"韩系写真～ \",\"content\":\"韩系写真～\\n哈哈哈哈哈我要求韩国女明星feel\\n出来效果很可\\n白西装：Maison " +
            "Margiela\\n靴子：FENDI\",\"image_url_list\":\"[\\\"http://sns-img-qc.xhscdn" +
            ".com/dbb8fe53-adb1-3485-b462-99a6afb42be5?imageView2/2/w/1080/format/webp\\\",\\\"http://sns-img-qc.xhscdn" +
            ".com/6fa257af-2425-3b3d-a417-ccd2a00f8caa?imageView2/2/w/1080/format/webp\\\",\\\"http://sns-img-qc.xhscdn" +
            ".com/23a60b0d-8da4-3c30-b146-326f881683ed?imageView2/2/w/1080/format/webp\\\",\\\"http://sns-img-qc.xhscdn" +
            ".com/201590ce-1ec8-3693-8659-d591c4891fdb?imageView2/2/w/1080/format/webp\\\",\\\"http://sns-img-qc.xhscdn" +
            ".com/9c962567-112a-3fad-a2c2-3d375d740765?imageView2/2/w/1080/format/webp\\\"]\",\"uid\":\"5572fb5b0bf90c551ad4a1f3\"," +
            "\"video_url\":\"\",\"_data_type_\":\"newsforum\",\"cat_id\":\"1\",\"lang\":\"\",\"start_date\":\"20201015082820\"," +
            "\"duration_seconds\":\"\",\"_CT_\":\"1602867010101\",\"full_url\":\"https://www.xiaohongshu" +
            ".com/discovery/item/5f7a779a000000000156ygfe45\",\"item_image_url\":\"http://sns-img-qc.xhscdn" +
            ".com/dbb8fe53-adb1-3485-b462-99a6afb42be5?imageView2/2/w/1080/format/webp,http://sns-img-qc.xhscdn" +
            ".com/6fa257af-2425-3b3d-a417-ccd2a00f8caa?imageView2/2/w/1080/format/webp,http://sns-img-qc.xhscdn" +
            ".com/23a60b0d-8da4-3c30-b146-326f881683ed?imageView2/2/w/1080/format/webp,http://sns-img-qc.xhscdn" +
            ".com/201590ce-1ec8-3693-8659-d591c4891fdb?imageView2/2/w/1080/format/webp,http://sns-img-qc.xhscdn" +
            ".com/9c962567-112a-3fad-a2c2-3d375d740765?imageView2/2/w/1080/format/webp\",\"item_id\":\"5f7a779a000000000156ygfe45\"," +
            "\"other_data\":\"{\\\"duration_seconds\\\":\\\"\\\",\\\"video_url\\\":\\\"\\\",\\\"author\\\":\\\"piepiepig\\\"," +
            "\\\"cooperation_brand\\\":\\\"[]\\\",\\\"goods_id_list\\\":\\\"[]\\\",\\\"video_tag\\\":\\\"[]\\\"}\"," +
            "\"collection_num\":\"0\",\"time_zone\":\"PRC\",\"cooperation_brand\":\"[\\\"菲力普电子\\\",\\\"索尼爱立信\\\"]\",\"url\":\"https://www" +
            ".xiaohongshu.com/discovery/item/5f7a779a000000000156ygfe45\",\"site\":\"小红书\",\"is_main_post\":\"1\"," +
            "\"item_url\":\"https://www.xiaohongshu.com/discovery/item/5f7a779a000000000156ygfe45\",\"taskId\":\"2339380\"," +
            "\"view_count\":\"\"}";

    public static final String videoDba = "{\"end_date\":\"20180931000000\",\"msgType\":\"1\",\"crawlerIdList\":\"131,24080\"," +
            "\"review_count\":\"0\"," +
            "\"title\":\"性感又不失可爱的小野猫\",\"content\":\"小哥哥小姐姐来看下 你们的$$$$까탈레나\",\"image_url_list\":\"[\\\"https://puui.qpic" +
            ".cn/vpic/0/d0695il8dws_160_90_3" +
            ".jpg/0\\\"]\",\"duration\":\"32\",\"cat_id\":\"4\",\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[]\",\"keyword\":\"小野猫\"," +
            "\"lang\":\"\"," +
            "\"start_date\":\"20100400000000\",\"jobName\":\"DBA_video_url\",\"_kafka_data_type_\":\"post\",\"thumbnail\":\"https://puui.qpic" +
            ".cn/vpic/0/d0695il8dws_160_90_3.jpg/0\",\"_CT_\":\"1603334001391\",\"unique_id\":\"2323456765456789yt3456a6\"," +
            "\"full_url\":\"https://v.qq.com/x/page/d0695il8dws.html\",\"item_id\":\"d0695il8dws\",\"author\":\"娱加小阿萨\",\"time_zone\":\"PRC\"," +
            "\"update_date\":\"20201022103321\",\"url\":\"https://v.qq.com/x/page/d0695il8dws.html\",\"site\":\"腾讯视频\",\"is_main_post\":\"1\"," +
            "\"video_comment_id\":\"2786386877\",\"crawler\":\"306\",\"sourceCrawlerId\":\"130\",\"site_id\":\"35\"," +
            "\"publish_date\":\"20180620082318\",\"taskId\":\"1006338\",\"view_count\":\"2854\",\"msgDepth\":\"6\",\"video_id\":\"d0695il8dws\"}";


    public static final String videoTest22="{\"end_date\":\"20201231000000\",\"msgType\":\"1\",\"crawlerIdList\":\"181,24133\"," +
            "\"review_count\":\"0\",\"albumId\":\"0\",\"tvId\":\"1328085831906400\",\"title\":\"多少人婚姻里有隐秘的角落？这部电影狠狠撕开了婚姻的遮羞布！\"," +
            "\"content\":\"多少人婚姻里有隐秘的角落？这部电影狠狠撕开了婚姻的>遮羞布！\",\"cat_id\":\"4\",\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[]\",\"keyword\":\"神秘的角落\"," +
            "\"lang\":\"\",\"start_date\":\"20100400000000\",\"jobName\":\"app_video_all_20201104200213_949_8\",\"thumbnail\":\"http://m.iqiyipic" +
            ".com/u0/image/20201014/ba/b5/pv_1328085831906400_d_601.jpg\",\"_CT_\":\"1604491373023\"," +
            "\"unique_id\":\"3456285e6TYUIb2bcca773d08e710\",\"full_url\":\"https://www.iqiyi.com/v_d6xld7pogc.html\"," +
            "\"item_id\":\"858bb0bbd89f3617654c414eff45bd0b\",\"author\":\"啊咪电影\",\"_kafka_data_type_\":\"post\",\"time_zone\":\"PRC\"," +
            "\"update_date\":\"20201104200253\",\"url\":\"https://www.iqiyi.com/v_d6xld7pogc.html\",\"site\":\"爱奇艺\",\"is_main_post\":\"1\"," +
            "\"crawler\":\"177\",\"sourceCrawlerId\":\"180\",\"site_id\":\"47\",\"publish_date\":\"20201014133714\",\"taskId\":\"1006338\"," +
            "\"msgDepth\":\"4\"}";

    public static final String videoAddField = "{\"end_date\":\"20201220000000\",\"_kafka_data_type_\":\"post\",\"copyright\":\"1\"," +
            "\"msgType\":\"1\",\"crawlerIdList\":\"167,21456\",\"review_count\":\"3926\",\"mid\":\"11166734\",\"oid\":\"87582200\",\"title\":\"一人之下的封神之章 ·" +
            " 陈朵篇想表达的是什么？\",\"content\":\"想尽我所能做到最好\\n但作为新人，视频中的不足必然是众多的\\n这是我的浅薄，也是我的真诚。\\n如果喜欢这个视频，欢迎投币三连支持up主，听说会气运加身哦~\\n往期视频：\\nav89386649 " +
            "《龙族》与江南老贼，如何让读者心痛又欲罢不能？\\nbgm：\\n《陈朵》\\n《daily growing》\\n《春よ、来い》\\n《Grace惊鸿》\\n《Merry Christmas Mr. Lawrence》\"," +
            "\"image_url_list\":\"[\\\"http://i1.hdslb.com/bfs/archive/65af1140e6c6f6352f71902dccf39a51e888fc97.jpg\\\"]\"," +
            "\"audio_urls\":\"[\\\"http://i1.hdslb.com/bfs/archive/65af1140e6c6f6352f71902dccf39a51e888fc97.jpg\\\"]\",\"uid\":\"11166734\"," +
            "\"cat_id\":\"4\",\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[]\",\"lang\":\"\",\"create_date\":\"20200208211752\"," +
            "\"coins_count\":\"120605\",\"start_date\":\"20191201000000\",\"jobName\":\"bilibili_tmp_20200703165058_254_67\"," +
            "\"duration_seconds\":\"1406\",\"thumbnail\":\"http://i1.hdslb.com/bfs/archive/65af1140e6c6f6352f71902dccf39a51e888fc97.jpg\"," +
            "\"_CT_\":\"1593766271425\",\"unique_id\":\"io660654rfe4c6d0f5568f6c0d630347aa\",\"like_count\":\"94870\",\"full_url\":\"https://www" +
            ".bilibili.com/video/av87582200\",\"item_id\":\"f73267a854c6d0f5568f6c0d630347aa\"," +
            "\"other_data\":\"{\\\"duration_seconds\\\":\\\"1406\\\",\\\"copyright\\\":\\\"1\\\",\\\"thumbnail\\\":\\\"http://i1.hdslb" +
            ".com/bfs/archive/65af1140e6c6f6352f71902dccf39a51e888fc97.jpg\\\",\\\"like_count\\\":\\\"94870\\\"," +
            "\\\"user_official_title\\\":\\\"bilibili 新星UP主\\\",\\\"mid\\\":\\\"11166734\\\",\\\"collection_num\\\":\\\"44656\\\"," +
            "\\\"his_rank\\\":\\\"0\\\",\\\"user_sign\\\":\\\"各种有价值或有趣的杂谈和深度解析\\\",\\\"share_count\\\":\\\"16171\\\"," +
            "\\\"uid\\\":\\\"11166734\\\",\\\"avatar_url\\\":\\\"http://i1.hdslb.com/bfs/face/647b118e7bcd441556ae43f338cbbb2a64240fdc" +
            ".jpg\\\",\\\"user_official_desc\\\":\\\"“2020新星计划寒假赛”获奖者\\\",\\\"user_official_type\\\":\\\"0\\\"," +
            "\\\"user_level\\\":\\\"6\\\",\\\"barrage_num\\\":\\\"11320\\\",\\\"create_date\\\":\\\"20200208211752\\\"," +
            "\\\"user_official_role\\\":\\\"7\\\",\\\"aid\\\":\\\"87582200\\\",\\\"coins_count\\\":\\\"120605\\\"," +
            "\\\"video_id\\\":\\\"87582200\\\"}\",\"author\":\"清玉大白菜\",\"collection_num\":\"44656\",\"time_zone\":\"PRC\"," +
            "\"his_rank\":\"0\",\"update_date\":\"20200703165111\",\"url\":\"https://www.bilibili.com/video/av87582200\"," +
            "\"tags\":\"[\\\"一人之下\\\",\\\"动漫杂谈\\\",\\\"陈朵\\\",\\\"王也\\\",\\\"国漫\\\",\\\"bilibili新星计划\\\",\\\"杂谈\\\",\\\"冯宝宝\\\"," +
            "\\\"张楚岚\\\",\\\"宝儿姐\\\"]\",\"share_count\":\"16171\",\"site\":\"哔哩哔哩\",\"is_main_post\":\"1\",\"crawler\":\"166\"," +
            "\"sourceCrawlerId\":\"166\",\"crumbs\":\"国创 \\u003e 国产原创相关\",\"site_id\":\"44\",\"barrage_num\":\"11320\"," +
            "\"publish_date\":\"20200208211752\",\"aid\":\"87582200\",\"view_count\":\"957498\",\"taskId\":\"2343033\"," +
            "\"msgDepth\":\"1\",\"video_id\":\"87582200\"}";


    public static final String videoComment = "{\"end_date\":\"20201220000000\",\"_kafka_data_type_\":\"comment\",\"msgType\":\"1\"," +
            "\"crawlerIdList\":\"111440\",\"review_count\":\"1\",\"title\":\"【星降】！全b站最还原官方的\uD83C\uDF08彩虹节拍\uD83C\uDF08| 这一刻就是你的舞台~【BDF2020-吉林长春】\"," +
            "\"content\":\"冲冲冲\",\"platform\":\"3\",\"uid\":\"19549028\",\"cat_id\":\"4\",\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[]\"," +
            "\"lang\":\"\",\"image_url_list\":\"[\\\"http://i1.hdslb.com/bfs/archive/65af1140e6c6f6352f71902dccf39a51e888fc97.jpg\\\"]\"," +
            "\"audio_urls\":\"[\\\"http://i1.hdslb.com/bfs/archive/65af1140e6c6f6352f71902dccf39a51e888fc97.jpg\\\"]\"," +
            "\"start_date\":\"20101201000000\",\"jobName\":\"storage_test_20200812182258_623_13\",\"_CT_\":\"1597227787459\"," +
            "\"unique_id\":\"yyy009f902dccf39a51e83456337\",\"like_count\":\"4\",\"item_id\":\"a1f4eed27113c0c5291574dd72689083\"," +
            "\"other_data\":\"{\\\"user.official_verify.desc\\\":\\\"\\\",\\\"user.official_verify.type\\\":\\\"-1\\\",\\\"user.level_info" +
            ".current_level\\\":\\\"4\\\",\\\"user.avatar\\\":\\\"http://i2.hdslb.com/bfs/face/12e8de4e5c60dc72eb3b4e284c252b4e477be139.jpg\\\"," +
            "\\\"user.vip.label.text\\\":\\\"\\\",\\\"user.sign\\\":\\\"是朗朗鸭\\\\n企鹅1097316084\\\\n围脖>朗朗酱w\\\\n欢迎找我玩(๑‾ ꇴ ‾๑)\\\",\\\"user" +
            ".sex\\\":\\\"女\\\"}\",\"author\":\"朗朗酱12138\",\"time_zone\":\"PRC\",\"update_date\":\"20200812182307\",\"url\":\"https://www" +
            ".bilibili.com/video/av968514600\",\"unique_parent_id\":\"60e133623ab47f170a5707220d8c26ac\",\"site\":\"哔哩哔哩\"," +
            "\"is_main_post\":\"0\",\"crawler\":\"166\",\"sourceCrawlerId\":\"167\",\"parent_id\":\"1a809dd38fda56b1051098f278abe747\"," +
            "\"site_id\":\"44\",\"publish_date\":\"20200621221810\",\"taskId\":\"2343033\",\"msgDepth\":\"2\",\"video_id\":\"968514600\"}";

    public static final String videoComment2 = "{\"end_date\":\"20201220000000\",\"_kafka_data_type_\":\"comment\",\"msgType\":\"1\"," +
            "\"crawlerIdList\":\"111440\"," +
            "\"review_count\":\"1\",\"title\":\"【星降】！全b站最还原官方的\uD83C\uDF08彩虹节拍\uD83C\uDF08| 这一刻就是你的舞台~【BDF2020-吉林长春】\",\"content\":\"太棒啦这也!\"," +
            "\"platform\":\"2\",\"uid\":\"271219288\",\"cat_id\":\"4\",\"_html_\":\"避过长，省略...\",\"interfaceIdList\":\"[]\",\"lang\":\"\"," +
            "\"start_date\":\"20101201000000\",\"jobName\":\"storage_test_20200812182258_623_13\",\"_CT_\":\"1597227788160\"," +
            "\"unique_id\":\"456653a0987658d35f37\",\"like_count\":\"3\",\"item_id\":\"4dd1d19081213319b065c77a3fc0eb6b\"," +
            "\"other_data\":\"{\\\"user.official_verify.desc\\\":\\\"\\\",\\\"user.official_verify.type\\\":\\\"-1\\\",\\\"user.level_info" +
            ".current_level\\\":\\\"5\\\",\\\"user.avatar\\\":\\\"http://i0.hdslb.com/bfs/face/31cb7a18891100484fd49f2baf3db1c628851f07.jpg\\\"," +
            "\\\"user.vip.label.text\\\":\\\"大会员\\\",\\\"user.sign\\\":\\\"日常摸鱼·····\\\",\\\"user.sex\\\":\\\"女\\\"}\",\"author\":\"榛瑶__\"," +
            "\"time_zone\":\"PRC\",\"update_date\":\"20200812182308\",\"url\":\"https://www.bilibili.com/video/av968514600\"," +
            "\"unique_parent_id\":\"901234b47f170a5707220d8c26ac\",\"site\":\"哔哩哔哩\",\"is_main_post\":\"0\",\"crawler\":\"166\"," +
            "\"sourceCrawlerId\":\"167\",\"parent_id\":\"1a809dd38fda56b1051098f278abe747\",\"site_id\":\"44\",\"publish_date\":\"20200621214527\"," +
            "\"taskId\":\"2343033\",\"msgDepth\":\"2\",\"video_id\":\"968514600\"}";

    public static final String shortVideoUserLikeList = "{\"like_video_list\":\"[\\\"6886370876594326798\\\",\\\"6884038447128956173\\\"," +
            "\\\"6883382606449167623\\\",\\\"6878476132744776972\\\",\\\"6885605225411923214\\\",\\\"6884549849870634251\\\",\\\"6884141161666120974\\\"," +
            "\\\"6886311835599932685\\\",\\\"6880824646908906755\\\",\\\"6884127291299974407\\\",\\\"6883413698816281864\\\",\\\"6882694270331997448\\\"," +
            "\\\"6878869015608020239\\\",\\\"6878968284495006989\\\",\\\"6884545727201053955\\\",\\\"6883748821185219853\\\"," +
            "\\\"6881192651467558158\\\",\\\"6882684593363799296\\\",\\\"6882657185248tags152839\\\",\\\"6883037898015378702\\\"," +
            "\\\"6885890069497007374\\\",\\\"6883411042525809934\\\",\\\"6881915715121712391\\\",\\\"6885276353357155591\\\"," +
            "\\\"6877802873074257166\\\",\\\"6885996453076978957\\\",\\\"6885985136043691278\\\",\\\"6884914357239581965\\\"," +
            "\\\"6881455195398638855\\\",\\\"6883730084151217422\\\",\\\"6883747494371560712\\\",\\\"6882258066256006408\\\"," +
            "\\\"6885544393592327437\\\",\\\"6874556142782090510\\\",\\\"6882245928485440771\\\",\\\"6856005478879710477\\\"," +
            "\\\"6883416490834398472\\\",\\\"6874803645716663567\\\",\\\"6878847056526462216\\\",\\\"120110119070809666\\\"]\"," +
            "\"unique_id\":\"23456768765345678kjhg53543\",\"_kafka_data_type_\":\"like_video_list\"," +
            "\"jobName\":\"watsons_social_v2_20200709000123_648_5\",\"site_id\":\"1003583\",\"cat_id\":\"12\",\"site\":\"抖音app\"}";


    public static final String shortVideoUserLikeList2="{\n" +
            "\t\"jobName\": \"test_run_shuhao_20201026164039_251_93\",\n" +
            "\t\"TOP_N\": \"20\",\n" +
            "\t\"end_date\": \"20180531235959\",\n" +
            "\t\"msgType\": \"1\",\n" +
            "\t\"_CT_\": \"1603701653827\",\n" +
            "\t\"unique_id\": \"876543456032345678e999154d2b40b6d\",\n" +
            "\t\"like_video_list\": \"[\\\"6873032376214097165\\\",\\\"6882954933558119684\\\",\\\"6879613628048215304\\\"," +
            "\\\"6883695228331494659\\\",\\\"6877377859103558926\\\",\\\"6883369557931674894\\\",\\\"6881837994446277895\\\"," +
            "\\\"6879242946189774083\\\",\\\"6876358383943945475\\\",\\\"6883783642208947468\\\",\\\"6886665196727717127\\\"," +
            "\\\"6878125852807187716\\\",\\\"6880725278453222670\\\",\\\"6885180615759596808\\\",\\\"6883694601060781319\\\"," +
            "\\\"6877384887914024204\\\",\\\"234569496004fdsw345663087\\\"]\",\n" +
            "\t\"item_id\": \"84665516902\",\n" +
            "\t\"_kafka_data_type_\": \"like_video_list\",\n" +
            "\t\"time_zone\": \"null\",\n" +
            "\t\"update_date\": \"20201026164053\",\n" +
            "\t\"uid\": \"84665516902\",\n" +
            "\t\"_track_count_\": \"true\",\n" +
            "\t\"site\": \"抖音app\",\n" +
            "\t\"crawler\": \"100249\",\n" +
            "\t\"sourceCrawlerId\": \"100249\",\n" +
            "\t\"cat_id\": \"12\",\n" +
            "\t\"site_id\": \"1003583\",\n" +
            "\t\"_html_\": \"避免过长，省略...\",\n" +
            "\t\"interfaceIdList\": \"[]\",\n" +
            "\t\"lang\": \"\",\n" +
            "\t\"taskId\": \"168911\",\n" +
            "\t\"msgDepth\": \"1\",\n" +
            "\t\"start_date\": \"20180101000000\"\n" +
            "}";

    public static final String shortVideoTest = "{\"TOP_N\":\"400\",\"crawlerIdList\":\"24549,25568\",\"review_count\":\"142\"," +
            "\"challenge_list\":\"[{\\\"challenge_id\\\":\\\"1633570284077063\\\",\\\"challenge_name\\\":\\\"极品飞车21\\\"}]\"," +
            "\"_track_count_\":\"true\",\"province\":\"\",\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[]\",\"keyword\":\"德运\"," +
            "\"jobName\":\"watsons_social_v2_20200709000123_648_5\",\"thumbnail\":\"https://p9-dy.byteimg" +
            ".com/img/tos-cn-p-0015/72e5818995fb4318bd39abb48d7d86bd~noop.jpeg?from\\u003d2563711402_large\"," +
            "\"unique_id\":\"62fd9c196bfd0e6709f103073fa955b2\",\"like_count\":\"114\",\"author\":\"德运网络资讯\",\"_kafka_data_type_\":\"video\"," +
            "\"update_date\":\"20200709154135\",\"tags\":\"[\\\"极品飞车21\\\"]\",\"crawler\":\"24551\",\"sourceCrawlerId\":\"24551\"," +
            "\"goods_title\":\"\",\"district\":\"\",\"site_id\":\"1003583\",\"video_urls\":\"[\\\"https://aweme.snssdk" +
            ".com/aweme/v1/play/?video_id\\\\u003dv0200f7f0000brtd0i8a2pevfkcr3n0g\\\\u0026line\\\\u003d0\\\\u0026ratio\\\\u003d540p" +
            "\\\\u0026media_type\\\\u003d4\\\\u0026vr_type\\\\u003d0\\\\u0026improve_bitrate\\\\u003d0\\\\u0026is_play_url\\\\u003d1\\\\u0026source" +
            "\\\\u003dPackSourceEnum_SEARCH\\\",\\\"https://api.amemv" +
            ".com/aweme/v1/play/?video_id\\\\u003dv0200f7f0000brtd0i8a2pevfkcr3n0g\\\\u0026line\\\\u003d1\\\\u0026ratio\\\\u003d540p" +
            "\\\\u0026media_type\\\\u003d4\\\\u0026vr_type\\\\u003d0\\\\u0026improve_bitrate\\\\u003d0\\\\u0026is_play_url\\\\u003d1\\\\u0026source" +
            "\\\\u003dPackSourceEnum_SEARCH\\\"]\",\"region\":\"\",\"publish_date\":\"20200630160000\",\"msgDepth\":\"18\"," +
            "\"end_date\":\"20200709000000\",\"is_private\":\"0\",\"user_item_id\":\"63290684207\",\"msgType\":\"1\",\"is_recom\":\"0\"," +
            "\"city\":\"\",\"title\":\"@德运网络资讯创作的原声\",\"content\":\"#极品飞车21\",\"cat_id\":\"12\",\"lang\":\"\",\"start_date\":\"20200708000000\"," +
            "\"duration_seconds\":\"29\",\"_CT_\":\"1594280495513\",\"address\":\"\",\"item_id\":\"6844011668326944013\"," +
            "\"other_data\":\"{\\\"itemInfo\\\":\\\"{}\\\"}\",\"time_zone\":\"null\",\"url\":\"https://www.iesdouyin" +
            ".com/share/video/6844011668326944013/?region\\u003dCN\\u0026mid\\u003d6844011785113111304\\u0026u_code\\u003d0\\u0026titleType" +
            "\\u003dtitle\",\"share_count\":\"0\",\"site\":\"抖音app\",\"is_main_post\":\"1\",\"audio_urls\":\"[\\\"http://p9-dy.byteimg" +
            ".com/obj/ies-music/6844011755383868173.mp3\\\",\\\"http://p3-dy.byteimg.com/obj/ies-music/6844011755383868173.mp3\\\"]\"," +
            "\"taskId\":\"1334502\",\"video_id\":\"6844011668326944013\"}\n";





    public static final String ecomItem = "{\"end_date\":\"20201113180000\",\"good_count\":\"1\",\"msgType\":\"1\",\"shop\":\"a axon_us海外官方旗舰店\"," +
            "\"general_count\":\"0\",\"promo_price\":\"8339.00\",\"poor_count\":\"0\",\"crawlerIdList\":\"610\",\"review_count\":\"5\"," +
            "\"title\":\"谷歌（Google） Pixel 4智能手机 GA01187-US 安卓系统 5.7英寸 新款 全网通 白色 Pixel 4 64G\",\"image_url_list\":\"[\\\"https://img10.360buyimg" +
            ".com/n1/s75x75_jfs/t1/87078/21/5673/30281/5dee2bddEcf52ba34/3dbf4e984f0b6730.jpg\\\",\\\"https://img10.360buyimg" +
            ".com/n1/s75x75_jfs/t1/97579/14/5540/31211/5dee2bdeEa4fd188b/f3f440af6cc56e01.jpg\\\",\\\"https://img10.360buyimg" +
            ".com/n1/s75x75_jfs/t1/101538/20/5566/28655/5dee2bdeEfd80921d/57e1f624d0076513.jpg\\\",\\\"https://img10.360buyimg" +
            ".com/n1/s75x75_jfs/t1/96275/8/5548/16809/5dee2bdeE485ec879/f2cc4a873a9e0ae9.jpg\\\",\\\"https://img10.360buyimg" +
            ".com/n1/s75x75_jfs/t1/93067/34/5586/12522/5dee2bdeEe4d51668/68ffd98165e6ace1.jpg\\\"]\",\"score\":\"1.0\",\"self_support\":\"false\"," +
            "\"shop_url\":\"https://mall.jd.hk/index-201436.html\",\"price\":\"8339.00\",\"detail_image_list\":\"[\\\"http://img30.360buyimg" +
            ".com/popWaterMark/jfs/t1/102716/13/5494/39210/5dee2c47E2a8e176c/297544a9dcc97750.jpg\\\",\\\"http://img30.360buyimg" +
            ".com/popWaterMark/jfs/t1/107056/34/5611/38241/5dee2c47E5c08f380/2a66a5507d2c2fc9.jpg\\\",\\\"http://img30.360buyimg" +
            ".com/popWaterMark/jfs/t1/84873/24/5667/23607/5dee2c47E7f4e0ad2/75cccc179444dc9d.jpg\\\",\\\"http://img30.360buyimg" +
            ".com/popWaterMark/jfs/t1/101787/13/5582/18652/5dee2c47Eebe09e1a/baf51f12ef849836.jpg\\\",\\\"http://img30.360buyimg" +
            ".com/popWaterMark/jfs/t1/106188/8/5536/21768/5dee2c47Ed708315a/e890fca800b89d86.jpg\\\",\\\"http://img30.360buyimg" +
            ".com/popWaterMark/jfs/t1/100365/14/5472/44161/5dee2c48Ea8f72b5d/972993d23ae195d0.jpg\\\",\\\"http://img30.360buyimg" +
            ".com/popWaterMark/jfs/t1/96748/37/5687/38052/5dee2c48Ec9156462/0d6cf821a0cd2eca.jpg\\\",\\\"http://img30.360buyimg" +
            ".com/popWaterMark/jfs/t1/97070/19/5586/20737/5dee2c48Edfb1bb4c/7fbf31265142ffb7.jpg\\\"]\",\"cat_id\":\"1\"," +
            "\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[]\",\"lang\":\"\",\"item_title\":\"谷歌（Google） Pixel 4智能手机 GA01187-US 安卓系统 5" +
            ".7英寸 新款 全网通 白色 Pixel 4 64G\",\"platform_score\":\"1.0\",\"start_date\":\"20200825000000\"," +
            "\"jobName\":\"alexTest_20201118212947_061_15\",\"_CT_\":\"1605706243602\"," +
            "\"unique_id\":\"17id7dec8f0f340876778cfda2239ff8\",\"full_url\":\"https://pcitem.jd.hk/63583354795.html\"," +
            "\"item_image_url\":\"https://img10.360buyimg.com/n1/s75x75_jfs/t1/87078/21/5673/30281/5dee2bddEcf52ba34/3dbf4e984f0b6730" +
            ".jpg\",\"clear_image_url_list\":\"[\\\"https://img10.360buyimg" +
            ".com/n1/s450x450_jfs/t1/87078/21/5673/30281/5dee2bddEcf52ba34/3dbf4e984f0b6730.jpg\\\",\\\"https://img10.360buyimg" +
            ".com/n1/s450x450_jfs/t1/97579/14/5540/31211/5dee2bdeEa4fd188b/f3f440af6cc56e01.jpg\\\",\\\"https://img10.360buyimg" +
            ".com/n1/s450x450_jfs/t1/101538/20/5566/28655/5dee2bdeEfd80921d/57e1f624d0076513.jpg\\\",\\\"https://img10.360buyimg" +
            ".com/n1/s450x450_jfs/t1/96275/8/5548/16809/5dee2bdeE485ec879/f2cc4a873a9e0ae9.jpg\\\",\\\"https://img10.360buyimg" +
            ".com/n1/s450x450_jfs/t1/93067/34/5586/12522/5dee2bdeEe4d51668/68ffd98165e6ace1.jpg\\\"]\"," +
            "\"item_id\":\"63583354795\",\"other_data\":\"{\\\"商品毛重\\\":\\\"162.00g\\\",\\\"机身重量（g）\\\":\\\"95\\\"," +
            "\\\"屏幕刷新率\\\":\\\"60Hz\\\",\\\"后摄主摄光圈\\\":\\\"f/1.8\\\",\\\"首销日期\\\":\\\"以官网信息为准\\\",\\\"无线充电 " +
            "无线充电只是个功能，请注意支持无线充电的产品其包装是否带有无线充电的配件，如没有需要自行单配哦。\\\":\\\"10W；支持无线充电\\\",\\\"上市月份\\\":\\\"以官网信息为准\\\"," +
            "\\\"商品编号\\\":\\\"63583354795\\\",\\\"闪光灯\\\":\\\"LED灯\\\",\\\"店铺\\\":\\\" a axon_us海外官方旗舰店\\\"," +
            "\\\"NFC/NFC模式\\\":\\\"不支持NFC\\\",\\\"CPU品牌\\\":\\\"高通(Qualcomm)\\\",\\\"机身材质工艺\\\":\\\"塑料\\\"," +
            "\\\"数据传输接口\\\":\\\"WIFI；蓝牙；OTG接口\\\",\\\"前摄主摄光圈\\\":\\\"f/1.8\\\",\\\"机身材质分类\\\":\\\"塑胶后盖\\\"," +
            "\\\"充电接口类型\\\":\\\"Micro USB\\\",\\\"电池是否可拆卸 不可拆卸电池手机更加节省内部空间，密封性更好，请勿在没有专业人士的帮助下自行拆卸。\\\":\\\"电池不可拆卸\\\"," +
            "\\\"off_line\\\":\\\"false\\\",\\\"4G网络 单卡手机或者主卡的4G网络在这里填写，副卡的网络在副sim卡4G网络中填写。\\\":\\\"4G FDD-LTE(联通)\\\"," +
            "\\\"运营商标志或内容 定制机往往会有运营商的元素在手机的某些位置，该属性会介绍这些元素出现的位置。\\\":\\\"其他\\\",\\\"货号\\\":\\\"google/0009\\\"," +
            "\\\"品牌\\\":\\\"其他品牌\\\",\\\"屏幕材质类型\\\":\\\"其他\\\",\\\"机身长度（mm）\\\":\\\"135\\\",\\\"入网型号 " +
            "工业代号或者入网型号\\\":\\\"pixel 4\\\",\\\"双卡机类型\\\":\\\"单卡\\\",\\\"上市年份\\\":\\\"2019年\\\"," +
            "\\\"充电器\\\":\\\"10V/4A\\\",\\\"耳机接口类型\\\":\\\"3.5mm\\\",\\\"机身宽度（mm）\\\":\\\"65\\\"," +
            "\\\"机身厚度（mm）\\\":\\\"8\\\",\\\"商品产地\\\":\\\"其他\\\",\\\"最大支持SIM卡数量\\\":\\\"1个\\\"," +
            "\\\"商品名称\\\":\\\"谷歌（Google）Pixel 4\\\",\\\"网络频率（2G/3G）\\\":\\\"3G：WCDMA 850/900/2100；2G:BC0；3G：WCDMA " +
            "850/900/1900/2100；3G：WCDMA：850/900/1700/1900/2100MHz；2G：GSM 900/1800/1900；2G：GSM 900/1800\\\"," +
            "\\\"产品名称\\\":\\\"pixel 4\\\",\\\"5G网络\\\":\\\"不支持5G\\\",\\\"SIM卡类型 " +
            "sim卡的规格，大卡、小卡或者nano卡。如果副卡有不同可在下方副卡规格中填写或显示\\\":\\\"以官网信息为准\\\",\\\"操作系统\\\":\\\"Android(安卓)\\\"," +
            "\\\"3G/2G网络\\\":\\\"3G WCDMA(联通)；2G GSM(移动/联通)\\\",\\\"常用功能\\\":\\\"便签；计算器；录音\\\"," +
            "\\\"market_price\\\":\\\"13329.00\\\",\\\"主屏幕尺寸（英寸）\\\":\\\"6.3英寸\\\"}\"," +
            "\"_kafka_data_type_\":\"item\",\"time_zone\":\"null\",\"shop_name\":\"a axon_us海外官方旗舰店\"," +
            "\"update_date\":\"20201118213043\",\"url\":\"https://pcitem.jd.hk/63583354795.html\"," +
            "\"source_item_id\":\"63583354795\",\"site\":\"京东\",\"crawler\":\"24732\"," +
            "\"sourceCrawlerId\":\"24732\",\"item_url\":\"https://pcitem.jd.hk/63583354795.html\"," +
            "\"site_id\":\"5\",\"taskId\":\"1336108\",\"msgDepth\":\"1\"}\n";


    public static final String ecomComment = "{\"end_date\":\"20201113180000\",\"reference_name\":\"智能老人手机\",\"shop_id\":\"11112345\"," +
            "\"shop_type\":\"保健品\",\"city\":\"广州\",\"uid\":\"ff341987hb345\",\"msgType\":\"1\",\"title\":\"谷歌（Google） Pixel 4a 全高清智能手机 5.8英寸 6+128G " +
            "2020新款\",\"image_url_list\":\"[]\",\"content\":\"很满意，和期待的一样好。\",\"score\":\"5\",\"self_support\":\"false\",\"cat_id\":\"1\"," +
            "\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[]\",\"reference_date\":\"20200907105644\",\"lang\":\"\",\"item_title\":\"谷歌（Google） Pixel " +
            "4a 全高清智能手机 5.8英寸 6+128G 2020新款\",\"start_date\":\"20200825000000\",\"jobName\":\"alexTest_20201113181324_111_4\"," +
            "\"_CT_\":\"1605262443921\",\"unique_id\":\"345tgf345ca63f7bd3d9a418323c6\",\"like_count\":\"1\",\"full_url\":\"https://pcitem.jd" +
            ".hk/10020619014102.html\",\"other_data\":\"{\\\"is_add_review\\\":\\\"否\\\"}\",\"item_id\":\"10020619014102\"," +
            "\"author\":\"jd_136996ehc\",\"_kafka_data_type_\":\"comment\",\"comment_url\":\"http://club.jd" +
            ".com/repay/10020619014102_6d8f5274c66b035ee5546261ba041b97_1.html\",\"comment_date\":\"20201009092520\",\"time_zone\":\"PRC\"," +
            "\"comment_id\":\"24401a1e0cfa63f7bd3e09a41832e8c6\",\"shop_name\":\"a axon_us海外官方旗舰店\",\"update_date\":\"20201113181403\"," +
            "\"url\":\"https://pcitem.jd.hk/10020619014102.html\",\"unique_parent_id\":\"10020619014102\",\"site\":\"京东\",\"CONTROL_PAGE\":\"0\"," +
            "\"crawler\":\"24732\",\"sourceCrawlerId\":\"610\",\"parent_id\":\"10020619014102\",\"site_id\":\"5\"," +
            "\"publish_date\":\"20201009092520\",\"taskId\":\"1336108\",\"msgDepth\":\"2\"}";


    public static final String carKoubei = "{\"end_date\":\"20280626235959\",\"msgType\":\"1\",\"user_name\":\"ii就是你\",\"model_name\":\"2019款 " +
            "耀·舒适型\",\"series_name\":\"比亚迪S2\",\"cat_id\":\"13\",\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[]\",\"lang\":\"\"," +
            "\"start_date\":\"20180625000000\",\"jobName\":\"caixin_test_20201124175019_563_6\",\"_CT_\":\"1606211436490\"," +
            "\"unique_id\":\"dfry336dd4a78deeaf53c541ad7d69\",\"full_url\":\"http://dianping.bitauto.com/biyadis2/koubei/\"," +
            "\"item_id\":\"345ffaec848801f1ebb234fsf1aacba\",\"_kafka_data_type_\":\"koubei\",\"model_id\":\"134969\",\"time_zone\":\"null\"," +
            "\"update_date\":\"20201124175036\",\"url\":\"http://dianping.bitauto.com/sid_5686/koubei/3694242844872576\",\"series_id\":\"5686\"," +
            "\"site\":\"易车网_车系\",\"crawler\":\"1116916\",\"koubei_id\":\"3694242844872576\",\"sourceCrawlerId\":\"1116917\",\"site_id\":\"1207508\"," +
            "\"koubei\":\"{\\\"koubei_id\\\":\\\"3694242844872576\\\",\\\"model_id\\\":\\\"134969\\\",\\\"model_name\\\":\\\"秦霜 S2 2019款 耀·舒适型\\\"," +
            "\\\"summary_score\\\":\\\"0\\\",\\\"short_content\\\":\\\"青春活力的比亚迪S2 非常省钱的一辆车\\\",\\\"publish_date\\\":\\\"20200728202900\\\"," +
            "\\\"review_count\\\":\\\"0\\\",\\\"like_count\\\":\\\"0\\\",\\\"is_quality\\\":\\\"0\\\",\\\"bought_location\\\":\\\"\\\"," +
            "\\\"bought_date\\\":\\\"20200601000000\\\",\\\"bought_price\\\":\\\"9.98\\\",\\\"best_scene\\\":{\\\"scene_name\\\":\\\"最满意\\\"," +
            "\\\"content\\\":\\\"首先我对比亚迪的品质和技术都是比较信赖的，比亚迪的新能源也比较多，所以我相信比亚迪在电池这方面做得是比较好。新能源使用起来也相当经济实惠，这辆车的颜值也是不错，看起来时尚大气。\\\"," +
            "\\\"score\\\":\\\"0\\\",\\\"scenes\\\":[]},\\\"worst_scene\\\":{\\\"scene_name\\\":\\\"最不满意\\\"," +
            "\\\"content\\\":\\\"感觉中控台用的塑料会比较多一点，刚提车的时候味道也比较呛。\\\",\\\"score\\\":\\\"0\\\",\\\"scenes\\\":[]}," +
            "\\\"reason_scene\\\":{\\\"scenes\\\":[]},\\\"space_scene\\\":{\\\"scene_name\\\":\\\"空间\\\"," +
            "\\\"content\\\":\\\"这辆车的乘坐空间没什么问题，我觉得挺好的，我的身高是1.78米坐，在车内感觉很舒服，平常也就两个人用车比较多，偶尔和朋友一起出行也不会显得拥挤，可以满足我的用车需求。后备箱的容量也还不错。\\\"," +
            "\\\"score\\\":\\\"5\\\",\\\"scenes\\\":[]},\\\"power_scene\\\":{\\\"scene_name\\\":\\\"动力\\\"," +
            "\\\"content\\\":\\\"纯电车的优势就是起步非常快，这也是我深有体会的，等红绿灯的时候基本第一个冲出去，超车也没有压力。动力也很平顺。\\\",\\\"score\\\":\\\"5\\\",\\\"scenes\\\":[]}," +
            "\\\"control_scene\\\":{\\\"scene_name\\\":\\\"操控\\\"," +
            "\\\"content\\\":\\\"在这个价位就配备了多功能方向盘，确实是很方便，听歌，接电话都很便利，同时也提高了行车的安全性。倒车影像也很清晰。操控起来感觉挺好。\\\",\\\"score\\\":\\\"5\\\"," +
            "\\\"scenes\\\":[]},\\\"comfortableness_scene\\\":{\\\"scene_name\\\":\\\"舒适性\\\"," +
            "\\\"content\\\":\\\"整体的舒适度我觉得还不错，座椅比较有包裹，性软硬度也挺合适。而且行驶过程中几乎没有噪音，底盘也不算太硬，还是比较有韧性的。\\\",\\\"score\\\":\\\"5\\\"," +
            "\\\"scenes\\\":[]},\\\"appearance_scene\\\":{\\\"scene_name\\\":\\\"外观\\\"," +
            "\\\"content\\\":\\\"外观主要看自己喜欢吧，毕竟这东西也比较主观。从我的角度出发就是觉得他很时尚大气，看起来很协调，给人的第一印象比较深。\\\",\\\"score\\\":\\\"5\\\"," +
            "\\\"scenes\\\":[]},\\\"internal_scene\\\":{\\\"scene_name\\\":\\\"内饰\\\"," +
            "\\\"content\\\":\\\"内饰的设计风格还可以，特别是中控大屏非常给力，而且还可以旋转调节，属于简单大气的类型。就是用的塑料稍微有点多，新车的味道也挺大。\\\",\\\"score\\\":\\\"4\\\"," +
            "\\\"scenes\\\":[]},\\\"cost_performance_scene\\\":{\\\"scenes\\\":[]},\\\"oil_scene\\\":{\\\"scenes\\\":[]}," +
            "\\\"battery_scene\\\":{\\\"scenes\\\":[]},\\\"other_scenes\\\":[{\\\"scene_name\\\":\\\"续航\\\"," +
            "\\\"content\\\":\\\"充满电的话续航应该在290公里左右，我基本上是一周充一次电，作为日常代步车确实是不错，经济又是在。\\\",\\\"score\\\":\\\"5\\\"," +
            "\\\"scenes\\\":[]}],\\\"oil_consumption\\\":\\\"290.00\\\",\\\"user_id\\\":\\\"87935620\\\"," +
            "\\\"user_name\\\":\\\"ii就是你\\\",\\\"series_id\\\":\\\"5686\\\",\\\"is_append\\\":false}\"," +
            "\"taskId\":\"2343343\",\"msgDepth\":\"2\"}\n";




}
