package com.audintel.repository;

import com.audintel.dao.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Employeerepo extends JpaRepository<Employee,Integer> {
    Employee findByLoginid(String login_id);
}
