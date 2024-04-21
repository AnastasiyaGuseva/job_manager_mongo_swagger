package com.example.job_manager_mongo_swagger.service;

import com.example.job_manager_mongo_swagger.model.JobRegistration;
import com.example.job_manager_mongo_swagger.model.Manager;

import java.util.List;

public interface JobManagerService {
    String save(Object value);
    List<JobRegistration> notApproveJob(String fullName);
}
