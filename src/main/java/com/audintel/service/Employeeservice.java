package com.audintel.service;

import com.audintel.dao.Employee;
import com.audintel.repository.Employeerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Employeeservice {
    @Autowired
    Employeerepo emprepo;
    public Employee saveemployee(Employee emp){
        return emprepo.save(emp);
    }
    public Employee getemployee(int empcode){
        Optional<Employee> b= emprepo.findById(empcode);
        return b.orElse(null);
    }
}
