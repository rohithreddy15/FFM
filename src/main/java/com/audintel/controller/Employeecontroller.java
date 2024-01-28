package com.audintel.controller;

import com.audintel.dao.Employee;
import com.audintel.service.Employeeservice;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class Employeecontroller {
    @Autowired
    Employeeservice empservice;
    @PostMapping("/emp")
    public Employee save(@RequestBody Employee emp){
        return empservice.saveemployee(emp);
    }
    @DeleteMapping("/empdel/{empcode}")
    public void delete (@PathVariable int empcode){
        empservice.deleteemp(empcode);
    }
    @GetMapping("empget/{empcode}")
    public Employee getemployee(@PathVariable Integer empcode){

        return empservice.getemployee(empcode);
    }
    @PutMapping("empupdate/{empcode}")
    public Employee updateemp(@PathVariable int empcode,@RequestBody Employee emp ){
        return empservice.updateemp(empcode,emp);
    }
}
