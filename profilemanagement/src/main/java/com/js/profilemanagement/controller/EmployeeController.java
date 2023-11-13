package com.js.profilemanagement.controller;

import com.js.profilemanagement.domain.EmployeeProfile;
import com.js.profilemanagement.service.EmployeeProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( value = "/")
public class EmployeeController {

    @Autowired
    EmployeeProfileService employeeProfileService;

    @PostMapping
    public void saveEmployeeProfile(@RequestBody EmployeeProfile employeeProfile) {
        employeeProfileService.addEmployeeProfile( employeeProfile);
    }

    @GetMapping
    public List<EmployeeProfile> getAllEmployee() {
        return employeeProfileService.getEmployeeProfiles();
    }
}
