package com.audintel.service;

import com.audintel.dao.Plan;
import com.audintel.dao.Visit_info;
import com.audintel.repository.Planrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class Planservice {
    @Autowired
    Planrepository prepo;
    public Plan saveplan(Plan p){
        return prepo.save(p);
    }
    public Plan getplan(int id){
        Optional<Plan> b= prepo.findById(id);
        return b.orElse(null);
    }
    public void deleteplan(int id){
        prepo.deleteById(id);
    }
    public Plan updateplan(int id,Plan updatedplan){
        Optional<Plan> b=prepo.findById(id);
        if(b.isPresent()){
            Plan oldplan=b.get();
            oldplan.setStatus(updatedplan.getStatus());
            oldplan.setCreated_date(updatedplan.getCreated_date());
            oldplan.setCreated_by(updatedplan.getCreated_by());
            oldplan.setCompleted_date(updatedplan.getCompleted_date());
            oldplan.setDistance(updatedplan.getDistance());
            return prepo.save(oldplan);
        }
        else{
            throw new NoSuchElementException("Plan not found with id: " + id);
        }
    }
}
