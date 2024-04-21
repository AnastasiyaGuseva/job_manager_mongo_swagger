package com.example.job_manager_mongo_swagger.dao;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class QueryPool {

    /**
     * запрос возвращает район
     */
    public static Query getAreasQuery(String fullName){
       return new Query(Criteria.where("fullName").is(fullName));
    }
}
