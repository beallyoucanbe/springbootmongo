package com.shuoyi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Created by zhaosy-c on 2017/9/28.
 */
public class MongodataService {

    @Autowired
    MongoTemplate mongoTemplate;

}
