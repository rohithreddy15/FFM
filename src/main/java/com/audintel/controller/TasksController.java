package com.audintel.controller;
import com.audintel.dao.Task;
import com.audintel.FFM.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class TasksController {
        @Autowired
        TaskService service;

        @PostMapping("/Booking")
        public Task save(@RequestBody Task Task) {
//        Bookings booking=new Bookings();
//        booking.setId(1);
//        booking.setFrm("Chennai");
//        booking.setT("Hyderabad");
            return service.saveTask(Task);
        }

        @GetMapping("/Task")
        void find() {
            System.out.println(service.getTask(1));

        }

        @RequestMapping(method = RequestMethod.GET, value = "/Task/id={id}")

        @PutMapping("/Task")
        public Task update(@RequestBody Task booking) {
            return service.updateTask;
        }


    }
