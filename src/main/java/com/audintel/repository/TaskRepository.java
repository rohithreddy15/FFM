package com.audintel.repository;

import com.audintel.dao.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



    @Repository
    public interface TaskRepository extends CrudRepository<Task,Integer> {

    }


