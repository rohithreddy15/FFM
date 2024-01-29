package com.audintel.service;

import com.audintel.dao.Dealer;
import com.audintel.dao.Visit_info;
import com.audintel.repository.Visit_inforepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class Visit_infoservice {
    @Autowired
    Visit_inforepository vrepo;
    public Visit_info savevisit(Visit_info v){
        return vrepo.save(v);
    }
    public Visit_info getvisit(int id){
        Optional<Visit_info> b= vrepo.findById(id);
        return b.orElse(null);
    }
    public void deletevisit(int id){
        vrepo.deleteById(id);
    }
    public Visit_info updatevisit(int id,Visit_info updatedvisit){
        Optional<Visit_info> b=vrepo.findById(id);
        if(b.isPresent()){
            Visit_info oldvisit=b.get();
            oldvisit.setId(updatedvisit.getId());
            oldvisit.setFrom_latitude(updatedvisit.getFrom_latitude());
            oldvisit.setFrom_longitude(updatedvisit.getFrom_longitude());
            oldvisit.setDistancetravelled(updatedvisit.getDistancetravelled());
            oldvisit.setTo_latitude(updatedvisit.getTo_latitude());
            oldvisit.setTo_longitude(updatedvisit.getTo_longitude());
            return vrepo.save(oldvisit);
        }
        else{
            throw new NoSuchElementException("Visit not found with id: " + id);
        }
    }
    float distance(int id){
        Visit_info obj= vrepo.findByTask_Id(id);
        float dis=calculatedistance(obj.getFrom_latitude(),obj.getFrom_longitude(),obj.getTo_latitude(),obj.getTo_longitude());
        return dis;
    }
    public float calculatedistance(float fromlatitude,float fromlongitude,float tolatitude,float tolongitude){
        int earthRadius = 6371;

        float dLat = (float) Math.toRadians(tolatitude - fromlatitude);
        float dLon = (float) Math.toRadians(tolongitude - fromlongitude);

        float a = (float) (Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(Math.toRadians(fromlatitude)) * Math.cos(Math.toRadians(tolatitude)) *
                        Math.sin(dLon / 2) * Math.sin(dLon / 2));

        float c = 2 * (float) Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return earthRadius * c;
    }

}
