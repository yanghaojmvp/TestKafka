package com.sid.spark.kafka;

/**
 * @author yanghaojie
 * @date 2020-06-30 14:16
 * 类解释：
 */
public class KafkaMessagePool {



    public static final String test001_sdk_begin_log="2020-05-09_19:21:31 [http-nio-28956-exec-6] INFO util.LogUtil:76: NormalLog " +
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


    public static final String test001_sdk_normal_error_log ="2020-05-09_20:20:40 [http-nio-28956-exec-6] INFO util.LogUtil:265: NormalLog " +
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




    public static final String WeiboPostInteractionUpdate_Post = "{\"end_date\":\"20191219000000\",\"msgType\":\"1\",\"crawlerIdList\":\"23477," +
            "99991,972\"," +
            "\"mid\":\"4525924299457947\",\"source\":\"微博 weibo.com\",\"uid\":\"2656274875\",\"_track_count_\":\"true\",\"cat_id\":\"9\"," +
            "\"json\":\"{\\\"user\\\":{\\\"id\\\":\\\"2656274875\\\",\\\"screenName\\\":\\\"央视新闻\\\",\\\"name\\\":\\\"央视新闻\\\",\\\"province\\\":11," +
            "\\\"city\\\":1000,\\\"location\\\":\\\"北京\\\",\\\"description\\\":\\\"“央视新闻”微博是中央电视台新闻中心官方微博，是央视重大新闻、突发事件、重点报道的首发平台。\\\"," +
            "\\\"url\\\":\\\"\\\",\\\"profileImageUrl\\\":\\\"https://tvax4.sinaimg.cn/crop.0.0.512.512.50/9e5389bbly8gdi6srn9zmj20e80e8mxj" +
            ".jpg?KID\\\\u003dimgbed,tva\\\\u0026Expires\\\\u003d1594640776\\\\u0026ssig\\\\u003dA9Pw75b2ce\\\"," +
            "\\\"userDomain\\\":\\\"cctvxinwen\\\",\\\"gender\\\":\\\"m\\\",\\\"followersCount\\\":111855380,\\\"friendsCount\\\":2704," +
            "\\\"statusesCount\\\":130241,\\\"favouritesCount\\\":163,\\\"createdAt\\\":\\\"Mar 7, 2012 3:11:13 PM\\\",\\\"following\\\":false," +
            "\\\"verified\\\":true,\\\"verifiedType\\\":3,\\\"allowAllActMsg\\\":true,\\\"allowAllComment\\\":true,\\\"followMe\\\":false," +
            "\\\"avatarLarge\\\":\\\"https://tvax4.sinaimg.cn/crop.0.0.512.512.180/9e5389bbly8gdi6srn9zmj20e80e8mxj.jpg?KID\\\\u003dimgbed," +
            "tva\\\\u0026Expires\\\\u003d1594640776\\\\u0026ssig\\\\u003d693NlTH%2BRw\\\",\\\"onlineStatus\\\":0,\\\"biFollowersCount\\\":307," +
            "\\\"lang\\\":\\\"zh-cn\\\",\\\"verifiedReason\\\":\\\"中央电视台新闻中心官方微博\\\",\\\"weihao\\\":\\\"\\\",\\\"statusId\\\":\\\"\\\"," +
            "\\\"verifiedTypeExt\\\":0},\\\"createdAt\\\":\\\"Jul 12, 2020 5:58:23 PM\\\",\\\"id\\\":\\\"4525924299457947\\\"," +
            "\\\"mid\\\":\\\"4525924299457947\\\",\\\"idstr\\\":4525924299457947," +
            "\\\"text\\\":\\\"【最新通报！#贵州公交坠湖司机蓄意报复社会#】贵州通报公交坠湖致21死案：司机因拆迁问题心生不满，喝酒后蓄意驾车冲进湖中，已死亡。公交车并无机械性故障。 \u200B\\\"," +
            "\\\"source\\\":{\\\"url\\\":\\\"http://app.weibo.com/t/feed/6vtZb0\\\",\\\"relationShip\\\":\\\"nofollow\\\",\\\"name\\\":\\\"微博 weibo" +
            ".com\\\"},\\\"favorited\\\":false,\\\"truncated\\\":false,\\\"inReplyToStatusId\\\":-1,\\\"inReplyToUserId\\\":-1," +
            "\\\"inReplyToScreenName\\\":\\\"\\\",\\\"thumbnailPic\\\":\\\"http://wx3.sinaimg.cn/thumbnail/9e5389bbly1ggoczaep0nj20go1zwe81" +
            ".jpg\\\",\\\"bmiddlePic\\\":\\\"http://wx3.sinaimg.cn/bmiddle/9e5389bbly1ggoczaep0nj20go1zwe81.jpg\\\"," +
            "\\\"originalPic\\\":\\\"http://wx3.sinaimg.cn/large/9e5389bbly1ggoczaep0nj20go1zwe81.jpg\\\",\\\"geo\\\":\\\"null\\\"," +
            "\\\"latitude\\\":-1.0,\\\"longitude\\\":-1.0,\\\"repostsCount\\\":86081,\\\"commentsCount\\\":61792,\\\"attitudesCount\\\":837319," +
            "\\\"annotations\\\":\\\"\\\",\\\"mlevel\\\":0,\\\"feature\\\":1,\\\"picUrls\\\":[\\\"http://wx3.sinaimg" +
            ".cn/thumbnail/9e5389bbly1ggoczaep0nj20go1zwe81.jpg\\\",\\\"http://wx1.sinaimg.cn/thumbnail/9e5389bbly1ggocgjat45j20j60asq4z.jpg\\\"]," +
            "\\\"visible\\\":{\\\"type\\\":0,\\\"list_id\\\":0}}\",\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[\\\"1\\\"]\",\"lang\":\"\"," +
            "\"start_date\":\"20101211000000\",\"jobName\":\"CP4358_20200713164559_653_43\",\"from_type\":\"null\",\"_CT_\":\"1594629976352\"," +
            "\"salt\":\"null\",\"item_id\":\"4525924299457947\",\"_kafka_data_type_\":\"post\",\"time_zone\":\"PRC\"," +
            "\"update_date\":\"20200713164616\",\"site\":\"新浪微博\",\"crawler\":\"2990\",\"sourceCrawlerId\":\"2990\",\"site_id\":\"101993\"," +
            "\"topic\":\"null\",\"CONTROL_AMOUNT\":\"1\",\"retweet_id\":\"\",\"publish_date\":\"20200712175823\",\"taskId\":\"1336150\"," +
            "\"msgDepth\":\"1\"}\n";

