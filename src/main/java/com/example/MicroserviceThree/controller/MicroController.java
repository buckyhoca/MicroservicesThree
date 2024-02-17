package com.example.MicroserviceThree.controller;

import com.example.MicroserviceThree.response.EmployeeResponse;
import com.example.MicroserviceThree.service.MicroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class MicroController {

    @Autowired
    MicroService microService;

    @GetMapping("/employee/{id}")
    public ResponseEntity<EmployeeResponse> getUserInformations(@PathVariable("id") int id){
        return ResponseEntity.ok().body(microService.getEmployeeInformation(id));
    }


}
