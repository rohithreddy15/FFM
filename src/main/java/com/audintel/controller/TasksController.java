package com.audintel.controller;
import com.audintel.dao.Task;
import com.audintel.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TasksController {
        @Autowired
        TaskService service;

        @PostMapping("/task")
        public Task save(@RequestBody Task task) {

            return service.savetask(task);
        }

        @GetMapping("/gettask/{id}")
        public Task gettask(@PathVariable int id) {
            return service.gettask(id);
        }
        @DeleteMapping("/deltask/{id}")
        public void deletetask(@PathVariable int id){
            service.deletetask(id);
        }
        @PutMapping("/updatetask/{id}")
        public Task updatetask(@PathVariable int id,@RequestBody Task t){
            return service.updateTask(id,t);
        }


        @GetMapping("/distance/{empid}")
        float fun(@PathVariable Integer empid ){
            System.out.println(empid);
            return service.fun(empid);
        }
}
