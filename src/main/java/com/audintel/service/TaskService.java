package com.audintel.service;
import com.audintel.dao.Employee;
import com.audintel.dao.Task;
import com.audintel.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;
@Service
public class TaskService {
    @Autowired
    TaskRepository repo;

    public Task savetask(Task b){

        return  repo.save(b);
    }
    public void deletetask(int id){
        repo.deleteById(id);
    }
    public Task getTask(int id){
        Optional<Task> b= repo.findById(id);
        return b.orElse(null);
    }
    public Task updateTask(int id,Task updatedtask){
        Optional<Task> b1=repo.findById(id);
      Task task;
        if(b1.isPresent()){
            task=b1.get();
            task.setAssigned_date(updatedtask.getAssigned_date());
            task.setCompleted_date(updatedtask.getCompleted_date());
            task.setDescription(updatedtask.getDescription());
            task.setDealerid(updatedtask.getDealerid());
            task.setCreatedby(updatedtask.getCreatedby());
            task.setStatus(updatedtask.getStatus());
            return repo.save(task);
        }else {
            throw new NoSuchElementException("Employee not found with id: " + id);
        }
    }


}
