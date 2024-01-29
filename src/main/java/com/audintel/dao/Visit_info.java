package com.audintel.dao;

import jakarta.persistence.*;


@Entity
@Table(name="visit_info")
public class Visit_info {

    @Column(name = "taskid")
   private  int taskid;
    @Id
    int id;
    public int getTaskId() {
        return taskid;
    }

    public void setTaskId(int taskid) {
        this.taskid = taskid;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public float getDistancetravelled() {
        return distancetravelled;
    }

    public void setDistancetravelled(float distancetravelled) {
        this.distancetravelled = distancetravelled;
    }

    public float getFrom_latitude() {
        return from_latitude;
    }

    public void setFrom_latitude(float from_latitude) {
        this.from_latitude = from_latitude;
    }

    public float getFrom_longitude() {
        return from_longitude;
    }

    public void setFrom_longitude(float from_longitude) {
        this.from_longitude = from_longitude;
    }

    public float getTo_latitude() {
        return to_latitude;
    }

    public void setTo_latitude(float to_latitude) {
        this.to_latitude = to_latitude;
    }

    public float getTo_longitude() {
        return to_longitude;
    }

    public void setTo_longitude(float to_longitude) {
        this.to_longitude = to_longitude;
    }


    @Column
    float distancetravelled;
    @Column
    float from_latitude;
    @Column
    float from_longitude;
    @Column
    float to_latitude;
    @Column
    float to_longitude;
}
