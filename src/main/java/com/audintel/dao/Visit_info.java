package com.audintel.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Visit_info {
    @Id
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public float getDistance_travelled() {
        return distance_travelled;
    }

    public void setDistance_travelled(float distance_travelled) {
        this.distance_travelled = distance_travelled;
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
    int task_id;
    @Column
    float distance_travelled;
    @Column
    float from_latitude;
    @Column
    float from_longitude;
    @Column
    float to_latitude;
    @Column
    float to_longitude;
}
