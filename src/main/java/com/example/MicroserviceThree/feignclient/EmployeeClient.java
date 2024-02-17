package com.example.MicroserviceThree.feignclient;


import com.example.MicroserviceThree.response.EmployeeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="employee-service", url="http://localhost:8080", path="/employee-service")
public interface EmployeeClient {

    @GetMapping("/employees/{id}")
    ResponseEntity<EmployeeResponse> getEmployeeInformations(@PathVariable("id") int id);

}
