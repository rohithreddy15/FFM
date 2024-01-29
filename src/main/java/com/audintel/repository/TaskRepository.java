package com.audintel.repository;

import com.audintel.dao.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
    public interface TaskRepository extends JpaRepository<Task,Integer> {
      //  List<Task> findCreated_by(int empid);
//    @Query("SELECT t FROM Task t WHERE t.assigned_to = employeeId")
//    List<Task> findByEmployeeId(@Param("employeeId") int employeeId);
    }



