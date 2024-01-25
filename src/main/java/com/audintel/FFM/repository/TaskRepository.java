package com.audintel.FFM.repository;

import com.audintel.FFM.dao.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



    @Repository
    public interface TaskRepository extends CrudRepository<Task,Integer> {

    }