    public static final String WeiboPostInteractionUpdate = "{\"jobName\":\"storage_test_20200713161542_699_34\",\"end_date\":\"20191219000000\"," +
            "\"msgType\":\"1\",\"_CT_\":\"1594628151599\",\"item_id\":\"4525924299457947\",\"_kafka_data_type_\":\"interaction_update\"," +
            "\"mid\":\"4525924299457947\",\"time_zone\":\"null\",\"update_date\":\"20200713161551\",\"site\":\"新浪微博\",\"crawler\":\"100667\"," +
            "\"sourceCrawlerId\":\"100667\",\"mids\":\"4525924299457947\",\"cat_id\":\"9\",\"site_id\":\"101993\"," +
            "\"json\":\"{\\\"id\\\":\\\"4525924299457947\\\",\\\"idstr\\\":4525924299457947,\\\"repostsCount\\\":95070,\\\"commentsCount\\\":91688," +
            "\\\"attitudesCount\\\":935885}\",\"_html_\":\"避免过长，省略...\",\"CONTROL_AMOUNT\":\"1\",\"interfaceIdList\":\"[]\",\"lang\":\"\"," +
            "\"taskId\":\"2343033\",\"msgDepth\":\"1\",\"start_date\":\"20101211000000\"}";


    public static final String WeiboPost = "{\"end_date\":\"20191219000000\",\"msgType\":\"1\",\"crawlerIdList\":\"23477,99991,972\"," +
            "\"mid\":\"4521612983038476\",\"source\":\"微博 weibo.com\",\"uid\":\"5915106342\",\"_track_count_\":\"true\",\"cat_id\":\"9\"," +
            "\"json\":\"{\\\"user\\\":{\\\"id\\\":\\\"5915106342\\\",\\\"screenName\\\":\\\"蜗牛有一把锤子\\\",\\\"name\\\":\\\"蜗牛有一把锤子\\\"," +
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
            "\\\"verifiedTypeExt\\\":0},\\\"createdAt\\\":\\\"Jun 30, 2020 8:26:45 PM\\\",\\\"id\\\":\\\"4521612983038476\\\"," +
            "\\\"mid\\\":\\\"4521612983038476\\\",\\\"idstr\\\":4521612983038476,\\\"text\\\":\\\"一帆风顺[中国赞] \u200B\\\"," +
            "\\\"source\\\":{\\\"url\\\":\\\"http://app.weibo.com/t/feed/6vtZb0\\\",\\\"relationShip\\\":\\\"nofollow\\\",\\\"name\\\":\\\"微博 weibo" +
            ".com\\\"},\\\"favorited\\\":false,\\\"truncated\\\":false,\\\"inReplyToStatusId\\\":-1,\\\"inReplyToUserId\\\":-1," +
            "\\\"inReplyToScreenName\\\":\\\"\\\",\\\"thumbnailPic\\\":\\\"\\\",\\\"bmiddlePic\\\":\\\"\\\",\\\"originalPic\\\":\\\"\\\"," +
            "\\\"geo\\\":\\\"null\\\",\\\"latitude\\\":-1.0,\\\"longitude\\\":-1.0,\\\"repostsCount\\\":0,\\\"commentsCount\\\":1," +
            "\\\"attitudesCount\\\":1,\\\"annotations\\\":\\\"\\\",\\\"mlevel\\\":0,\\\"feature\\\":1,\\\"visible\\\":{\\\"type\\\":0," +
            "\\\"list_id\\\":0}}\",\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[\\\"1\\\"]\",\"lang\":\"\",\"start_date\":\"20101211000000\"," +
            "\"jobName\":\"CP4358_20200630202802_270_11\",\"from_type\":\"null\",\"_CT_\":\"1593520096035\",\"salt\":\"null\"," +
            "\"item_id\":\"4521612983038476\",\"_kafka_data_type_\":\"post\",\"time_zone\":\"PRC\",\"update_date\":\"20200630202816\"," +
            "\"site\":\"新浪微博\",\"crawler\":\"2990\",\"sourceCrawlerId\":\"2990\",\"site_id\":\"101993\",\"topic\":\"null\"," +
            "\"CONTROL_AMOUNT\":\"1\",\"retweet_id\":\"\",\"publish_date\":\"20200630202645\",\"taskId\":\"1336150\",\"msgDepth\":\"1\"}\n";


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
            "\"jobName\":\"CP4247_20200709163447_718_82\",\"unique_id\":\"234566ytewdfgh234567\",\"level\":\"6\"," +
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
            "\"jobName\":\"bilibili_tmp_20200708161437_747_81\",\"unique_id\":\"43061676f914b49d665f31fed1bc90d8\",\"level\":\"6\"," +
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


