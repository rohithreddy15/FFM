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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }

    public Date getCreated_date() {
        return Created_date;
    }

    public void setCreated_date(Date created_date) {
        Created_date = created_date;
    }

    public int getCreated_by() {
        return Created_by;
    }

    public void setCreated_by(int created_by) {
        Created_by = created_by;
    }

    public Date getCompleted_date() {
        return Completed_date;
    }

    public void setCompleted_date(Date completed_date) {
        Completed_date = completed_date;
    }

    public float getDistance() {
        return Distance;
    }

    public void setDistance(float distance) {
        Distance = distance;
    }

    @Column
    float Distance;

}
