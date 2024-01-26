package com.audintel.controller;

import com.audintel.dao.Dealer;

import com.audintel.service.Dealerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Dealercontroller {
    @Autowired
    Dealerservice dservice ;
    @PostMapping("/dealer")
    public Dealer save(@RequestBody Dealer dealer){
        return dservice.savedealer(dealer);
    }
    @GetMapping("/dealer/{id}")
    public Dealer getDealer(@PathVariable int id){
        return dservice.getdealer(id);
    }
    @DeleteMapping("/dealerdel/{id}")
    public void deletedealer(@PathVariable int id){
        dservice.deletedealer(id);
    }
    @PutMapping("/dealerupdate/{id}")
    public Dealer updatedealer(@PathVariable int id,@RequestBody Dealer d){
        return dservice.updatedealer(id,d);
    }


}
