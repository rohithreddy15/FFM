package com.audintel.dao;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column
    Boolean status;



    @Column
    int empid;
    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public Date getCompleted_date() {
        return completed_date;
    }

    public void setCompleted_date(Date completed_date) {
        this.completed_date = completed_date;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    @Column
    Date created_date;
    @Column
    int created_by;
    @Column
    Date completed_date;
    @Column
    float distance;

}
