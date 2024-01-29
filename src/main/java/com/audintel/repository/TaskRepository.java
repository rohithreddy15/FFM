package com.audintel.repository;

import com.audintel.dao.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;


@Repository
    public interface TaskRepository extends CrudRepository<Task,Integer> {
       // List<Task> findCreated_by(int empid);
    @Query("SELECT t FROM Task t WHERE t.assigned_to = ?1")

    List<Task> findByAssigned_to(@Param("empid") int empid);
    }



//@Query("SELECT u FROM User u WHERE u.status = ?1") User findUserByStatus(Integer status);
//@Query("SELECT u FROM User u WHERE u.status = ?1 and u.name = ?2") User findUserByStatusAndName(Integer status, String name);


