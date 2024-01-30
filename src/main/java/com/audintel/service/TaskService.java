package com.audintel.service;
import com.audintel.dao.Plan;
import com.audintel.dao.Task;
import com.audintel.dao.Visit_info;
import com.audintel.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
@Service
public class TaskService {
    @Autowired
    TaskRepository repo;
    @Autowired
    Visit_infoservice service;

    public Task savetask(Task b){
        return  repo.save(b);
    }
  public Task updateTask(int id,Task newObj){
        Optional<Task> b1=repo.findById(id);
      Task task;
        if(b1.isPresent()){
            task=b1.get();
            task.setAssigned_to(newObj.getAssigned_to());
            task.setCreatedby(newObj.getCreatedby());
            task.setDealerid(newObj.getDealerid());
            task.setDescription(newObj.getDescription());
            task.setStatus(newObj.getStatus());
            task.setAssigned_date(newObj.getAssigned_date());
            task.setCompleted_date(newObj.getCompleted_date());
            return repo.save(task);
        }else{
            throw new NoSuchElementException("Task not found with id: " + id);
        }
    }

    public Task gettask(int id) {
        Optional<Task> b= repo.findById(id);
        return b.orElse(null);
    }

    public void deletetask(int id){
        repo.deleteById(id);
    }
    public List<Task> getalltasks(){
        return (List<Task>) repo.findAll();
    }
    public List<Task> getUrTasks(Integer emid){


         return  repo.findByAssigned_to(emid);
    }

   public float fun(Integer empid){
       System.out.println("enter fun111111111111111111111111");
      List<Task> ob=repo.findByAssigned_to(empid);
       // Task ob=repo.findByAssigned_to(empid);
       System.out.println("ob object    ..........................."+ ob );
      float ans=0;
      for(Task t:ob){
          System.out.println("entered for 5555768222222222222222222222222211111111");
          ans+=service.distance(t.getId());
      }

       System.out.println("entered");
return ans;

    }

}
