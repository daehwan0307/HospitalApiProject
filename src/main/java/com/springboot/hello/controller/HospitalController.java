package com.springboot.hello.controller;


import com.springboot.hello.domain.Hospital;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hospital")
public class HospitalController {

    @RequestMapping("/request-dto")
    public String getNameDto(Hospital hospital){
        return hospital.getHospitalName();
    }
}
