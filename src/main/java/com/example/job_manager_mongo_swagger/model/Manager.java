package com.example.job_manager_mongo_swagger.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "manager_list_info")
@Getter
@Setter
public class Manager {

    private String fullName;

    private String area;

    private String signType;

    private String jobType;
}
