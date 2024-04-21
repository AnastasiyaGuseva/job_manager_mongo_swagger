package com.example.job_manager_mongo_swagger.dao;

import com.example.job_manager_mongo_swagger.model.JobApprove;

import java.util.List;

public interface JobManagerDao {
   List<JobApprove> getJobListByArea(String area);
   String getAreaByFullName(String fullName);
}
