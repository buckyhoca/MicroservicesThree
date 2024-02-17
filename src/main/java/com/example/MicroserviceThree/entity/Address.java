package com.example.MicroserviceThree.entity;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {

    @Column(name = "id")
    private int id;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;
}
