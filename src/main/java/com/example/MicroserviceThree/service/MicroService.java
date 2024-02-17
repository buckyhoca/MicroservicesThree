package com.example.MicroserviceThree.service;

import com.example.MicroserviceThree.response.EmployeeResponse;

public interface MicroService {
    EmployeeResponse getEmployeeInformation(int id);

}
