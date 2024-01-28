package com.audintel.dao;

import jakarta.persistence.*;
import org.hibernate.annotations.CollectionId;

import java.util.Date;

@Entity
public class Task {
   @OneToOne(mappedBy = "task", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
   private Visit_info visitInfo;
    @Id
    int id;
    @Column
    int created_by;
    @Column
    int assigned_to;
    @Column
    int dealerid;
    @Column
    String description;
    @Column
    Boolean status;
    @Column
    Date assigned_date;
    @Column
    Date completed_date;
    public Visit_info getVisitInfo() {
        return visitInfo;
    }

    public void setVisitInfo(Visit_info visitInfo) {
        this.visitInfo = visitInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public int getAssigned_to() {
        return assigned_to;
    }

    public void setAssigned_to(int assigned_to) {
        this.assigned_to = assigned_to;
    }

    public int getDealerid() {
        return dealerid;
    }

    public void setDealerid(int dealerid) {
        this.dealerid = dealerid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getAssigned_date() {
        return assigned_date;
    }

    public void setAssigned_date(Date assigned_date) {
        this.assigned_date = assigned_date;
    }

    public Date getCompleted_date() {
        return completed_date;
    }

    public void setCompleted_date(Date completed_date) {
        this.completed_date = completed_date;
    }
}


