package com.audintel.service;

import com.audintel.dao.Dealer;
import com.audintel.dao.Employee;
import com.audintel.repository.Dealerrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class Dealerservice {
    @Autowired
    Dealerrepository drepo;
   public Dealer savedealer(Dealer dealer){
       return drepo.save(dealer);
   }
   public void deletedealer(int id){
       drepo.deleteById(id);
   }
    public Dealer getdealer(int id){
        Optional<Dealer> b= drepo.findById(id);
        return b.orElse(null);
    }
   public Dealer updatedealer(int id,Dealer updateddealer){
       Optional<Dealer> b=drepo.findById(id);
       if(b.isPresent()){
           Dealer olddealer=b.get();
           olddealer.setFirst_name(updateddealer.getFirst_name());
           olddealer.setLast_name(updateddealer.getLast_name());
           olddealer.setAddress_line1(updateddealer.getAddress_line1());
           olddealer.setAddress_line2(updateddealer.getAddress_line2());
           olddealer.setStreet(updateddealer.getStreet());
           olddealer.setArea(updateddealer.getArea());
           olddealer.setMandal(updateddealer.getMandal());
           olddealer.setDistrictid(updateddealer.getDistrictid());
           olddealer.setCityid(updateddealer.getCityid());
           olddealer.setStateid(updateddealer.getStateid());
            return drepo.save(olddealer);
       }
       else{
           throw new NoSuchElementException("Employee not found with id: " + id);
       }

   }

}
