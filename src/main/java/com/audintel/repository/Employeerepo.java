package com.audintel.repository;

import com.audintel.dao.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employeerepo extends CrudRepository<Employee,Integer> {

}
