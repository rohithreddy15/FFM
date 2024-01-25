package com.audintel.controller;

import com.audintel.dao.Employee;
import com.audintel.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employeecontroller {
    @Autowired
    Employeeservice empservice;
    @PostMapping("/emp")
    public Employee save(@RequestBody Employee emp){
    return empservice.saveemployee(emp);
    }

}
