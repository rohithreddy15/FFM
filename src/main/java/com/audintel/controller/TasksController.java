package com.audintel.controller;
import com.audintel.dao.Task;
import com.audintel.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class TasksController {
        @Autowired
        TaskService service;

        @PostMapping("/task")
        public Task save(@RequestBody Task task) {

            return service.savetask(task);
        }

        @GetMapping("/task/{id}")
        public Task gettask(@PathVariable int id) {
            return service.gettask(id);
        }




    }
