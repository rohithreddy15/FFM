package com.audintel.service;
import com.audintel.dao.Plan;
import com.audintel.dao.Task;
import com.audintel.dao.Visit_info;
import com.audintel.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
@Service
public class TaskService {
    @Autowired
    TaskRepository repo;

    public Task savetask(Task b){
        return  repo.save(b);
    }
  public Task updateTask(int id,Task newObj){
        Optional<Task> b1=repo.findById(id);
      Task task;
        if(b1.isPresent()){
            task=b1.get();
            task.setAssigned_to(newObj.getAssigned_to());
            task.setCreated_by(newObj.getCreated_by());
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
//    public float totaldistance(int empid){
//        List<Task> tasks=repo.findCreated_by(empid);
//        float td=0.0f;
//        for(Task t:tasks){
//            if(t.getStatus()!=null && t.getCompleted_date()!=null){
//                td+=calculatedistance(t.getVisitInfo().getFrom_latitude(),t.getVisitInfo().getFrom_longitude(),t.getVisitInfo().getTo_latitude(),t.getVisitInfo().getTo_longitude());
//            }
//        }
//        System.out.println(td);
//        return td;
//    }
//
//    public float calculatedistance(float fromlatitude,float fromlongitude,float tolatitude,float tolongitude){
//        int earthRadius = 6371;
//
//        float dLat = (float) Math.toRadians(tolatitude - fromlatitude);
//        float dLon = (float) Math.toRadians(tolongitude - fromlongitude);
//
//        float a = (float) (Math.sin(dLat / 2) * Math.sin(dLat / 2) +
//                Math.cos(Math.toRadians(fromlatitude)) * Math.cos(Math.toRadians(tolatitude)) *
//                        Math.sin(dLon / 2) * Math.sin(dLon / 2));
//
//        float c = 2 * (float) Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
//
//        return earthRadius * c;
//    }
}
