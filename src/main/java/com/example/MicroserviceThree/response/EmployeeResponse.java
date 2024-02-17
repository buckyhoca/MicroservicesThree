package com.example.MicroserviceThree.response;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeResponse {
    private int id;
    private String name;
    private String email;
    private String age;
    private AddressResponse addressResponse;
}
