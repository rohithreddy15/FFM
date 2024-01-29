package com.audintel.service;

import com.audintel.dao.Employee;
import com.audintel.repository.Employeerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Loginservice {
    @Autowired
    private Employeerepo repo;
    public boolean validateuser(Employee emp){
        Employee employee=repo.findByLoginid(emp.getLoginid());
        return employee!=null  && employee.getPassword().equals(emp.getPassword());
    }

    public Employee getemployeeLoginid(String loginid) {
        return repo.findByLoginid(loginid);
    }
}
