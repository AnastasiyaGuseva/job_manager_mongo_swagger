package com.example.job_manager_mongo_swagger.controller;

import com.example.job_manager_mongo_swagger.model.JobRegistration;
import com.example.job_manager_mongo_swagger.model.Manager;
import com.example.job_manager_mongo_swagger.service.JobManagerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "job_manager", description = "API для управления текущими работами")
@RequiredArgsConstructor
public class JobManagerController {

    private final JobManagerService jobManagerService;

    @PostMapping("/registration_manager")
    @Operation(summary = "Регистрация ответственного лица")
    public String managerRegistration(@RequestBody Manager manager) {
        return jobManagerService.save(manager);
    }

    @PostMapping("/registration_job")
    @Operation(summary = "Регистрация плановой работы")
    public String jobRegistration(@RequestBody JobRegistration jobRegistration) {
        return jobManagerService.save(jobRegistration);
    }

    @PostMapping("/auth_manager")
    @Operation(summary = "Авторизация менеджера")
    @Parameter(name = "fullName", description = "ИМЯ ОТВЕТСТВЕННОГО СОТРУДНИКА", example = "Сидоров Сидр Сидорович")
    public String authManager(@RequestParam String fullName) {
return null;
    }
}
