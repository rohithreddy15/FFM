package com.audintel.repository;

import com.audintel.dao.Visit_info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Visit_inforepository extends JpaRepository<Visit_info,Integer> {
    @Query("SELECT v FROM Visit_Info v WHERE v.task_id = taskId ")
    List<Visit_info> findByTaskId(@Param("taskId") int taskId);
}
