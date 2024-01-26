package com.audintel.service;
import com.audintel.dao.Task;
import com.audintel.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class TaskService {
    @Autowired
    TaskRepository repo;

    public Task savetask(Task b){

        return  repo.save(b);
    }
//    void updateTask(Task newObj){
//        Optional<Task> b1=getTask(newObj.getId());
//      Task task;
//        if(b1.isPresent()){
//            task=b1.get();
//            task.setAssigned_date();
//            task.setCompleted_date();
//            task.setDescription();
//            task.setDealerid();
//            task.setCreatedby();
//            task.setStatus();
//            repo.save(task);
//        }
//    }

    public Optional<Task> getBooking(int id) {
        return repo.findById(id);
    }
}
