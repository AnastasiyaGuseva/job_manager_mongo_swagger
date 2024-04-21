package com.example.job_manager_mongo_swagger.service;

import com.example.job_manager_mongo_swagger.model.JobRegistration;
import com.example.job_manager_mongo_swagger.model.Manager;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobManagerServiceImpl implements JobManagerService {

    private final MongoTemplate mongoTemplate;

    @Override
    public String save(Object manager) {
       mongoTemplate.save(manager);
       return "Успешное сохранение";
    }

    @Override
    public List<JobRegistration> notApproveJob(String fullName) {
       return null;
    }


}
