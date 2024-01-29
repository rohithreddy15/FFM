package com.audintel.repository;

import com.audintel.dao.Task;
import com.audintel.dao.Visit_info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Visit_inforepository extends JpaRepository<Visit_info,Integer> {
//  @Query("SELECT v FROM Visit_info v WHERE v.task_id = ?1 ")
//    Visit_info findByTask_Id( @Param("taskId") int taskId);

    @Query("SELECT t FROM Visit_info t WHERE t.taskid = :id")

    Visit_info findByTask_Id(@Param("id") Integer id);
}
