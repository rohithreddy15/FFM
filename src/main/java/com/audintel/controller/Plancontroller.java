package com.audintel.controller;

import com.audintel.dao.Plan;
import com.audintel.service.Planservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class Plancontroller {
    @Autowired
    Planservice service;
    @PostMapping("/plan")
    public Plan saveplan(@RequestBody Plan p){
        return service.saveplan(p);
    }
    @GetMapping("/getplan/{id}")
    public Plan getplan(@PathVariable int id){
        return service.getplan(id);
    }
    @DeleteMapping("/delplan/{id}")
    public void deleteplan(@PathVariable int id){
        service.deleteplan(id);
    }
    @PutMapping("/updateplan/{id}")
    public Plan updateplan(@PathVariable int id,@RequestBody Plan p){
        return service.updateplan(id,p);
    }
}
