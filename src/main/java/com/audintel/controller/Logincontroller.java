package com.audintel.controller;

import com.audintel.dao.Employee;
import com.audintel.service.Loginservice;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.print.DocFlavor;

@RestController
@CrossOrigin(origins="http://localhost:3000/")
public class Logincontroller {
    @Autowired
    Loginservice service;

    @CrossOrigin(origins="http://localhost:3000/")
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Employee emp) {
        Gson gson = new Gson();
        if (service.validateuser(emp)) {
            Employee emp1 = service.getemployeeLoginid(emp.getLoginid());
            return ResponseEntity.ok(gson.toJson(emp1));
        } else {
            return ResponseEntity.badRequest().body(gson.toJson("Invalid Credentials"));
        }
    }
}