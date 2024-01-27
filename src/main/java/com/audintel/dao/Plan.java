package com.audintel.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Plan {
    @Id
    int id;
    @Column
    Boolean Status;
    @Column
    Date Created_date;
    @Column
    int Created_by;
    @Column
    Date Completed_date;
    @Column
    float Distance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public void setStatus(Boolean status) {
        this.Status = status;
    }
    public Boolean getStatus() {
        return Status;
    }

    public Date getCreated_date() {
        return Created_date;
    }

    public void setCreated_date(Date created_date) {
        this.Created_date = created_date;
    }

    public int getCreated_by() {
        return Created_by;
    }

    public void setCreated_by(int created_by) {
        this.Created_by = created_by;
    }

    public Date getCompleted_date() {
        return Completed_date;
    }

    public void setCompleted_date(Date completed_date) {
        this.Completed_date = completed_date;
    }

    public float getDistance() {
        return Distance;
    }

    public void setDistance(float distance) {
        this.Distance = distance;
    }





}
