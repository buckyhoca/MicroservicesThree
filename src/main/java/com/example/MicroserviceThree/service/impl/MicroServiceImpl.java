package com.example.MicroserviceThree.service.impl;
import com.example.MicroserviceThree.feignclient.EmployeeClient;
import com.example.MicroserviceThree.response.EmployeeResponse;
import com.example.MicroserviceThree.service.MicroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public class MicroServiceImpl implements MicroService {


    @Autowired
    private EmployeeClient employeeClient;

    @Override
    public EmployeeResponse getEmployeeInformation(int id) {
        ResponseEntity<EmployeeResponse> eployeeInformation = employeeClient.getEmployeeInformations(id);
        return eployeeInformation.getBody();
    }
}