    public static final String NewFouTetComment = "{\"end_date\":\"20200708235959\",\"msgType\":\"1\",\"TOP_PAGE\":\"50\",\"title\":\".rez " +
            "这种后缀用什么软件打开。\",\"content\":\"扩展名不一定能证明文件类型\"," +
            "\"page_id\":\"2afa5b945c3a05ddae8bcb26302e57d3\",\"cat_id\":\"2\",\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[]\"," +
            "\"keyword\":\"曙光战舰\",\"lang\":\"\",\"start_date\":\"20200702000000\",\"jobName\":\"dba_newsforum_search_20200709041326_928_29\"," +
            "\"_CT_\":\"1594280524827\",\"item_id\":\"eea2c37ce16de2d9874bc9440533c73c\",\"author\":\"drifter250771\"," +
            "\"_kafka_data_type_\":\"comment\",\"time_zone\":\"null\",\"update_date\":\"20200709154204\",\"url\":\"https://bbs.csdn" +
            ".net/topics/320046621?list\\u003d311867\",\"site\":\"CSDN_论坛\",\"is_main_post\":\"0\",\"crawler\":\"111359\"," +
            "\"sourceCrawlerId\":\"111360\",\"parent_item_id\":\"2afa5b945c3a05ddae8bcb26302e57d3\",\"site_id\":\"135905\"," +
            "\"publish_date\":\"20090925010925\",\"taskId\":\"2341933\",\"msgDepth\":\"2\"}\n";

    public static final String NewFouTet2 = "{\"end_date\":\"2020-06-24 09:56:00.0\",\"msgType\":\"1\",\"review_count\":\"576\"," +
            "\"ext_review_count\":\"578\"," +
            "\"title\":\"mysql_is_very_nice_biu\",\"content\":\"mysql_is_very_nice_biu\",\"image_url_list\":\"[\\\"http://tiebapic.baidu" +
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
            "\"publish_date\":\"20200624094600\",\"device\":\"Android客户端\",\"taskId\":\"1202790\",\"msgDepth\":\"2\"}";


