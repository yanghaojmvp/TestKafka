#获取该别名包含了哪些索引
GET /*/_alias/ds-banyan-newsforum-post-index-v3
#获取index-别名
GET /ds-banyan-shortvideo-video-quarter-202001-v2/_alias/*
#获取所有索引的信息
GET /_cat/indices?v
#获取所有的映射信息
GET /test_date_index_ds/_mapping
#获取索引的分片情况
GET /ds-banyan-weibo-post-index-v3/_search_shards
#热点线程情况
GET /_nodes/hot_threads
#获取队列情况
GET /_cat/thread_pool?v
#获取索引的详细信息
GET /ds-banyan-xiaohongshu-note-all-v3/_stats?pretty
#获取索引文档总数
GET /_cat/count/ds-banyan-weibo-content-index?v&pretty
#获取索引的分片分配情况和节点信息
GET /_cat/shards/ds-banyan-weibo-user-index-v3?v
GET /_cat/shards/ds-banyan-weibo-user-index-v3?v
#集群健康状态
GET _cat/health?v






###------------------------------------------------------------------
########################## 短视频查询 ##########################

GET /ds-banyan-shortvideo-video-index-v3/video/_search
{
  "size": 10,
	"query": {
		"bool": {
			"must": [{
				"match_all": {

				}
			}]
		}
	}
}

GET /ds-banyan-shortvideo-video-index-v3/video/_search
{
  "query": {
    "bool": {
      "must": [
        {
          "range": {
            "update_timestamp": {
              "gte": "1595508322000",
              "lt":  "1595511922000"
            }
          }
        }]
    }
  }
}


###------------------------------------------------------------------
########################## 微博主帖刷数V3 ##########################



GET _tasks?detailed=true&actions=*search*


POST /ds-banyan-weibo-post-index-v3/post/_search
{
  "query": {
    "bool": {
      "must": [
        {
          "range": {
            "update_timestamp": {
              "gte": "20191101000000",
              "lt":  "20200109000000",
              "time_zone": "+08:00",
              "format":"yyyyMMddHHmmss"
            }
          }
        }]
    }
  }
}


## V2旧索引
## 20200101000000 到 20200107000000
## 20200107000000 到 20200114000000
## 20200109000000 到 20200115000000
## 20200101000000 到 20200109000000
## 20200123000000 到 20200201000000
POST ds-banyan-weibo-content-index/weibo/_search
{
	"size": 10,
	"query": {
		"bool": {
			"must": [
				{
					"range": {
						"update_date": {
							"gte": "20191001000000",
							"lt":  "20191101000000"
						}
					}
				}
			]
		}
	}
}



## 获取2020-01微博主帖的数据总量=280735307
POST ds-banyan-weibo-content-index/weibo/_search
{
	"size": 10,
	"query": {
		"bool": {
			"must": [
				{
					"range": {
						"update_date": {
							"gte": "20200101000000",
							"lt":  "20200109000000"
						}
					}
				}
			]
		}
	}
}

## 获取2020-02微博主帖的数据总量=280735307
POST ds-banyan-weibo-content-index/weibo/_search
{
	"size": 10,
	"query": {
		"bool": {
			"must": [
				{
					"range": {
						"update_date": {
							"gte": "20200201000000",
							"lt":  "20200301000000"
						}
					}
				}
			]
		}
	}
}


## 获取2019-11微博主帖的数据总量=280735307
POST ds-banyan-weibo-content-index/weibo/_search
{
	"size": 10,
	"query": {
		"bool": {
			"must": [
				{
					"range": {
						"update_date": {
							"gte": "20191101000000",
							"lt":  "20191105000000"
						}
					}
				}
			]
		}
	}
}



POST /ds-banyan-weibo-post-index-v3/post/_search
{
  "size": 10,
	"aggs": {
		"user_min_update_time_agg": {
			"max": {
				"field": "first_crawler_timestamp"
			}
		}
	}
}

## 2019-q1 month1 --> month3
POST ds-banyan-weibo-content-index/weibo/_search
{
	"size": 10,
	"query": {
		"bool": {
			"must": [
				{
					"range": {
						"update_date": {
							"gte": "20191001000000",
							"lt":  "20200101000000"
						}
					}
				}
			]
		}
	}
}



## 2020-q1 month1 --> month3
POST ds-banyan-weibo-content-index/weibo/_search
{
	"size": 10,
	"query": {
		"bool": {
			"must": [
				{
					"range": {
						"update_date": {
							"gte": "20200101000000",
							"lt":  "20200401000000"
						}
					}
				}
			]
		}
	}
}

## 2020-q1 month4 --> month6
POST ds-banyan-weibo-content-index/weibo/_search
{
	"size": 10,
	"query": {
		"bool": {
			"must": [
				{
					"range": {
						"update_date": {
							"gte": "20200401000000",
							"lt":  "20200701000000"
						}
					}
				}
			]
		}
	}
}



## update_timestamp=today
GET /ds-banyan-weibo-post-index-v3/post/_search
{
	"size": 10,
	"query": {
		"bool": {
			"must": [
				{
					"range": {
						"update_timestamp": {
							"gte": "1595174400000",
							"lt":  "1595260800000"
						}
					}
				}
			]
		}
	}
}

GET /ds-banyan-weibo-post-index-v3/post/_search
{
	"size": 10,
	"query": {
		"bool": {
			"must": [
				{
					"range": {
						"update_timestamp": {
							"gte": "1595174400000",
							"lt":  "1595260800000"
						}
					}
				},				{
					"range": {
						"first_crawler_timestamp": {
							"gte":  "1587312000000",
							"lt":  "1595174400000"
						}
					}
				}
			]
		}
	}
}

GET /ds-banyan-weibo-post-index-v3/post/_search
{
	"size": 10,
	"query": {
		"bool": {
			"must": [
				{
					"range": {
						"update_timestamp": {
							"gte": "1595174400000",
							"lt":  "1595260800000"
						}
					}
				},				{
					"range": {
						"first_crawler_timestamp": {
						  "gte": "1594742400000",
							"lt":  "1595174400000"
						}
					}
				}
			]
		}
	}
}

###------------------------------------------------------------------
########################## 微博用户 ##########################
PUT /ds-banyan-weibo-user-index/user/12323222908?timestamp=2016-07-14T09:23:38.388Z
{
    "user" : "kimchy"
}



GET /ds-banyan-weibo-user-index-v3/user/_search
{
	"query": {
		"bool": {
			"must": [{
				"term": {
					"item_id": "1735936030"
				}
			}]
		}
	}
}


GET /ds-banyan-weibo-user-index-v3/user/_search
{
  "size": 10,
	"query": {
		"bool": {
			"must": [{
				"match_all": {

				}
			}]
		}
	}
}



GET /ds-banyan-weibo-user-index/user/_search
{
  "size": 1,
	"aggs": {
		"user_min_update_time_agg": {
			"min": {
				"field": "update_time"
			}
		}
	},"sort":  "update_time"
}

GET /ds-banyan-weibo-user-index/user/_search
{
  "size": 1,
	"aggs": {
		"user_min_update_time_agg": {
			"min": {
				"field": "update_time"
			}
		}
	},"sort": { "age": { "order": "desc" }}
}



GET /ds-banyan-weibo-user-index/user/_search
{
  "size": 0,
	"aggs": {
		"user_min_update_time_agg": {
			"max": {
				"field": "update_time"
			}
		}
	}
}


# 18 - 19
POST /ds-banyan-weibo-user-index/user/_search
{
	"size": 10,
	"query": {
		"bool": {
			"must": [
				{
					"range": {
						"update_time": {
							"gte": "1514736000",
							"lt":  "1546272000"
						}
					}
				}
			]
		}
	}
}

# 19 - 20
POST /ds-banyan-weibo-user-index/user/_search
{
	"size": 10,
	"query": {
		"bool": {
			"must": [
				{
					"range": {
						"update_time": {
							"gte": "1546272000",
							"lt":  "1577808000"
						}
					}
				}
			]
		}
	}
}


# 20 -now
POST /ds-banyan-weibo-user-index/user/_search
{
	"size": 100,
	"query": {
		"bool": {
			"must": [
				{
					"range": {
						"update_time": {
							"gte": "1577808000",
							"lt":  "1594801290"
						}
					}
				}
			]
		}
	}
}


POST /ds-banyan-weibo-user-index/user/_search
{
	"size": 10,
	"query": {
		"bool": {
			"must": [
				{
					"range": {
						"update_time": {
							"gte": "1577808000",
							"lt":  "1594801290"
						}
					}
				},{
        "exists":{
          "field":"id"
        }
				}
			]
		}
	}
}




###------------------------------------------------------------------
########################## 新闻论坛敏感库 ##########################



GET ds-banyan-newsforum-private-post-all-v1/post/_search
{
  "size": 10,
	"query": {
		"bool": {
			"must": [{
				"term": {
				  "site_id": {
				    "value": "1228161"
				  }
				}
			}]
		}
	}
}

GET ds-banyan-newsforum-private-post-all-v1/post/_search
{
  "size": 10,
	"query": {
		"bool": {
			"must": [{
				"term": {
				  "site_id": {
				    "value": "1228164"
				  }
				}
			}]
		}
	}
}

###------------------------------------------------------------------
########################## 新闻论坛 ##########################



POST /ds-banyan-newsforum-post-year-2020-v3/post/_search
{
	"size": 10,
	"query": {
		"bool": {
			"must": [{
        "exists":{
          "field":"post_type"
        }
				}
			]
		}
	}
}


GET /ds-banyan-newsforum-post-year-2020-v3/post/_search
{
  "size": 10,
	"query": {
		"bool": {
			"must": [{
				"match_all": {

				}
			}]
		}
	}
}

GET /ds-banyan-newsforum-post-year-2020-v3/post/_search
{
  "size": 10,
	"query": {
		"bool": {
			"must": [{
				"match": {
				  "site_name": "知乎"
				}
			}]
		}
	}
}

GET /ds-banyan-newsforum-post-year-2020-v3/post/_search
{
  "size": 10,
	"query": {
		"bool": {
			"must": [{
				"term": {
				  "cat_id": {
				    "value": "知乎"
				  }
				}
			}]
		}
	}
}



## update_timestamp=today
POST /ds-banyan-newsforum-post-index-v3/post/_search
{
	"size": 10,
	"query": {
		"bool": {
			"must": [
				{
					"range": {
						"update_timestamp": {
							"gte": "1595174400000",
							"lt":  "1595260800000"
						}
					}
				}
			]
		}
	}
}


POST /ds-banyan-newsforum-post-index-v3/post/_search
{
	"size": 10,
	"query": {
		"bool": {
			"must": [
				{
					"range": {
						"update_timestamp": {
							"gte": "1595174400000",
							"lt":  "1595260800000"
						}
					}
				},				{
					"range": {
						"first_crawler_timestamp": {
							"lt":  "1595174400000"
						}
					}
				}
			]
		}
	}
}


POST /ds-banyan-newsforum-post-index-v3/post/_search
{
	"size": 10,
	"query": {
		"bool": {
			"must": [
				{
					"range": {
						"update_timestamp": {
							"gte": "1595174400000",
							"lt":  "1595260800000"
						}
					}
				},				{
					"range": {
						"first_crawler_timestamp": {
							"gte": "1587312000000",
							"lt":  "1595174400000"
						}
					}
				}
			]
		}
	}
}




POST /ds-banyan-newsforum-post-year-2020-v3/post/_search
{
	"query": {
		"bool": {
			"must": [{
				"match_all": {}
			}],
			"filter": [{
				"script": {
					"script": {
						"inline": "doc['update_timestamp'].value - doc['first_crawler_timestamp'].value == 0",
						"lang": "painless"
					}
				}
			}],
			"must_not": [],
			"should": []
		}
	},
	"from": 0,
	"size": 10
}



POST /ds-banyan-newsforum-post-year-2020-v3/post/_search
{
	"size": 10,
	"query": {
		"bool": {
			"must": [
				{
					"range": {
						"update_timestamp": {
							"gte": 20170916224301,
							"lt": 20170918224301
						}
					}
				}
			]
		}
	}
}


GET ds-banyan-newsforum-post-year-2020-v3/post/_search
{
  "query":{
    "bool":{
      "must":{
        "exists":{
          "field":"first_crawler_timestamp"
        }
      }
    }
  }
}

###------------------------------------------------------------------
########################## 其他任务命令 ##########################


GET ds-banyan-weibo-user-index/user/_search
{
  "query": {
    "bool": {
      "must": [
        {
          "range": {
            "birthdate": {
              "gte": "1960-01-01",
              "lt": "2020-07-01"
            }
          }
        },
        {
          "term": {
            "province": {
              "value": "44"
            }
          }
        },
        {
          "term": {
            "city": {
              "value": "1"
            }
          }
        }
      ],
      "must_not": [
        {
          "term": {
            "user_type": {
              "value": "2"
            }
          }
        }
      ]
    }
  },
  "size": 1
}


GET ds-banyan-video-post-all-v2/post/_search
{
	"size": 10,
	"query": {
		"bool": {
			"must": [
				{
					"range": {
						"update_date": {
							"gte": 20170916224301,
							"lt": 20170918224301
						}
					}
				}
			]
		}
	}
}


POST ds-banyan-newsforum-post-index-v3/post/_search
{
	"query": {
		"bool": {
			"must": [{
				"range": {
					"@timestamp": {
						"gte": "202006011200",
						"lt": "202007081200",
						"format": "yyyyMMddHHmm",
						"time_zone": "+08:00"
					}
				}
			}]
		}
	}
}







##版本新闻
GET ds-banyan-newsforum-post-year-2020-v3/post/_search
{
	"query": {
		"bool": {
			"must": [{
				"term": {
					"id": "d33796f3cc39d4dec424751c68ced5a6"
				}
			}]
		}
	}
}

# 获取别名
GET /*/_alias/ds-banyan-video-post-index
# 获取别名
GET /ds-banyan-newsforum-post-year-2020-v3/_alias/*



GET ds-banyan-weibo-post-quarter-202007-v6/post/_search
{
	"query": {
		"bool": {
			"must": [{
				"term": {
					"id": "1362cdfa6bd2adf1a8c795e0e49256c9"
				}
			}]
		}
	}
}


GET ds-banyan-newsforum-comment-year-2020-v3/comment/_search
{
	"size": 0,
	"query": {
		"bool": {
			"must": [{
					"term": {
						"page_id": "93d0293a571127a0222f93ad8ba95dc4"
					}
				},
				{
					"range": {
						"crawler_timestamp": {
							"gte": 1593597224000,
							"lt": 1594288424000
						}
					}
				}
			]
		}
	},
	"aggs": {
		"groupDate": {
			"date_histogram": {
				"field": "interaction_cnt",
				"min_doc_count": 0,
				"interval": "1d",
				"offset": "-8h"
			}
		}
	}
}


#
GET ds-banyan-newsforum-comment-year-2020-v3/comment/_search
{
	"size": 10,
	"query": {
		"bool": {
			"must": [
				{
					"range": {
						"crawler_timestamp": {
							"gte": 1593597224000,
							"lt": 1594288424000
						}
					}
				}
			]
		}
	}
}



GET ds-banyan-video-post-index/post/_search
{
	"size": 0,
	"query": {
		"bool": {
			"must": [
				{
					"range": {
						"_ctime": {
							"gte": 1593597224000,
							"lt": 1594288424000
						}
					}
				}
			]
		}
	}
}


GET ds-banyan-newsforum-comment-year-2020-v3/comment/_search
{
	"size": 0,
	"query": {
		"bool": {
			"must": [
				{
					"range": {
						"crawler_timestamp": {
							"gte": 1593597224000,
							"lt": 1594288424000
						}
					}
				}
			]
		}
	},
	"aggs": {
		"groupbyCount": {
			"date_histogram": {
				"field": "author_name.raw",
				"min_doc_count": 0,
				"interval": "1d",
				"offset": "-8h"
			}
		}
	}
}

GET /ds-banyan-newsforum-comment-index-v3/comment/_search
{
  "size" : 10,
  "query" : {
    "constant_score" : {
      "filter" : {
        "range" : {
          "crawler_timestamp" : {
              "gte": 202007011200,
              "lt": 202007011210,
              "format": "yyyyMMddHHmm",
              "time_zone": "+08:00"
          }
        }
      }
    }
  }
}

GET /ds-banyan-newsforum-comment-index-v3/comment/_search
{
  "size" : 10,
  "query" : {
    "constant_score" : {
      "filter" : {
        "range" : {
          "crawler_timestamp" : {
              "gte": 202007011200,
              "lt": 202007011210,
              "format": "yyyyMMddHHmm",
              "time_zone": "+08:00"
          }
        }
      }
    }
  }
}


GET /ds-banyan-newsforum-comment-index-v3/comment/_search
{
  "size" : 0,
  "query" : {
    "constant_score" : {
      "filter" : {
        "range" : {
          "crawler_timestamp" : {
              "gte": 202007011200,
              "lt": 202007021200,
              "format": "yyyyMMddHHmm"
          }
        }
      }
    }
  }
}


GET ds-banyan-newsforum-post-index-v3/post/_search
{
  "size" : 0,
  "query" : {
    "constant_score" : {
      "filter" : {
        "range" : {
          "crawler_timestamp" : {
              "gte": 202007011200,
              "lt": 202007031200,
              "format": "yyyyMMddHHmm",
              "time_zone": "+08:00"
          }
        }
      }
    }
  }
}


GET ds-banyan-newsforum-comment-year-2020-v3/comment/_search
{
	"query": {
		"bool": {
			"must": [{
				"term": {
					"id": "1316167545"
				}
			}]
		}
	}
}


GET ds-banyan-weibo-post-quarter-202007-v6/post/_search
{
	"query": {
		"bool": {
			"must": [{
				"term": {
					"id": "520e05358b80296531e87ab50d9db665"
				}
			}]
		}
	}
}

GET ds-banyan-weibo-post-quarter-202007-v6/post/_search
{
	"query": {
		"bool": {
			"must": [{
				"term": {
					"id": "25fa9b6bbf0d065289ac387fd8b2b0a9"
				}
			}]
		}
	}
}


POST /_aliases
{
  "actions": [
    {
      "add": {
        "index": "ds-banyan-video-user-index-v3",
        "alias": "ds-banyan-video-user-index"
      }
    }
  ]
}

GET ds-banyan-weibo-post-quarter-202004-v6/post/_search
{
	"query": {
		"bool": {
			"must": [{
				"term": {
					"id": "d83b2a6ad26951ec5419c00f336b8f80"
				}
			}]
		}
	}
}


GET ds-banyan-video-post-index/post/_search
{
	"query": {
		"bool": {
			"must": [{
				"term": {
					"cat_id": "4"
				}
			}]
		}
	}
}

GET ds-banyan-video-post-index/post/_search
{
	"query": {
		"bool": {
			"must": [{
				"term": {
					"id": "1fa51d813450e50d37dfc5bf82721e2b"
				}
			}]
		}
	}
}



POST /ds-banyan-video-post-all-v1/post/_search
{
  "query":{
    "bool":{
      "must":{
        "exists":{
          "field":"is_ad"
        }
      }
    }
  }
}





POST /ds-banyan-video-post-all-v1/post/_search
{
  "query":{
    "bool":{
      "must":{
        "exists":{
          "field":"video_tags"
        }
      }
    }
  }
}



GET /ds-banyan-video-post-all-v1/post/_search
{
	"query": {
		"bool": {
			"must": [{
				"term": {
					"id": "248f5fd1d22bb96d4d027a7db5e3e341"
				}
			}]
		}
	}
}

#更新索引
PUT /ds-banyan-video-post-all-v2/_mapping/post
{
	"post": {
		"properties": {
			"navigation_desc": {
				"type": "text",
				"analyzer": "wordsEN",
				"fields": {
					"raw": {
						"type": "keyword"
					}
				}
			},
			"video_tags": {
				"type": "keyword"
			}
		}
	}
}








POST ds-banyan-video-user-index-v3/user/_search
{
	"query": {
		"bool": {
			"must": [{
				"range": {
					"@timestamp": {
						"gte": "202007011200",
						"lt": "202007101800",
						"format": "yyyyMMddHHmm",
						"time_zone": "+08:00"
					}
				}
			}]
		}
	},
	"aggs": {
		"count": {
			"sum": {
				"field": "sdk_normal.realTotal"
			}
		}
	}
}


POST ds-banyan-video-user-index-v3/user/_search
{
	"query": {
		"bool": {
			"must": [{
				"range": {
					"crawler_date": {
						"from": "20200708163503"
						,"to":"20200710163503"
						,"time_zone": "+08:00"
					}
				}
			}]
		}
	}
}



#视频用户V3查询
GET ds-banyan-video-user-index-v3/user/_search
{
	"query": {
		"bool": {
			"must": [{
				"term": {
					"id": "43061676f914b49d665f31fed1bc90d8"
				}
			}]
		}
	}
}

GET ds-banyan-video-user-index-v3/user/_search
{
	"query": {
		"bool": {
			"must": [{
				"term": {
					"id": "43061676f914b49d665f31fed1bc90d8"
				}
			}]
		}
	}
}


GET /test_date_index_ds/test/_search
{
	"query": {
		"bool": {
			"match_all": [{

			}]
		}
	}
}

## QUERY
GET /test_date_index_ds/test/_search
{
	"query": {
		"bool": {
			"must": [{
				"match_all": {}
			}]
		}
	}
}

POST /test_date_index_ds/test/3456ytr
{
  "id":"3456ytr",
	"@timestamp": 3419000,
	"timestamp":"2021-11-15",
	"color": "金色",
	"brand": "大众",
	"model": "大众迈腾",
	"sold_date": "2017-10-28",
	"remark": "大众中档车"
}


POST /test_date_index_ds/test/3456ytr
{
  "group" : "task_source",
  "task_id_array2" : [
    {
      "field" : "20200716",
      "value" :  "34445"
    },
    {
      "field" : "20200715",
      "value" :  "8907"
    }
  ]
}

POST /test_date_index_ds/test/3456ytr/_update
{
  "doc": {
      "task_id_array2" : [
    {
      "field" : "aaa",
      "value" :  "1111111"
    },
    {
      "field" : "bbb",
      "value" :  "2222"
    }
  ],  "id":"3456ytr",
	"@timestamp": 3419000,
	"timestamp":"2021-11-15",
	"color": "金色",
	"brand": "大众",
	"model": "大众迈腾",
	"sold_date": "2017-10-28",
	"remark": "大众中档车"

  }

}

GET /test_date_index_ds/_mapping
POST /test_date_index_ds/test/3456ytr/_update
{
  "doc": {
      "task_id_array2" : [
    {
       "ty" :  "5557855"
    }
  ]
  },
    "doc_as_upsert" : true

}

GET /test_date_index_ds/test/_search
{
	"query": {
		"bool": {
			"must": [{
				"match_all": {}
			}]
		}
	}
}

POST /test_date_index_ds/test/3456ytr/_update
{
  "doc": {
      "task_id_array2" : [
    {
       "taks_11111":"11111"
    }
  ]
  }

}

POST /test_date_index_ds/test/3456ytr/_update
{
  "doc": {
      "task_id_array2" : [
    {
       "oppp" :  "5557855"
    }
  ]
  }
}


POST /test_date_index_ds/test/55675
{
  "tags":["tag1", "tag2", "tag3"]
}



POST /test_date_index_ds/test/55675
{
  "tags":["tag1", "tag2", "tag3"]
}


POST /test_date_index_ds/test/55675/_update
{
   "script" : {
       "inline": "ctx._source.tags.add(params.new_tag)",
       "params" : {
          "new_tag" : "tag4"
       }
   }
}


POST /test_date_index_ds/test/3456ytr
{
  "group" : "task_source",
  "task_id_array2" : [
    {
      "field" : "ccc",
      "value" :  "3333",
      "times":1
    },
    {
      "field" : "ddd",
      "value" :  "4444"
    }
  ]
}



###------------------------------------------------------------------
########################## 创建索引 ##########################

DELETE test_auto_time_index

## 创建 ingest 处理器
PUT _ingest/pipeline/timestamp
{
  "description" : "Adds a timestamp field at the current time",
  "processors" : [ {
    "set" : {
      "field": "timestamp",
      "value": "{{_ingest.timestamp}}"
    }
  } ]
}

GET /test_auto_time_index/_mapping

## 创建索引
PUT /test_date_index_ds22/
{
	"settings": {
		"index.number_of_shards": 3,
		"index.number_of_replicas": 1,
		"index.refresh_interval": "30s",
		"index.routing.allocation.total_shards_per_node": 3
	},
	"mappings": {
		"test": {
			"_all": {
				"enabled": false
			},
			"properties": {
				"title": {
					"type": "keyword"
				}
			}
		}
	}
}

## 导入数据
POST /test_auto_time_index/doc/1?pipeline=timestamp
{
	"color": "金色1",
	"brand": "大众",
	"model": "大众迈腾",
	"title": "大众中档车"
}

POST /test_auto_time_index/doc/1?pipeline=timestamp
{
	"color": "金色2",
	"brand": "大众",
	"model": "大众迈腾",
	"title": "大众中档车"
}

POST /test_auto_time_index/doc/2?pipeline=timestamp
{
	"color": "黑色",
	"brand": "豪车",
	"model": "奔驰",
	"title": "奔驰高档车"
}

POST /test_auto_time_index/doc/2?pipeline=timestamp
{
	"color": "黑色1",
	"brand": "豪车",
	"model": "奔驰",
	"title": "奔驰高档车"
}

POST /test_auto_time_index/doc/3_update?pretty&pipeline=timestamp
{
	"color": "蓝色1",
	"brand": "飞机",
	"model": "波音",
	"title": "波音高级客机"
}

POST /test_auto_time_index/doc/3_update?pretty&pipeline=timestamp
{
	"color": "蓝色2",
	"brand": "飞机",
	"model": "波音",
	"title": "波音高级客机"
}


GET /test_auto_time_index/doc/_search
{
	"query": {
		"bool": {
			"must": [{
				"match_all": {}
			}]
		}
	}
}


## no longer use timestamp after ES v5,use ingest to repace this
PUT /test_auto_time_index/
{
	"mappings": {
		"doc": {
			"properties": {
				"_timestamp": {
				  "type": "keyword",
				  "store" : true
				},"_ttl": {
				  "type": "date",
				  "store" : true
				},"@timestamp": {
             "format":"strict_date_optional_time||epoch_millis",
             "type":"date",
             "enabled":true
				},"title": {
					"type": "keyword"
				}
			}
		}
	}
}


###------------------------------------------------------------------
########################## 更新索引 ##########################

GET /test_date_index_ds/_mapping

PUT /test_date_index_ds/_mapping/test
{
	"test": {
		"properties": {
				"@timestamp": {
					"type": "date"
				}
		}
	}
}

PUT /test_date_index_ds2/_mapping/test
{
	"test": {
		"properties": {
			"@timestamp": {
				"format": "strict_date_optional_time||epoch_millis",
				"type": "date",
				"enabled": true
			}
		}
	}
}

PUT /test_date_index_ds/_mapping/test
{
	"test": {
		"properties": {
			"task_id_array2": {
				"type": "nested",
				"properties": {
					"field": {
						"type": "keyword"
					},
					"value": {
						"type": "keyword"
					},
					"times": {
						"type": "integer"
					}
				}
			}
		}
	}
}


PUT /test_date_index_ds/_mapping/test
{
	"test": {
		"properties": {
      "timestamp": {
      "type": "date",
      "format": "yyyy-MM-dd"
      }
		}
	}
}



