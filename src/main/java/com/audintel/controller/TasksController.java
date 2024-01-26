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
        public Task save(@RequestBody Task Task) {

            return service.savetask(Task);
        }

//        @GetMapping("/Task")
//        void find() {
//            System.out.println(service.getTask(1));
//
//        }
//
//        @RequestMapping(method = RequestMethod.GET, value = "/Task/id={id}")
//
//        @PutMapping("/Task")
//        public Task update(@RequestBody Task booking) {
//            return service.updateTask;
//        }


    }
