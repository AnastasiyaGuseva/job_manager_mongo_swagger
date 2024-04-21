package com.example.job_manager_mongo_swagger.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class JobApprove {
    private String jobType;

    private String area;

    private String startDate;

    private String endDate;

    private String signType;
}
