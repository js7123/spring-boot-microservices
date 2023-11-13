package com.js.profilemanagement.service;

import com.js.profilemanagement.domain.EmployeeProfile;

import java.util.List;

public interface EmployeeProfileService {
    void addEmployeeProfile(EmployeeProfile profile);

    List<EmployeeProfile> getEmployeeProfiles();
}
