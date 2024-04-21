package com.example.job_manager_mongo_swagger.dao;

import com.example.job_manager_mongo_swagger.model.JobApprove;
import com.example.job_manager_mongo_swagger.model.Manager;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

import static java.util.Objects.isNull;

@Repository
@RequiredArgsConstructor
public class JobManagerDaoImpl implements JobManagerDao {

    private final MongoTemplate mongoTemplate;

    @Override
    public List<JobApprove> getJobListByArea(String area) {

        return null;
    }

    @Override
    public String getAreaByFullName(String fullName) {
        List<Manager> managerList = mongoTemplate.find(QueryPool.getAreasQuery(fullName), Manager.class);
        if (!managerList.isEmpty()) {
            Manager manager = managerList.get(0);
            if (!isNull(manager)) {
                return manager.getArea();
            }
        }
        return "Пользователя нет в системе";
    }

}