    public static final String videoAddField = "{\"end_date\":\"20201220000000\",\"copyright\":\"1\",\"msgType\":\"1\",\"crawlerIdList\":\"167," +
            "21456\",\"review_count\":\"3926\",\"mid\":\"11166734\",\"oid\":\"87582200\",\"title\":\"一人之下的封神之章 · 陈朵篇想表达的是什么？\"," +
            "\"content\":\"想尽我所能做到最好\\n但作为新人，视频中的不足必然是众多的\\n这是我的浅薄，也是我的真诚。\\n如果喜欢这个视频，欢迎投币三连支持up主，听说会气运加身哦~\\n往期视频：\\nav89386649 " +
            "《龙族》与江南老贼，如何让读者心痛又欲罢不能？\\nbgm：\\n《陈朵》\\n《daily growing》\\n《春よ、来い》\\n《Grace惊鸿》\\n《Merry Christmas Mr. Lawrence》\"," +
            "\"image_url_list\":\"[\\\"http://i1.hdslb.com/bfs/archive/65af1140e6c6f6352f71902dccf39a51e888fc97.jpg\\\"]\",\"uid\":\"11166734\"," +
            "\"cat_id\":\"4\",\"_html_\":\"避免过长，省略...\",\"interfaceIdList\":\"[]\",\"lang\":\"\",\"create_date\":\"20200208211752\"," +
            "\"coins_count\":\"120605\",\"start_date\":\"20191201000000\",\"jobName\":\"bilibili_tmp_20200703165058_254_67\"," +
            "\"duration_seconds\":\"1406\",\"thumbnail\":\"http://i1.hdslb.com/bfs/archive/65af1140e6c6f6352f71902dccf39a51e888fc97.jpg\"," +
            "\"_CT_\":\"1593766271425\",\"unique_id\":\"248f5fd1d22bb96d4d027a7db5e3e341\",\"like_count\":\"94870\",\"full_url\":\"https://www" +
            ".bilibili.com/video/av87582200\",\"item_id\":\"f73267a854c6d0f5568f6c0d630347aa\"," +
            "\"other_data\":\"{\\\"duration_seconds\\\":\\\"1406\\\",\\\"copyright\\\":\\\"1\\\",\\\"thumbnail\\\":\\\"http://i1.hdslb" +
            ".com/bfs/archive/65af1140e6c6f6352f71902dccf39a51e888fc97.jpg\\\",\\\"like_count\\\":\\\"94870\\\"," +
            "\\\"user_official_title\\\":\\\"bilibili 新星UP主\\\",\\\"mid\\\":\\\"11166734\\\",\\\"collection_num\\\":\\\"44656\\\"," +
            "\\\"his_rank\\\":\\\"0\\\",\\\"user_sign\\\":\\\"各种有价值或有趣的杂谈和深度解析\\\",\\\"share_count\\\":\\\"16171\\\",\\\"uid\\\":\\\"11166734\\\"," +
            "\\\"avatar_url\\\":\\\"http://i1.hdslb.com/bfs/face/647b118e7bcd441556ae43f338cbbb2a64240fdc.jpg\\\"," +
            "\\\"user_official_desc\\\":\\\"“2020新星计划寒假赛”获奖者\\\",\\\"user_official_type\\\":\\\"0\\\",\\\"user_level\\\":\\\"6\\\"," +
            "\\\"barrage_num\\\":\\\"11320\\\",\\\"create_date\\\":\\\"20200208211752\\\",\\\"user_official_role\\\":\\\"7\\\"," +
            "\\\"aid\\\":\\\"87582200\\\",\\\"coins_count\\\":\\\"120605\\\",\\\"video_id\\\":\\\"87582200\\\"}\",\"author\":\"清玉大白菜\"," +
            "\"collection_num\":\"44656\",\"time_zone\":\"PRC\",\"his_rank\":\"0\",\"update_date\":\"20200703165111\",\"url\":\"https://www" +
            ".bilibili.com/video/av87582200\",\"tags\":\"[\\\"一人之下\\\",\\\"动漫杂谈\\\",\\\"陈朵\\\",\\\"王也\\\",\\\"国漫\\\",\\\"bilibili新星计划\\\"," +
            "\\\"杂谈\\\",\\\"冯宝宝\\\",\\\"张楚岚\\\",\\\"宝儿姐\\\"]\",\"share_count\":\"16171\",\"site\":\"哔哩哔哩\",\"is_main_post\":\"1\"," +
            "\"crawler\":\"166\",\"sourceCrawlerId\":\"166\",\"crumbs\":\"国创 \\u003e 国产原创相关\",\"site_id\":\"44\",\"barrage_num\":\"11320\"," +
            "\"publish_date\":\"20200208211752\",\"aid\":\"87582200\",\"view_count\":\"957498\",\"taskId\":\"2343033\",\"msgDepth\":\"1\"," +
            "\"video_id\":\"87582200\"}";
}
