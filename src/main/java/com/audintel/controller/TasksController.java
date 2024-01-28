package com.audintel.controller;
import com.audintel.dao.Employee;
import com.audintel.dao.Task;
import com.audintel.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class TasksController {
        @Autowired
        TaskService service;

        @PostMapping("/task")
        public Task save(@RequestBody Task task) {

            return service.savetask(task);
        }
    @DeleteMapping("/taskdel/{id}")
    public void delete (@PathVariable int id){
        service.deletetask(id);
    }
    @GetMapping("taskget/{id}")
    public Task getTask(@PathVariable Integer id){

        return service.getTask(id);
    }
    @PutMapping("taskupdate/{id}")
    public Task updatetask(@PathVariable int id,@RequestBody Task task ){
        return service.updateTask(id,task);
    }




    }
