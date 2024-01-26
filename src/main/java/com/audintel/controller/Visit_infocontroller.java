package com.audintel.controller;

import com.audintel.dao.Visit_info;
import com.audintel.service.Visit_infoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Visit_infocontroller {
    @Autowired
    Visit_infoservice service;
    @PostMapping("/visitinfo")
    public Visit_info savevisit(@RequestBody Visit_info v){
        return service.savevisit(v);
    }
    @GetMapping("/visitinfo/{id}")
    public Visit_info getvisit(@PathVariable int id){
        return service.getvisit(id);
    }
    @DeleteMapping("/visitdel/{id}")
    public void deletevisit(@PathVariable int id){
        service.deletevisit(id);
    }
    @PutMapping("/visitupdate/{id}")
    public Visit_info updatevisit(@PathVariable int id,@RequestBody Visit_info v){
        return service.updatevisit(id,v);
    }

}
