package com.example.job_manager_mongo_swagger.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class JobRegistration {

    private String jobType;

    private String area;

    private String startDate;

    private String endDate;

    private String document;
}
