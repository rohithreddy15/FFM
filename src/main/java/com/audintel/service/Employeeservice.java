package com.audintel.service;

import com.audintel.dao.Employee;
import com.audintel.repository.Employeerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class Employeeservice {
    @Autowired
    Employeerepo emprepo;
    public Employee saveemployee(Employee emp){

        return emprepo.save(emp);
    }
    public void deleteemp(int empcode){
        emprepo.deleteById(empcode);
    }
    public Employee getemployee(int empcode){
        Optional<Employee> b= emprepo.findById(empcode);
        return b.orElse(null);
    }
    public Employee updateemp(int empcode, Employee updatedemp){
        Optional<Employee> existingEmpOptional = emprepo.findById(empcode);

        if (existingEmpOptional.isPresent()) {
            Employee existingEmp = existingEmpOptional.get();
            existingEmp.setFirst_name(updatedemp.getFirst_name());
            existingEmp.setLast_name(updatedemp.getLast_name());
            existingEmp.setDateofjoin(updatedemp.getDateofjoin());
            existingEmp.setDateofbirth(updatedemp.getDateofbirth());
            existingEmp.setMgrid(updatedemp.getMgrid());
            existingEmp.setRoleid(updatedemp.getRoleid());
            existingEmp.setLoginid(updatedemp.getLoginid());
            existingEmp.setPassword(updatedemp.getPassword());
            existingEmp.setAddressline_1(updatedemp.getAddressline_1());
            existingEmp.setAddressline_2(updatedemp.getAddressline_2());
            existingEmp.setStreet(updatedemp.getStreet());
            existingEmp.setArea(updatedemp.getArea());
            existingEmp.setMandal(updatedemp.getMandal());
            existingEmp.setDistrict(updatedemp.getDistrict());
            existingEmp.setCity(updatedemp.getCity());
            existingEmp.setState(updatedemp.getState());
            existingEmp.setCreated_at(updatedemp.getCreated_at());
            existingEmp.setCreated_by(updatedemp.getCreated_by());
            existingEmp.setUpdated_at(updatedemp.getUpdated_at());
            existingEmp.setUpdated_by(updatedemp.getUpdated_by());
            existingEmp.setIsactive(updatedemp.getIsactive());
            return emprepo.save(existingEmp);
        } else {
            throw new NoSuchElementException("Employee not found with id: " + empcode);
        }

    }
    public Employee getemployeeLoginid(String loginid) {
        return emprepo.findByLoginid(loginid);
    }
}
